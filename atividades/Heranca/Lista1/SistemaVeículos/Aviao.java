package atividades.Heranca.Lista1.SistemaVeículos;

public class Aviao extends Veiculo {
    private double altitudeMax;

    public Aviao() {
        super();
    }

    public Aviao(String marca, String modelo, double velocidade, double altitudeMax) {
        super(marca, modelo, velocidade);
        this.altitudeMax = altitudeMax;
    }

    @Override
    public void mover() {
        System.out.println("Avião voando a " + this.velocidade + " km/h e " + this.altitudeMax + " metros");
    }

    @Override
    public void abastecer() {
        System.out.println("Abastecendo com querosene de aviação");
    }

    @Override
    public String toString() {
        return "Aviao{" +
                "altitudeMax=" + altitudeMax +
                '}';
    }
}
