package dc.unifacef.produtos_api.service;

import dc.unifacef.produtos_api.model.Produto;
import dc.unifacef.produtos_api.repository.ProdutoRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProdutoService {

    private ProdutoRepository repository;

    public ProdutoService(ProdutoRepository repository) {
        this.repository = repository;
    }

    // listar todos os produtos
    public List<Produto> listar () {
        return repository.findAll();
    }

    // buscar por id
    public Optional<Produto> buscar(Long id) {
        return repository.findById(id);
    }

    // inserir um novo produto
    @Transactional
    public Produto inserir(Produto p) {
        return repository.save(p);
    }

    // remover um produto do banco
    @Transactional
    public boolean deletar(Long id) {
        if (repository.existsById(id)) {
            repository.deleteById(id);
            return true;
        }
        return false;
    }

}
