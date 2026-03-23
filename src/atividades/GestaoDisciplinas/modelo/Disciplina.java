package modelo;

import java.util.ArrayList;

public class Disciplina {
    private int id;
    private String nome;
    private String professor;
    private ArrayList<Aluno> alunos;
    private ArrayList<Avaliacao> avaliacoes;

    public Disciplina(int id, String nome, String professor) {
        this.id = id;
        this.nome = nome;
        this.professor = professor;
        alunos = new ArrayList<>();
        avaliacoes = new ArrayList<>();
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

    public Avaliacao getAvaliacoes(String nomeAvaliacao) {
        for (Avaliacao avaliacao : avaliacoes) {
            if (avaliacao.getNome().equalsIgnoreCase(nomeAvaliacao)) {
                return avaliacao;
            }
        }
        return null;
    }

    public void matricularAluno(Aluno aln) {
        alunos.add(aln);
        System.out.println("Aluno matriculado com sucesso!");
    }

    public void criarAvalicacao(int id, String nome) {
        avaliacoes.add(new Avaliacao(id, nome));
        System.out.println("Avaliação criada com sucesso!");
    }

}
