package modelo;

import java.util.ArrayList;
import java.util.Date;

public class Pedido {
    private int id;
    private Date data;
    private Cliente cliente; // associação todo-parte
    private ArrayList<ItemPedido> ListaItensPedido;

    public Pedido() {
        this.ListaItensPedido = new ArrayList<>();
    }
    public Pedido(int id, Date data, Cliente cliente) {
        this.id = id;
        this.data = data;
        this.cliente = cliente;
        this.ListaItensPedido = new ArrayList<>();
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getData() {
        return this.data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Cliente getCliente() {
        return this.cliente;
    }

    // nesse caso o cliente veio pronto, mostrando a sua independência do pedido
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return String.format("""
                id: %d
                data: %s
                cliente: %s
                itens pedidos: %s
                """, this.id, this.data, this.cliente, this.ListaItensPedido);
    }

    // adiciona um item de pedido no vetor ou no pedido
    public void adicionaItemPedido(int id, int qtde, Produto produto) {
        ItemPedido aux = new ItemPedido(id, qtde, produto);
        ListaItensPedido.add(aux);
        System.out.println("Item do pedido adicionado com sucesso.");

    }

    // calcula o preco total
    public float calculaTotalPedido() {
        float precoTotal = 0;
        for (ItemPedido item: ListaItensPedido) {;
            Produto produto = item.getProduto();
            float preco = produto.getPreco();
            int qtde = item.getQtde();
            precoTotal += (preco * qtde);
        }
        System.out.printf("Preço total: R$ %.2f %n", precoTotal);
        return precoTotal;
    }
}
