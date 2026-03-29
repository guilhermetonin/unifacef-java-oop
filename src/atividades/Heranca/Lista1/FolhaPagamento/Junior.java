package atividades.Heranca.Lista1.FolhaPagamento;

// classe filha - subclasse
public class Junior extends Desenvolvedor {
    private String mentor;
    public Junior(){
        super();
    }
    public Junior(String mentor, String nome, String linguagem, float salarioBase){
        super(nome, linguagem, salarioBase);
        this.mentor = mentor;
    }

    public String getMentor() {
        return mentor;
    }

    public void setMentor(String mentor) {
        this.mentor = mentor;
    }

    @Override
    public void codar(){
        System.out.println("Junior criando código com a mentoria de " + this.mentor);
    }

    @Override
    public String toString() {
        return "Junior{" +
                super.toString() +
                "mentor='" + mentor + '\'' +
                '}';
    }
}