package dc.unifacef.produtos_api.model;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "produtos_virtuais")
// @DiscriminatorValue, coloca o texto "virtual" na coluna "tipo" da tabela pai
@DiscriminatorValue("virtual")
public class ProdutoVirtual extends Produto {

    private boolean pago;

    public ProdutoVirtual() {
    }

    // getters e setters
    public boolean isPago() {
        return pago;
    }

    public void setPago(boolean pago) {
        this.pago = pago;
    }
}
