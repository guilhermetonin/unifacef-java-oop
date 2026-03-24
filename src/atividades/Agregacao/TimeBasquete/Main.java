package atividades.Agregacao.TimeBasquete;

import atividades.Agregacao.TimeBasquete.modelo.Atleta;
import atividades.Agregacao.TimeBasquete.modelo.Time;

public class Main {
    static void main(String[] args) {

        Atleta lucas = new Atleta("Lucas", "Pivô");
        Atleta david = new Atleta("Lucas", "Ala");
        Atleta paulo = new Atleta("Lucas", "Armador");

        System.out.println("O atleta não precisa do time para existir" + lucas);

        Time sesiFranca = new Time("Sesi Franca", "Helinho");

        System.out.println("\nAntes: " + sesiFranca);

        sesiFranca.contratarAtleta(lucas);
        sesiFranca.contratarAtleta(david);
        sesiFranca.contratarAtleta(paulo);
        System.out.println("\nDepois: " + sesiFranca);
    }
}
