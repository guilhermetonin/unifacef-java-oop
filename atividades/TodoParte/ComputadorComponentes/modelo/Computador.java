package atividades.TodoParte.ComputadorComponentes.modelo;

public class Computador {
    private int id;
    private String marca;
    private Processador processador;

    public Computador(String marca) {
        this.setId();
        this.marca = marca;
        this.processador = null;
    }

    public void setId() {
        this.id = (int) (Math.random() * 10) + 1;
    }

    public void adicionarProcessador(String marca, String modelo, Double freq) {
        if (this.processador == null) {
            this.processador = new Processador(marca, modelo, freq);
        }
    }

    public Processador getProcessador() {
        return processador;
    }

    @Override
    public String toString() {
        return "Computador{" +
                "id=" + id +
                ", marca='" + marca + '\'' +
                ", processador=" + processador +
                '}';
    }
}
