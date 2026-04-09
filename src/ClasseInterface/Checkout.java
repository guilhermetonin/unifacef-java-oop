package ClasseInterface;

public class Checkout {
    static void main(String[] args) {

        Pagamento camaleao;

        System.out.println("\n---cartao credito---");
        camaleao = new CartaoCredito();
        camaleao.autorizar(100);
        camaleao.exibirComprovante();

        System.out.println("\n---pix---");
        camaleao = new Pix();
        camaleao.autorizar(500);
        camaleao.exibirComprovante();

    }
}
