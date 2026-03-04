public class TestaConta {
    public static void main(String[] args) {

        // cria instância c1
        Conta c1 = new Conta(1234, 5678, "João Silva");
        System.out.println("--- Instância c1 criada ---");
        System.out.println(c1);

        // deposita
        c1.depositar(500);
        System.out.println("--- Deposito de 500 ---");
        System.out.println(c1);

        // saca
        c1.sacar(200);
        System.out.println("--- Saque de 200 ---");
        System.out.println(c1);

        // cria instância c2
        System.out.println("--- Instância c2 criada ---");
        Conta c2 = new Conta(8765, 4321, "Maria Souza");
        System.out.println(c2);

        // tenta sacar
        System.out.println("--- Tentativa de saque c2 ---");
        c2.sacar(500);

        // tenta encerrar conta c1
        System.out.println("\n--- Tentativa de encerrar conta c1 ---");
        c1.encerrarConta();

        // saca o saldo restante
        c1.sacar(300);
        System.out.println("\n--- Conta c1 encerrada ---");
        c1.encerrarConta();

        // encerra a conta c1
        System.out.println("\n--- Estado conta c1 ---");
        System.out.println(c1);
    }
}
