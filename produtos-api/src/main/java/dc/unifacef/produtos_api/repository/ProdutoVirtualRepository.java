package dc.unifacef.produtos_api.repository;

import dc.unifacef.produtos_api.model.ProdutoVirtual;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoVirtualRepository extends JpaRepository<ProdutoVirtual, Long> {
}
