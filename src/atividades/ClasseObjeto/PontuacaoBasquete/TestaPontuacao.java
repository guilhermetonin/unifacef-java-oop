package atividades.ClasseObjeto.PontuacaoBasquete;

public class TestaPontuacao {
    static void main(String[] args) {

        // instância o atividades.ClasseObjeto.PontuacaoBasquete.Placar
        Placar jogo = new Placar("Sesi Franca", "Bauru");

        System.out.println("--- Início de Jogo ---");
        System.out.println(jogo.toString());

        // simula pontuações
        jogo.registrarPonto("casa", 3);       // Cesta de 3 do Franca
        jogo.registrarPonto("visitante", 2);  // Cesta de 2 do Bauru
        jogo.registrarPonto("casa", 1);       // Lance livre do Franca

        // avança o jogo
        jogo.proximoQuarto();
        jogo.proximoQuarto();
        jogo.proximoQuarto(); // Chegamos ao 4º Quarto

        jogo.registrarPonto("casa", 2);

        System.out.println("\n--- atividades.ClasseObjeto.PontuacaoBasquete.Placar Final ---");
        System.out.println(jogo.toString());

        // testa avançar após o fim
        jogo.proximoQuarto();

    }
}
