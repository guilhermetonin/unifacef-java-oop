public class TestaStreaming {
    static void main(String[] args) {

        Streaming st1 = new Streaming("Guilherme", "Premium"); // cria uma nova instância
        st1.cancelarAssinatura(); // cancela a assinatura
        st1.cancelarAssinatura(); // testa cancelar uma conta já inativa
        st1.assistirFilme("Scarface"); // testa assistir filme com a conta inativa
        System.out.println(st1); // exibe na tela
    }
}
