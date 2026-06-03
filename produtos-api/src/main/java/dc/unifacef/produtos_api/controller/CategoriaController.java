package dc.unifacef.produtos_api.controller;

import dc.unifacef.produtos_api.model.Categoria;
import dc.unifacef.produtos_api.service.CategoriaService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RestController // diz ao Spring que esta classe é um controlador REST que vai retornar JSON
@RequestMapping("/categorias") // define a URL base que este controlador vai escutar
public class CategoriaController {

    private CategoriaService service;

    // Injeção de Dependência
    public CategoriaController(CategoriaService service) {
        this.service = service;
    }

    // listar todas (GET /categorias)
    @GetMapping
    public ResponseEntity<List<Categoria>> listar() {
        return ResponseEntity.ok(this.service.listar()); // retorna o status 200, junto com a lista
    }


    // buscar por id (GET /categorias/{id})
    @GetMapping("/{id}") // {id} é uma variável que muda na URL (/categorias/X)
    public ResponseEntity<Categoria> buscar(@PathVariable Long id) { // @PathVariable captura o ID da URL
        return service.buscar(id)
                .map(categoria -> ResponseEntity.ok(categoria)) // se achar, retorna 200, com a categoria
                .orElse(ResponseEntity.notFound().build()); // se não achar, retorna 404 Not Found
    }

    // inserir uma categoria (POST /categorias)
    @PostMapping
    public ResponseEntity<Categoria> criar(@RequestBody Categoria c) { // @RequestBody converte o JSON recebido em Objeto Java
        Categoria novo = service.inserir(c);

        // cria o caminho (URI) do novo recurso criado (/categorias/id)
        URI uri = URI.create("/categorias/" + novo.getId());

        // retorna status 201 com a URL no cabeçalho e o objeto no corpo
        return ResponseEntity.created(uri).body(novo);
    }

    // deletar categoria (DELETE /categorias/{id})
    @DeleteMapping("/{id}")
    public ResponseEntity<Categoria> deletar(@PathVariable Long id) {
        if (service.deletar(id)) {
            return ResponseEntity.noContent().build(); // se deletou, retorna 204 No Content
        }
        return ResponseEntity.notFound().build(); // se não existia, retorna 404 Not Found
    }
}
