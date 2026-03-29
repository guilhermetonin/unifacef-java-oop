package atividades.TodoParte.ComputadorComponentes;

import atividades.TodoParte.ComputadorComponentes.modelo.Computador;

public class Main {
    static void main(String[] args) {

        Computador comp1 = new Computador("Dell");
        comp1.adicionarProcessador("AMD", "Ryzen 5", 4.7);

        System.out.println("Processador: " + comp1.getProcessador());
        System.out.println(comp1);
    }
}
