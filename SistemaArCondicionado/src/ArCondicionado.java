public class ArCondicionado {
    private String marca;
    private String modelo;
    private int temperatura;
    private boolean ligado;

    public ArCondicionado() {

    }
    public ArCondicionado(String marca, String modelo, int temperatura, boolean ligado) {
        this.setMarca(marca);
        this.setModelo(modelo);
        this.setTemperatura(temperatura);
        this.setLigado(ligado);
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        if (marca.length() >= 3) {
            this.marca = marca;
        } else {
            System.out.println("A marca deve conter pelos menos 3 caracteres.");
            this.marca = "";
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
        if (this.ligado) {
            if (t >= 16 && t <= 30) {
                this.temperatura = t;
            } else {
                System.out.println("Temperatura fora da faixa.");
            }
        } else {
            System.out.println("Ligue o Ar-Condicionado primeiro.");
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

    public void ativarModoTurbo() {
        if (verificarCompressor()) {
            System.out.println("Ativando ModoTurbo...");
            this.setTemperatura(16);
        } else {
            System.out.println("Houve uma falha técnica no seu ar.");
        }
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
