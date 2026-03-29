package Heranca;

import java.util.ArrayList;

public class TestaDesenvolvedor {

    // exibe os dados e calcula bônus de qualquer classe do tipo Desenvolvedor
    public static void exibeDados(Desenvolvedor dev){
            dev.codar();
            System.out.println(dev.toString() + " Bônus " + dev.calculaBonus());
    }

    static void main(String[] args){
        Junior jr = new Junior("Beltrano", "Fulano", "Java", 4000);
        exibeDados(jr);
        Pleno pl = new Pleno("Beltrano", "Java", 6000, 8);
        exibeDados(pl);
        Senior sr = new Senior("Ciclano", "Java", 9000, 30000);
        exibeDados(sr);

        // vetor de desenvolvedores
        ArrayList<Desenvolvedor> desenvolvedores = new ArrayList<>();
        // adiciona os desenvolvedores no vetor
        desenvolvedores.add(jr);
        desenvolvedores.add(pl);
        desenvolvedores.add(sr);

    }
}