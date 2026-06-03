package dc.unifacef.produtos_api.service;

import dc.unifacef.produtos_api.model.ProdutoFisico;
import dc.unifacef.produtos_api.model.ProdutoVirtual;
import dc.unifacef.produtos_api.repository.ProdutoVirtualRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProdutoVirtualService {

    private ProdutoVirtualRepository repository;

    public ProdutoVirtualService(ProdutoVirtualRepository repository) {
        this.repository = repository;
    }

    // lista todos os produtos FÍSICOS
    public List<ProdutoVirtual> listar() {
        return repository.findAll();
    }

    public Optional<ProdutoVirtual> buscar(Long id) {
        return repository.findById(id);
    }

    // insere um novo produto físico na tabela produtos e produtos_fisicos
    @Transactional
    public ProdutoVirtual inserir(ProdutoVirtual pv) {
        return repository.save(pv);
    }

    @Transactional
    public boolean deletar(Long id) {
        if (repository.existsById(id)) {
            repository.deleteById(id);
            return true;
        }
        return false;
    }
}