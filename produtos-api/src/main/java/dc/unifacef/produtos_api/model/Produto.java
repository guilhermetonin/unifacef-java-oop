package dc.unifacef.produtos_api.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

@Entity
@Table(name = "produtos")
// @Inheritance, configura a estratégia de herança
// InheritanceType.JOINED, cria tabelas separadas para as filhas, unidas pelo ID
@Inheritance(strategy = InheritanceType.JOINED)
// @DiscriminatorColumn, cria uma coluna invisível no código chamada "tipo" no banco
// ela serve para registrar se aquela linha é um produto 'fisico' ou 'virtual'
@DiscriminatorColumn(name = "tipo", discriminatorType = DiscriminatorType.STRING)

public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false)
    private Double preco;

    @Column(nullable = false)
    private String descricao;

    @ManyToOne // define que MUITOS produtos pertencem a UMA categoria
    @JoinColumn(name = "categoria_id") // cria a coluna de conexão na tabela (chave estrangeira)
    @JsonIgnoreProperties("produtos") // evita loop infinito
    private Categoria categoria;

    public Produto() {
    }

    // getters e setters
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

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
}
