package modelo;

import java.util.ArrayList;

public class Avaliacao {
    private int id;
    private String nome;
    private ArrayList<Questao> questoes;

    public Avaliacao(int id, String nome) {
        this.id = id;
        this.nome = nome;
        this.questoes = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public ArrayList<Questao> getQuestoes() {
        return questoes;
    }

    @Override
    public String toString() {
        return String.format("%nAvaliação { id= %d, nome= %s, questoes= %s }",
                this.id, this.nome, this.questoes);
    }

    public void adicionarQuestao(int numero, String texto, float peso) {
        Questao aux = new Questao(numero, texto, peso);
        questoes.add(aux);
        System.out.println("Questao adicionada com sucesso!");
    }
}
