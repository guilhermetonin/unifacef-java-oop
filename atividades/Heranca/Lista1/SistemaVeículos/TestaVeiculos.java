package atividades.Heranca.Lista1.SistemaVeículos;

public class TestaVeiculos {
    static void main(String[] args) {

        Aviao boeing = new Aviao("Boeing", "747", 10.5, 100);
        CarroEletrico byd = new CarroEletrico("BYD", "Seal", 120, 97);

        System.out.println("\nAvião: ");
        Veiculo veiculo = new Aviao("Airbus", "A320", 200, 800);
        veiculo.mover();

        System.out.println("\nCarro Elétrico: ");
        veiculo = new CarroEletrico("BMW", "i7", 98, 12);
        veiculo.mover();
    }
}
