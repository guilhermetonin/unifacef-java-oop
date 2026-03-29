package Heranca;

public class Pleno extends Desenvolvedor {
    private int projEntregue;

    public Pleno() {
        super();
    }

    public Pleno(String nome, String linguagem, float salarioBase, int projEntregue) {
        super(nome, linguagem, salarioBase);
        this.projEntregue = projEntregue;
    }

    public int getProjEntregue() {
        return projEntregue;
    }

    public void setProjEntregue(int projEntregue) {
        this.projEntregue = projEntregue;
    }

    @Override
    public void codar(){
        System.out.println("Pleno codando e fazendo Code Review");
    }

    @Override
    public float calculaBonus(){
        return (this.salarioBase * 0.15f);
    }

    @Override
    public String toString() {
        return "Pleno{" +
                super.toString() +
                "projEntr=" + projEntregue +
                '}';
    }
}