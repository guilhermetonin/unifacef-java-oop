package atividades.ClasseInterface.CasaInteligente;

public class TermostatoSmart implements DispositivoLigavel, SensorTemperatura {
    private boolean ligado;

    public TermostatoSmart() {
    }

    @Override
    public void ligar() {
        this.ligado = true;
        System.out.println("TermostatoSmart ligado.");
    }

    @Override
    public void desligar() {
        this.ligado = false;
        System.out.println("TermostatoSmart desligado.");
    }

    @Override
    public double lerTemperatura() {
        if (this.ligado) {
            return Math.random() * 100;
        }
        System.out.println("Erro na leitura. Dispositivo desligado.");
        return 0;
    }
}
