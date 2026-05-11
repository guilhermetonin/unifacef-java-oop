package atividades.TodoParte.ClinicaMedica.modelo;

public class Paciente {
    private int id;
    private String nome;
    private String cpf;

    public Paciente(String nome, String cpf) {
        this.setId();
        this.nome = nome;
        this.cpf = cpf;
    }

    public void setId() {
        this.id = (int) (Math.random() * 10 ) + 1;
    }

    @Override
    public String toString() {
        return "\nPaciente{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                '}';
    }
}
