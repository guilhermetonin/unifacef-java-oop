package dc.unifacef.produtos_api.service;

import dc.unifacef.produtos_api.model.ProdutoFisico;
import dc.unifacef.produtos_api.repository.ProdutoFisicoRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProdutoFisicoService {

    private ProdutoFisicoRepository repository;

    public ProdutoFisicoService(ProdutoFisicoRepository repository) {
        this.repository = repository;
    }

    // lista todos os produtos FÍSICOS
    public List<ProdutoFisico> listar() {
        return repository.findAll();
    }

    public Optional<ProdutoFisico> buscar(Long id) {
        return repository.findById(id);
    }

    // insere um novo produto físico na tabela produtos e produtos_fisicos
    @Transactional
    public ProdutoFisico inserir(ProdutoFisico pf) {
        return repository.save(pf);
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