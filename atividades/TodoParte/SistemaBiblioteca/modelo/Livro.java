package atividades.TodoParte.SistemaBiblioteca.modelo;

public class Livro {
    private int id;
    private String titulo;
    private String autor;

    public Livro(String titulo, String autor) {
        this.setId();
        this.titulo = titulo;
        this.autor = autor;
    }

    public void setId() {
        this.id = (int) (Math.random() * 100) + 1;
    }

    @Override
    public String toString() {
        return "Livro {" +
                "id= " + id +
                ", titulo= '" + titulo + '\'' +
                ", autor= '" + autor + '\'' +
                '}';
    }
}
