package modelo;

import java.util.ArrayList;

public class Disciplina {
    private int id;
    private String nome;
    private String professor;
    private ArrayList<Aluno> alunos;
    private ArrayList<Avaliacao> avaliacoes;

    public Disciplina() {
        alunos = new ArrayList<>();
        avaliacoes = new ArrayList<>();
    }

    public Disciplina(int id, String nome, String professor) {
        this.id = id;
        this.nome = nome;
        this.professor = professor;
        alunos = new ArrayList<>();
        avaliacoes = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getProfessor() {
        return professor;
    }

    public void setProfessor(String professor) {
        this.professor = professor;
    }

    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }

    public ArrayList<Avaliacao> getAvaliacoes() {
        return avaliacoes;
    }

    @Override
    public String toString() {
        return String.format("""
                Disciplina {
                    id = %d
                    nome = %s
                    professor = %s
                    lista de alunos = %s
                    lista de avaliacoes = %s
                }
                """, this.id, this.nome, this.professor, this.alunos, this.avaliacoes);

    }

    public void matricularAluno(Aluno aln) {
        alunos.add(aln);
        System.out.println("Aluno matriculado com sucesso!");
    }

    public Avaliacao criarAvalicacao(int id, String nome) {
        Avaliacao aux = new Avaliacao(id, nome);
        avaliacoes.add(aux);
        System.out.println("Avaliação criada com sucesso!");
        return aux;
    }

}
