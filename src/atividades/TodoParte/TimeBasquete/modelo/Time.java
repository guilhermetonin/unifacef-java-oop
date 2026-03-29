package atividades.TodoParte.TimeBasquete.modelo;

import java.util.ArrayList;
import java.util.List;

public class Time {
    private int id;
    private String nome;
    private String tecnico;
    private List<Atleta>  listaAtletas;

    public Time(String nome, String tecnico) {
        this.setId();
        this.nome = nome;
        this.tecnico = tecnico;
        this.listaAtletas = new ArrayList<>();
    }

    public void setId() {
        this.id = (int) (Math.random() * 100) + 1;
    }

    public void contratarAtleta(Atleta atleta){
        listaAtletas.add(atleta);
    }

    @Override
    public String toString() {
        return String.format(String.format("""
                %s [id %d]
                Técnico= %s
                Lista de Atletas= {
                %s
                }
                """, this.nome, this.id, this.tecnico, this.listaAtletas));
    }
}
