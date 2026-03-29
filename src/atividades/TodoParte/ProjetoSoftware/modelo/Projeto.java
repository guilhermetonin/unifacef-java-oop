package atividades.TodoParte.ProjetoSoftware.modelo;

import java.util.ArrayList;
import java.util.List;

public class Projeto {
    private int id;
    private String nomeProjeto;
    private List<Programador> listaProgramadores;

    public Projeto(String nomeProjeto) {
        this.setId();
        this.nomeProjeto = nomeProjeto;
        this.listaProgramadores = new ArrayList<>();
    }

    public void setId() {
        this.id = (int) (Math.random() * 10) + 1;
    }

    public void adicionarProgramador(Programador prog) {
        this.listaProgramadores.add(prog);
    }

    public void listarProgramadores() {
        for (Programador prog : this.listaProgramadores) {
            System.out.println(prog);
        }
    }

    @Override
    public String toString() {
        return "Projeto{" +
                "id=" + id +
                ", nomeProjeto='" + nomeProjeto + '\'' +
                '}';
    }
}
