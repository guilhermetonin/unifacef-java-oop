package ClasseInterface;

public class Pix implements Pagamento {

    @Override
    public void autorizar(double valor) {
        System.out.println("Gerando QR-Code para a chave Pix...");
        System.out.println("Pagamento no valor de R$ " + valor + " foi enviado instantaneamente.");

    }

    @Override
    public void exibirComprovante() {
        System.out.println("Comprovante disponível no app do banco.");
    }
}
