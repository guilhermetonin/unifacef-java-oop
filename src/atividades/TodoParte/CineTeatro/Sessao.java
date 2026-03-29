package atividades.TodoParte.CineTeatro;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Sessao {
    private int id;
    private LocalDateTime horario;
    private int sala;
    private Filme filme;
    private List<Ingresso> ingressos;

    public Sessao(int id, LocalDateTime horario, int sala) {
        this.id = id;
        this.horario = horario;
        this.sala = sala;
        this.filme = null;
        this.ingressos = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDateTime getHorario() {
        return horario;
    }

    public void setHorario(LocalDateTime horario) {
        this.horario = horario;
    }

    public int getSala() {
        return sala;
    }

    public void setSala(int sala) {
        this.sala = sala;
    }

    public Filme getFilme() {
        return filme;
    }

    public void setFilme(Filme filme) {
        this.filme = filme;
    }

    public List<Ingresso> getIngressos() {
        return ingressos;
    }

    public void setIngressos(List<Ingresso> ingressos) {
        this.ingressos = ingressos;
    }

    public void vincularFilme(Filme filme) {
        this.filme = filme;
    }

    public void venderIngresso(int id,  String tipo, String assento,double preco) {
        ingressos.add(new Ingresso(id, tipo, assento, preco));
    }

    @Override
    public String toString() {
        return "\nSessao{" +
                "id=" + id +
                ", horario=" + horario +
                ", sala=" + sala +
                ", filme=" + filme +
                ", ingressos=" + ingressos +
                '}';
    }
}
