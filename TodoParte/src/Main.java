import modelo.Cliente;
import modelo.Pedido;
import modelo.Produto;
import java.util.Date;

public class Main {
    static void main(String[] args) {

        // cria um objeto da classe modelo.Cliente independente
        Cliente cl1 = new Cliente(1 ,"Fulano", "1234", "Rua X");

        // cria objeto todo
        Pedido pd1 = new Pedido(1, new Date(), cl1);

        // cria objetos da classe modelo.Produto
        Produto pr1 = new Produto(1, "Mouse", 180);
        Produto pr2 = new Produto(2, "Monitor", 900);
        Produto pr3 = new Produto(3, "Teclado", 80);

        //
        pd1.adicionaItemPedido(1, 5, pr1);
        pd1.adicionaItemPedido(2, 2, pr2);
        pd1.adicionaItemPedido(3, 1, pr3);

        System.out.println(pd1);

        float preco = pd1.calculaTotalPedido();

    }
}
