package dc.unifacef.produtos_api.controller;

import dc.unifacef.produtos_api.model.ProdutoFisico;
import dc.unifacef.produtos_api.service.ProdutoFisicoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/produtos/fisicos") // http://localhost:8080/produtos/fisicos
public class ProdutoFisicoController {

    private ProdutoFisicoService service;

    public ProdutoFisicoController(ProdutoFisicoService service) {
        this.service = service;
    }

    // listar apenas produtos físicos (GET /produtos/fisicos)
    @GetMapping
    public ResponseEntity<List<ProdutoFisico>> listar() {
        return ResponseEntity.ok(service.listar());
    }

    // buscar produto físico por id (GET /produtos/fisicos)
    @GetMapping("/{id}")
    public ResponseEntity<ProdutoFisico> buscar(@PathVariable long id) {
        return service.buscar(id)
                .map(p -> ResponseEntity.ok(p))
                .orElse(ResponseEntity.notFound().build());
    }

    // inserir produto físico (POST /produtos/fisicos)
    @PostMapping
    public ResponseEntity<ProdutoFisico> inserir(@RequestBody ProdutoFisico pf) {
        ProdutoFisico novo = service.inserir(pf);
        URI uri = URI.create("/produtos/fisicos/" + novo.getId());
        return ResponseEntity.created(uri).body(novo);
    }

    // deletar produto físico (DELETE /produtos/fisicos/{id})
    @DeleteMapping("/{id}")
    public ResponseEntity<ProdutoFisico> deletar(@PathVariable long id) {
        if (service.deletar(id)) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.notFound().build();
    }
}