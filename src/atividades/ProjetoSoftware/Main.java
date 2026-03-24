package atividades.ProjetoSoftware;

import atividades.ProjetoSoftware.modelo.Programador;
import atividades.ProjetoSoftware.modelo.Projeto;

public class Main {
    static void main(String[] args) {
        Programador prog1 = new Programador("Gui", "Java");
        Programador prog2 = new Programador("Daniel", "JavaScript");
        Programador prog3 = new Programador("Juan", "Python");

        Projeto nubank = new Projeto("Nubank LTDA.");
        nubank.adicionarProgramador(prog1);
        nubank.adicionarProgramador(prog2);
        nubank.adicionarProgramador(prog3);

        System.out.println("Listar programadores no projeto:");
        nubank.listarProgramadores();
    }
}
