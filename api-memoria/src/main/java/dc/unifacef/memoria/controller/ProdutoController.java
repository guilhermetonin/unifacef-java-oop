package dc.unifacef.memoria.controller;

// "ouve" as requisições que chegam e chama o Service

import dc.unifacef.memoria.model.Produto;
import dc.unifacef.memoria.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RestController // transforma a classe em um controlador REST, podendo enviar respostas em JSON
@RequestMapping("/produto") // define a URL base, toda chamada começará com "/produto"
public class ProdutoController {

    // injeção de dependência
    // permite chamar métodos do Service sem instanciá-lo
    @Autowired
    private ProdutoService service;


    // mapeia o GET para listar dados
    @GetMapping
    // ResponseEntity é um tipo de dado de retorno do Controller par FrontEnd
    public ResponseEntity<List<Produto>> consulta() {
        return ResponseEntity.ok(service.consulta()); // ok (sucesso) chama a lógica do Service
    }

    // cria recursos quando recebe um POST
    @PostMapping
    public ResponseEntity<Produto> cria(@RequestBody Produto produto) {
        // @RequestBody converte o JSON em objeto
        Produto novo = service.cria(produto);
        URI uri = URI.create("/produto/" + novo.getId()); // cria o link do novo recurso

        return ResponseEntity.created(uri).body(novo);
    }

    @DeleteMapping("/{id}") // define o DELETE e espera um ID na URL
    public ResponseEntity<Void> remove(@PathVariable Long id) { // @PathVariable captura o ID vindo da URL
        if (service.remove(id)) { // chama o metodo do Service que executa o remove
            return ResponseEntity.noContent().build(); // sucesso (204) e não exibe nada
        } else {
            return ResponseEntity.notFound().build(); // erro cliente (404) o ID não foi encontrado
        }
    }

    @PatchMapping("/{id}")
    public ResponseEntity<Produto> atualiza(@PathVariable Long id, @RequestBody Produto produto) {
        // @PathVariable: identifica qual produto será editado pelo ID
        // @RequestBody: recebe os novos dados do produto via JSON
        Produto resposta = service.atualiza(id, produto);
        if (resposta != null) {
            // atuailizou e retornou o produto atualizado
            return ResponseEntity.ok(resposta); // sucesso (200)
        } else {
            // não foi atualizado
            return ResponseEntity.notFound().build(); // erro notFound (404)
        }
    }
}
