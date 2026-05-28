package dc.unifacef.db.controller;

import dc.unifacef.db.model.Produto;
import dc.unifacef.db.service.ProdutoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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
}
