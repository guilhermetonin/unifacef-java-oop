package dc.unifacef.db.repository;

import dc.unifacef.db.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {

    // essa interface vai conter os métodos de CRUD da tabela produto
    // save(), findAll(), findById(), remove(), existsById(), count()

}