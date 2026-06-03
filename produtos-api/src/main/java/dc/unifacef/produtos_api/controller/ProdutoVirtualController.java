package dc.unifacef.produtos_api.controller;

import dc.unifacef.produtos_api.model.ProdutoVirtual;
import dc.unifacef.produtos_api.service.ProdutoVirtualService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/produtos/virtuais")
public class ProdutoVirtualController {

    private final ProdutoVirtualService service;

    public ProdutoVirtualController(ProdutoVirtualService service) {
        this.service = service;
    }

    // (GET /produtos/virtuais)
    @GetMapping
    public ResponseEntity<List<ProdutoVirtual>> listar() {
        return ResponseEntity.ok(service.listar());
    }

    // (GET /produtos/virtuais/{id})
    @GetMapping("/{id}")
    public ResponseEntity<ProdutoVirtual> buscar(@PathVariable Long id) {
        return service.buscar(id)
                .map(pv -> ResponseEntity.ok(pv))
                .orElse(ResponseEntity.notFound().build());
    }

    // (POST /produtos/virtuais)
    @PostMapping
    public ResponseEntity<ProdutoVirtual> inserir(@RequestBody ProdutoVirtual pv) {
        ProdutoVirtual novo = service.inserir(pv);
        URI uri = URI.create("/produtos/virtuais/" + novo.getId());
        return ResponseEntity.created(uri).body(novo);
    }

    // (DELETE /produtos/virtuais/{id})
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        if (service.deletar(id)) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.notFound().build();
    }
}
