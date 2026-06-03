package dc.unifacef.produtos_api.repository;

import dc.unifacef.produtos_api.model.ProdutoFisico;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoFisicoRepository extends JpaRepository<ProdutoFisico, Long> {
}
