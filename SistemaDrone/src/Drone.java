public class Drone {
    private String codigo;
    private double altura;
    private int bateria;
    private boolean emVoo;

    public Drone(String codigo, double altura, int bateria, boolean emVoo) {
        this.setCodigo(codigo);
        this.setAltura(altura);
        this.setBateria(bateria);
        this.setEmVoo(emVoo);
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        if (altura >= 0 && altura <= 120) {
            this.altura = altura;
        } else {
            System.out.println("Altura fora do limite (0m a 120m).");
        }
    }

    public int getBateria() {
        return bateria;
    }

    public void setBateria(int bateria) {
        if (bateria >= 0 && bateria <= 100) {
            this.bateria = bateria;
        } else {
            System.out.println("Bateria inválida (deve ser entre 0 a 100%).");
        }
    }

    public boolean isEmVoo() {
        return emVoo;
    }

    public void setEmVoo(boolean emVoo) {
        this.emVoo = emVoo;
    }

    public void decolar() {
        if (this.bateria > 20) {
            if (testarMotores()) {
                this.emVoo = true;
                setAltura(2);
            } else {
                System.out.println("Os motores não estão prontos.");
            }
        }
    }

    private boolean testarMotores() {
        System.out.println("Testando hélices...");
        System.out.println("Calibrando GPS...");
        int random = (int) (Math.random() * 10);
        return (random < 8);
    }

    public void subir(double x) {
        if (this.emVoo) {
            this.setAltura(this.altura + x);
        } else {
            System.out.println("O drone precisa estar em voo para subir.");
        }
    }

    public void descer(double x) {
        if (this.emVoo) {
            this.setAltura(this.altura - x);
        } else {
            System.out.println("O drone precisa estar em voo para descer.");
        }
    }

    @Override
    public String toString() {
        String status = this.emVoo ? "Sim" : "Não";
        return String.format("""
                Código: %s
                Altura: %.2fm
                Bateria: %d
                Está em Voo: %s
                """, this.codigo, this.altura, this.bateria, status);
    }
}
