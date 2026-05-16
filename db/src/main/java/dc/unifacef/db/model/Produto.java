import jakarta.persistence.*;

@Entity // marca como entidade JPA → cria tabela
@Table(name = "produtos") // define o nome exato da tabela

public class Produto {
    @Id // chave primária da tabela
    @GeneratedValue(strategy = GenerationType.IDENTITY) // IDENTITY → auto increment do banco

    private Long id;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false)
    private Double preco;

    @Column(length = 500)
    private String descricao;
}