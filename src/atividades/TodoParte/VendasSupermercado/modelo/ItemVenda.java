package atividades.TodoParte.VendasSupermercado.modelo;

public class ItemVenda {
    private int id;
    private Produto produto;
    private int quantidade;

    public ItemVenda(Produto produto, int quantidade) {
        this.setId();
        this.produto = produto;
        this.quantidade = quantidade;
    }

    public void setId() {
        this.id = (int) (Math.random() * 10) + 1;
    }

    public Produto getProduto() {
        return produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    @Override
    public String toString() {
        return "\nItemVenda{" +
                "id=" + id +
                ", produto=" + produto +
                ", quantidade=" + quantidade +
                '}';
    }
}
