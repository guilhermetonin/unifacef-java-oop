public class SmartTv {
    private String marca;
    private String modelo;
    private int volume;

    public SmartTv(String marca, String modelo, int volume) {
        this.setMarca(marca);
        this.setModelo(modelo);
        this.setVolume(volume); // para não perder o encapsulamento
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        if (volume >= 0 && volume <= 100) {
            this.volume = volume;
        } else System.out.println("Volume inválido.");
    }

}