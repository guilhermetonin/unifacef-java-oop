package atividades.TodoParte.ClinicaMedica.modelo;

public class Medico {
    private int id;
    private String nome;
    private String especialidade;

    public Medico(String nome, String especialidade) {
        this.setId();
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public void setId() {
        this.id = (int) (Math.random() * 10 ) + 1;
    }

    @Override
    public String toString() {
        return "\nMedico{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", especialidade='" + especialidade + '\'' +
                '}';
    }
}
