package atividades.TodoParte.VendasSupermercado.modelo;

public class Cliente {
    private int id;
    private String nome;

    public Cliente(String nome) {
        this.setId();
        this.nome = nome;
    }

    public void setId() {
        this.id = (int) (Math.random() * 10) + 1;
    }

    @Override
    public String toString() {
        return "\nCliente{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                '}';
    }
}
