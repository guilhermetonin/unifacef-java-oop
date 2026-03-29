package atividades.TodoParte.TimeBasquete.modelo;

public class Atleta {
    private int id;
    private String nome;
    private String posicao;

    public Atleta(String nome, String posicao) {
        this.setId();
        this.nome = nome;
        this.posicao = posicao;
    }

    public void setId() {
        this.id = (int) (Math.random() * 100) + 1;
    }

    @Override
    public String toString() {
        return "\nAtleta {" +
                "id= " + id +
                ", nome= '" + nome + '\'' +
                ", posicao= '" + posicao + '\'' +
                '}';
    }
}
