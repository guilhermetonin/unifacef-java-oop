package atividades.CineTeatro;

import java.time.LocalDateTime;

public class TestaCinema {
    static void main(String[] args) {

        Filme batman = new Filme(1, "Batman", "Ação", 170);
        Filme duna = new Filme(2, "Duna", "Ficção", 180);

        LocalDateTime data = LocalDateTime.of(2026, 7, 20, 20, 0);
        Sessao sessao = new Sessao(1, data, 1);

        sessao.vincularFilme(batman);

        sessao.venderIngresso(100, "A1", "Inteira", 40);
        sessao.venderIngresso(101, "A2", "Meia", 20);
        sessao.venderIngresso(102, "A3", "Inteira", 40);

        System.out.println(sessao);
    }
}
