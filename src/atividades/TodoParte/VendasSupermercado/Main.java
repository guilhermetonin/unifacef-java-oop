package atividades.TodoParte.VendasSupermercado;

import atividades.TodoParte.VendasSupermercado.modelo.Cliente;
import atividades.TodoParte.VendasSupermercado.modelo.Produto;
import atividades.TodoParte.VendasSupermercado.modelo.Venda;

public class Main {
    static void main() {

        Cliente cliente = new Cliente("Guilherme");
        Produto mouse = new Produto("Mouse", 10.50);

        Venda venda = new Venda(cliente);

        venda.adicionarItemVenda(mouse, 2);

        System.out.println(venda);

        System.out.println("Preço total: " + venda.calcularTotal());
    }
}
