package atividades.CineTeatro;

public class Ingresso {
    private int id;
    private String assento;
    private String tipo;
    private double preco;

    public Ingresso(int id, String tipo, String assento, double preco) {
        this.id = id;
        this.tipo = tipo;
        this.assento = assento;
        this.preco = preco;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getAssento() {
        return assento;
    }

    public void setAssento(String assento) {
        this.assento = assento;
    }

    @Override
    public String toString() {
        return "\nIngresso{" +
                "id=" + id +
                ", assento='" + assento + '\'' +
                ", tipo='" + tipo + '\'' +
                ", preco=" + preco +
                '}';
    }
}
