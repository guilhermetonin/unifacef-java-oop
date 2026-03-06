public class TestaPontuacao {
    static void main(String[] args) {

        Placar jogo1 = new Placar("Palmeiras", "Franca"); // cria instância de um jogo
        System.out.println(jogo1); // exibe na tela

        jogo1.registrarPonto("CASA", 3); // +2 pontos para o time da casa
        jogo1.registrarPonto("visitante", 2); // +3 pontos para o time visitante

        jogo1.proximoQuarto(); // período: 2

        jogo1.registrarPonto("casa", 4); // tenta pontuação inválida

        jogo1.proximoQuarto(); // período: 3
        jogo1.proximoQuarto(); // período: 4
        jogo1.proximoQuarto(); // tenta aumentar um quarto inválido

        System.out.println("\n" + jogo1);

    }
}
