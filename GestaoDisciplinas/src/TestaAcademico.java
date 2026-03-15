import modelo.Aluno;
import modelo.Avaliacao;
import modelo.Disciplina;

public class TestaAcademico {
    static void main(String[] args) {

        // cria instâncias Aluno
        Aluno miguel = new Aluno(1, "Miguel", 1111, "Sistemas de Informação");
        Aluno fernando = new Aluno(2, "Fernando", 2222, "Ciência da Computação");

        // cria instâncias Disciplina
        Disciplina oop = new Disciplina(1, "Programação Orientada a Objetos", "Daniel");

        // matricula alunos criados na disciplina (agregação)
        oop.matricularAluno(miguel);
        oop.matricularAluno(fernando);

        // cria prova semestral (composição)
        Avaliacao provaSemestral = oop.criarAvalicacao(1, "Prova Semestral");

        // cria questoes da prova semestral
        provaSemestral.adicionarQuestao(1, "O que é uma classe?", 3.0f);
        provaSemestral.adicionarQuestao(2, "Defina polimorfismo.", 3.5f);
        provaSemestral.adicionarQuestao(3, "Defina o conceito de Herança.", 3.5f);


        // alunos criados e matriculados
        System.out.println("\n* Alunos = " + oop.getAlunos());

        // disciplina 'oop'
        System.out.println("* Disciplina = " + oop.getNome());

        // avaliação 'Prova Semestral'
        System.out.println("* Avaliação = " + provaSemestral.getNome());

        // questões da prova semestral
        System.out.println("* Questões = " + provaSemestral.getQuestoes());
    }
}
