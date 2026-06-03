package dc.unifacef.produtos_api.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity // essa classe representa uma tabela
@Table(name = "categorias") // define o nome da tabela da tabela no banco de dados
public class Categoria {

    @Id // marca a variável abaixo como chave primária
    @GeneratedValue(strategy = GenerationType.IDENTITY) // id auto-incrementavel
    private Long id;

    @Column(nullable = false) // torna o campo obrigatório, não aceita nulo
    private String nome;

    // @OneToMany, define o relacionamento "1 para muitos"
    // mappedBy, indica qual campo na classe Produto mapeia esse relacionamento
    // cascade, se deletar a categoria, faz o mesmo com os seus produtos
    @OneToMany(mappedBy = "categoria", cascade = CascadeType.ALL)
    @JsonIgnoreProperties("categoria")
    private List<Produto> produtos = new ArrayList<>();
    public Categoria() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }
}
