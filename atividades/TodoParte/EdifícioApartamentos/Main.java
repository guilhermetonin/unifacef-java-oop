package atividades.TodoParte.EdifícioApartamentos;

public class Main {
    static void main(String[] args) {

        Edificio edificio = new Edificio("ADN", "Rua X");
        edificio.construirApartamento(1, 1);
        edificio.construirApartamento(2, 2);
        edificio.construirApartamento(3, 3);

        System.out.println(edificio);
    }
}
