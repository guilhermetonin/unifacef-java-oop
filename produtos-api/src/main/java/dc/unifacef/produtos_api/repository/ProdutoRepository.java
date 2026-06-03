package dc.unifacef.produtos_api.repository;

import dc.unifacef.produtos_api.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {
    // o spring interpreta o nome do metodo e gera um sql "SELECT * FROM produtos WHERE nome = ?"
    List<Produto> findByNome(String nome);
}
