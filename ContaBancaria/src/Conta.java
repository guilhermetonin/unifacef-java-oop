public class Conta {
    public int numeroConta;
    public int agencia;
    public String nomeCliente;
    public double saldo;
    public boolean status;

    public Conta(int numeroConta, int agencia, String nomeCliente) {
        this.numeroConta = numeroConta;
        this.agencia = agencia;
        this.nomeCliente = nomeCliente;
        this.saldo = 0;
        this.status = true;
    }

    public void depositar(double valor) {
        if (this.status) {
            if (valor > 0) {
                this.saldo += valor;
            } else {
                System.out.println("Informe um valor positivo para depositar");
            }
        } else {
            System.out.println("Não é possível. Conta inativa.");
        }
    }

    public void sacar(double valor) {
        if (this.status) {
            if (this.saldo >= valor) {
                this.saldo -= valor;
            } else {
                System.out.println("Saldo insuficiente em conta");
            }
        } else {
            System.out.println("Não é possível. Conta inativa.");
        }
    }

    public void encerrarConta() {
        if (this.status) {
            if (this.saldo == 0) {
                System.out.println("Conta encerrada com sucesso.");
                this.status = !this.status ;
            } else {
                System.out.println("É preciso sacar todo o saldo para encerrar a conta.");
            }
        } else {
            System.out.println("Conta inativa. Já está encerrada.");
        }
    }

    public String toString() {
        String estado = this.status ? "Ativa" : "Encerrada";
        return String.format("""
                Número da conta: %d
                Agência: %d
                Nome do cliente: %s
                Saldo atual: R$ %.2f
                Status: %s
                """, this.numeroConta, this.agencia, this.nomeCliente, this.saldo, estado);
    }
}
