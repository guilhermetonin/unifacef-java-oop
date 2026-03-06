public class SmartTv {
    private String marca;
    private String modelo;
    private int volume;
    private boolean conectadaInternet;

    public SmartTv(String marca, String modelo, int volume) {
        this.setMarca(marca);
        this.setModelo(modelo);
        this.setVolume(volume); // para não perder o encapsulamento
        this.conectadaInternet = false;
    }

    public boolean isConectadaInternet() {
        return conectadaInternet;
    }

    public void setConectadaInternet(boolean conectadaInternet) {
        this.conectadaInternet = conectadaInternet;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        if (marca.length() <= 30) {
            this.marca = marca;
        } else {
            System.out.println("Marca inválida.");
        }
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        // todo modelo tem que iniciar com a letra maiscula
        char primeiro = modelo.charAt(0);
        if (Character.isUpperCase(primeiro)) {
            this.modelo = modelo;
        } else {
            System.out.println("Modelo inválido.");
        }
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        if (volume >= 0 && volume <= 100) {
            this.volume = volume;
        } else System.out.println("Volume inválido.");
    }

    // abre youtube
    public void abreYouTube() {
        // conecta na internet
        if (conectaInternet()) {
            System.out.println("Abrindo YouTube...");
        } else System.out.println("YouTube não pode ser aberto, está sem internet.");
    }

    private boolean conectaInternet() {
        System.out.println("Buscando sinal de Wi-Fi...");
        System.out.println("Verificando credenciais...");
        System.out.println("Autenticando IP no roteador...");
        // 50% de chance de conectar e 50% de chance não conectar
        int random = (int) (Math.random() * 10);
        if (random < 5) {
            return true;
        } else {
            System.out.println("Problema na conexão.");
            return false;
        }
    }

    public void aumentaVolume(int aumenta) {
        this.setVolume(this.volume + aumenta);
    }

    public void diminuiVolume(int diminui) {
        this.setVolume(this.volume - diminui);
    }
}