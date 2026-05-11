package atividades.TodoParte.ClasseAssociacao;

import java.time.LocalDateTime;

public class TestaAgencia {
    static void main(String[] args) {

        Passageiro p1 = new Passageiro("123.123.123-12", "Fulano");
        System.out.println("\nPASSAGEIRO: " + p1);

        LocalDateTime dataVoo = LocalDateTime.of(2026, 4, 18, 8, 30);
        Voo v1 = new Voo(777, "Ribeirão Preto", "São Paulo", dataVoo);
        System.out.println("\nVOO: " + v1);

        LocalDateTime dataReserva = LocalDateTime.now();
        Reserva r1 = new Reserva(12, dataReserva, 5, p1, v1);
        System.out.println("\nREVERSA: \n" + r1);

        // usando o objeto r1:
        // 1° exiba o destino do vôo da reserva
        // 2° exiba o nome do passageiro da reserva

        String destino = r1.getVoo().getDestino();
        System.out.println("\nDestino do vôo: " + destino);

        String nome = r1.getPassageiro().getNome();
        System.out.println("Nome do passageiro: " + nome);

    }
}
