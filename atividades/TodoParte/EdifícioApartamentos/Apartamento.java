package atividades.TodoParte.EdifícioApartamentos;

public class Apartamento {
    private int numero;
    private int andar;

    public Apartamento(int numero, int andar) {
        this.numero = numero;
        this.andar = andar;
    }

    @Override
    public String toString() {
        return "\nApartamento{" +
                "numero=" + numero +
                ", andar=" + andar +
                '}';
    }
}
