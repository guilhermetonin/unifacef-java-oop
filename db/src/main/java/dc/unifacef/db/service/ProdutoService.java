package dc.unifacef.db.service;

import dc.unifacef.db.model.Produto;
import dc.unifacef.db.repository.ProdutoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProdutoService {
    // a injeção de dependência será pelo construtor
    private ProdutoRepository repo;

    public ProdutoService(ProdutoRepository repo){
        this.repo = repo;
    }

    // cria ou insere o produto no banco de dados
    public Produto salva(Produto produto) {
        return repo.save(produto); // ** não tem id, ele faz insert
    }

    // listar os produtos da tabela produtos
    public List<Produto> listar(){
        return repo.findAll();
    }

    // listar os produtos da tabela produtos por um id
    public Optional<Produto> buscarPorId(Long id){
        return repo.findById(id); // pode ou não retornar um produto
    }

    // remove um produto da tabela produtos
    public boolean remove(Long id) {
        if (repo.existsById(id)) {
            repo.deleteById(id);
            return true; // remove
        }
        return false; // não remove
    }

    // atualiza um produto por um id e o produto alterado
    public Produto atualiza(Long id, Produto alterado) {
        if (repo.existsById(id)) {
            // produto existe para atualizar
            alterado.setId(id);
            return repo.save(alterado); // ** como o alterado tem id, ele faz update
        }
        return null; // produto não existe
    }
}
