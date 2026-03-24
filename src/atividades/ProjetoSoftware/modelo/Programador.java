package atividades.ProjetoSoftware.modelo;

public class Programador {
    private int id;
    private String nome;
    private String linguagemPrincipal;

    public Programador(String nome, String linguagemPrincipal) {
        this.setId();
        this.nome = nome;
        this.linguagemPrincipal = linguagemPrincipal;
    }

    public void setId() {
        this.id = (int) (Math.random() * 10) + 1;
    }

    @Override
    public String toString() {
        return "Programador{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", linguagemPrincipal='" + linguagemPrincipal + '\'' +
                '}';
    }
}
