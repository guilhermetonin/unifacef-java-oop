package atividades.TodoParte.classeassociacao;

// objeto parte
public class Passageiro {
    private String cpf;
    private String nome;

    public Passageiro() {
    }

    public Passageiro(String cpf, String nome) {
        this.cpf = cpf;
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "\nPassageiro {" +
                "cpf= '" + cpf + '\'' +
                ", nome= '" + nome + '\'' +
                '}';
    }
}
