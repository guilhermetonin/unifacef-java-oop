package atividades.Encapsulamento.SistemaArCondicionado;

public class ArCondicionado {
    private String marca;
    private String modelo;
    private int temperatura;
    private boolean ligado;

    public ArCondicionado() {
        this.marca = "Generico";
        this.modelo = "Standard";
        this.temperatura = 24;
        this.ligado = false;
    }

    public ArCondicionado(String marca, String modelo, int temperatura) {
        this.setMarca(marca); // encapsulamento, valida a marca antes de atribuir
        this.modelo = modelo; // atribuição direta, sem regras
        this.setTemperatura(temperatura); // encapsulamento, valida a temperatura antes de atribuir
        this.ligado = false; // inícia desligado
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        if (marca.length() >= 3) {
            this.marca = marca;
        } else {
            System.out.println("A marca deve conter pelos menos 3 caracteres.");
            this.marca = "Generico";
        }

    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getTemperatura() {
        return this.temperatura;
    }

    public void setTemperatura(int t) {
        if (t >= 16 && t <= 30) {
            this.temperatura = t;
        } else {
            System.out.println("Temperatura fora da faixa.");
        }
    }

    public boolean isLigado() {
        return this.ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public void ligar() {
        if (this.ligado) {
            System.out.println("O Ar-Condicionado já está ligado.");
        } else {
            System.out.println("Ligando o Ar-Condicionado...");
            this.ligado = true;
        }
    }

    public void desligar() {
        if (this.ligado) {
            System.out.println("Desligando o Ar-Condicionado...");
            this.ligado = false;
        } else {
            System.out.println("O Ar-Condicionado já está desligado.");
        }
    }

    public void ajustarTemperatura(int novaTemp) {
        if (this.ligado) {
            this.setTemperatura(novaTemp);
        } else {
            System.out.println("Ligue o Ar-Condicionado antes de ajustar a temperatura.");
        }
    }

    public void ativarModoTurbo() {
        if (this.ligado) {

            if (verificarCompressor()) {
                System.out.println("Ativando ModoTurbo...");
                this.setTemperatura(16);
            } else {
                System.out.println("Houve uma falha técnica no seu ar.");
            }

        } else System.out.println("Ligue o Ar-Condicionado antes para ativar o Modo Turbo.");
    }


    public boolean verificarCompressor() {
        int random = (int) (Math.random() * 10);
        return (random > 2);
    }

    @Override
    public String toString() {
        String estado = this.ligado ? "Ligado" : "Desligado";
        return String.format("""
                Marca: %s
                Modelo: %s
                Temperatura: %d
                Estado atual: %s
                """, this.marca, this.modelo, this.temperatura, estado);
    }
}
