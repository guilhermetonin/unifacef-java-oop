package dc.unifacef.db.controller;

import dc.unifacef.db.model.Produto;
import dc.unifacef.db.service.ProdutoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;
import java.util.Optional;

@RestController // ele recebe as requisições HTTP
@RequestMapping("/produtos")
public class ProdutoController {

    // usar o objeto da classe ProdutoService - injeção de dependência
    private ProdutoService service;

    public ProdutoController(ProdutoService service) {
        this.service = service;
    }

    // ResponseEntity = retornar diferentes statusCode
    @GetMapping
    public ResponseEntity<List<Produto>> listar() {
        return ResponseEntity.ok(service.listar()); // statusCode = 200
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Produto>> buscarPorId(@PathVariable  Long id) {
        Optional<Produto> prod = service.buscarPorId(id);
        if (prod.isEmpty()) {
            // produto não existe
            return ResponseEntity.notFound().build(); // statusCode = 400
        }
        // retorna o produto encontrado
        return ResponseEntity.ok(prod); // statusCode = 200
    }

    @PostMapping
    public ResponseEntity<Produto> salva(@RequestBody Produto produto) {
        Produto novo = service.salva(produto);
        if (novo != null) {
            // uniform resource identifier
            URI uri = URI.create("/produtos" + novo.getId());
            return ResponseEntity.created(uri).body(novo); // statusCode = 201
        }
        return ResponseEntity.noContent().build(); // statusCode = 204
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> remove(@PathVariable Long id) {
        if (service.remove(id)) {
            return ResponseEntity.noContent().build(); // statusCode = 204
        }
        return ResponseEntity.notFound().build(); // statusCode = 404
    }

    @PatchMapping("/{id}")
    public ResponseEntity<Produto> atualiza(@PathVariable Long id, @RequestBody Produto alterado) {
        Produto resposta = service.atualiza(id, alterado);
        if (resposta != null) {
            return ResponseEntity.ok(resposta);
        }
        return ResponseEntity.notFound().build();
    }
}
