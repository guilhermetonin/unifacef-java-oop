package atividades.GestaoDisciplinas;

import modelo.Aluno;
import modelo.Avaliacao;
import modelo.Disciplina;

public class TestaAcademico {
    static void main(String[] args) {

        // cria instâncias de Alunos (independentes)
        Aluno a1 = new Aluno(1, "João Silva", 2026001, "Eng. Software");
        Aluno a2 = new Aluno(2, "Maria Oliveira", 2026002, "Sist. Informação");

        // cria instância de Disciplina
        Disciplina disc = new Disciplina(10, "Programação Orientada a Objetos", "Daniel");

        // matricula os alunos (agregação)
        disc.matricularAluno(a1);
        disc.matricularAluno(a2);

        // cria uma instância de Avaliacao dentro de Disciplina (composição)
        disc.criarAvalicacao(15, "Prova Semestral");

        // adiciona questões na avaliação criada (composição aninhada)
        Avaliacao av = disc.getAvaliacoes("Prova Semestral");
        if (av != null) {
            av.adicionarQuestao(1, "O que é Encapsulamento?", 3.5f);
            av.adicionarQuestao(2, "Diferencie Agregação de Composição.", 3.5f);
            av.adicionarQuestao(3, "Implemente um método toString.", 3.0f);
        }

        // imprime o resultado
        System.out.println(disc.toString());

    }
}
