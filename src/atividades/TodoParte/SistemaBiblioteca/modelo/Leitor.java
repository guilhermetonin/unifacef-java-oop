package atividades.TodoParte.SistemaBiblioteca.modelo;

public class Leitor {
    private int id;
    private String nome;

    public Leitor(String nome) {
        this.setId();
        this.nome = nome;
    }

    public void setId() {
        this.id = (int) (Math.random() * 100) + 1;
    }

    @Override
    public String toString() {
        return "Leitor {" +
                "id= " + id +
                ", nome= '" + nome + '\'' +
                '}';
    }
}
