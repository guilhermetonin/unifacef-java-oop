package dc.unifacef.produtos_api.model;


import jakarta.persistence.DiscriminatorColumn;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "produtos_fisicos")
// @DiscriminatorValue, coloca o texto "fisico" na coluna "tipo" da tabela pai
@DiscriminatorValue("fisico")
public class ProdutoFisico extends Produto {

    private Float peso;

    public ProdutoFisico() {
    }

    // getters e setters
    public Float getPeso() {
        return peso;
    }

    public void setPeso(Float peso) {
        this.peso = peso;
    }
}
