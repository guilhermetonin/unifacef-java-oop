package atividades.TodoParte.VendasSupermercado.modelo;

import java.util.ArrayList;
import java.util.List;

public class Venda {
    private int id;
    private Cliente cliente;
    private List<ItemVenda> listaItens;

    public Venda(Cliente cliente) {
        this.setId();
        this.cliente = cliente;
        this.listaItens = new ArrayList<>();
    }

    public void setId() {
        this.id = (int) (Math.random() * 10) + 1;
    }

    public void adicionarItemVenda(Produto produto,  int quantidade) {
        listaItens.add(new ItemVenda(produto, quantidade));
    }

    public double calcularTotal() {
        double soma = 0;
        for (ItemVenda item : listaItens) {
            soma += item.getProduto().getPreco() * item.getQuantidade();
        }
        return soma;
    }

    @Override
    public String toString() {
        return "Venda{" +
                "id=" + id +
                ", cliente=" + cliente +
                ", listaItens=" + listaItens +
                '}';
    }
}
