package atividades.TodoParte.VendasSupermercado.modelo;

public class Produto {
    private int id;
    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        this.setId();
        this.nome = nome;
        this.preco = preco;
    }

    public void setId() {
        this.id = (int) (Math.random() * 10) + 1;
    }

    public double getPreco() {
        return preco;
    }

    @Override
    public String toString() {
        return "\nProduto{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", preco=" + preco +
                '}';
    }
}
