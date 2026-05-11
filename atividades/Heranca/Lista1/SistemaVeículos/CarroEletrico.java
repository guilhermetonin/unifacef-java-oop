package atividades.Heranca.Lista1.SistemaVeículos;

public class CarroEletrico extends Veiculo {
    private int autonomiaBateria;

    public CarroEletrico() {
        super();
    }

    public CarroEletrico(String marca, String modelo, double velocidade, int autonomiaBateria) {
        super(marca, modelo, velocidade);
        this.autonomiaBateria = autonomiaBateria;
    }

    @Override
    public void mover() {
        System.out.println("Carro elétrico movendo-se silenciosamente");
    }

    @Override
    public void abastecer() {
        System.out.println("Recarregando bateria em posto de carga rápida");
    }

    @Override
    public String toString() {
        return "CarroEletrico{" +
                "autonomiaBateria=" + autonomiaBateria +
                '}';
    }
}
