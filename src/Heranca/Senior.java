package Heranca;

public class Senior extends Desenvolvedor {
    private float verbaLider;

    public Senior() {
        super();
    }

    public Senior(String nome, String linguagem, float salarioBase, float verbaLider) {
        super(nome, linguagem, salarioBase);
        this.verbaLider = verbaLider;
    }

    public float getVerbaLider() {
        return verbaLider;
    }

    public void setVerbaLider(float verbaLider) {
        this.verbaLider = verbaLider;
    }

    @Override
    public void codar(){
        System.out.println("Sênior define a arquitetura e lidera pessoas");
    }

    @Override
    public float calculaBonus(){
        return (this.salarioBase * 0.30f);
    }

    @Override
    public String toString() {
        return "Senior{" +
                super.toString() +
                "verbaLider=" + verbaLider +
                '}';
    }
}