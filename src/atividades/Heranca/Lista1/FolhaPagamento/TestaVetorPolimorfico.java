package atividades.Heranca.Lista1.FolhaPagamento;

public class TestaVetorPolimorfico {
    static void main(String[] args){

        Desenvolvedor[] array = new Desenvolvedor[4];

        array[0] = new Junior("Carlos", "Juan", "Java", 3200);
        array[1] = new Pleno("Carlos", "Java", 5100, 12);
        array[2] = new Senior("Guilherme", "Java", 8800, 1000);
        array[3] = new Desenvolvedor("Rodrigo", "Python", 1518);

        for (Desenvolvedor dev : array) {
            System.out.println("-----------");
            dev.codar();

            System.out.println("\nCalcula Bônus: " + dev.calculaBonus());

            System.out.println("\ntoString: " + dev);
        }
    }
}