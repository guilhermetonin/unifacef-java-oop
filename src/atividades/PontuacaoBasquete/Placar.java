package atividades.PontuacaoBasquete;

public class Placar {
    private String nomeTimeCasa;
    private String nomeTimeVisitante;
    private int pontosCasa;
    private int pontosVisitante;
    private int periodoQuarto;

    public Placar(String nomeTimeCasa, String nomeTimeVisitante) {
        this.nomeTimeCasa = nomeTimeCasa;
        this.nomeTimeVisitante = nomeTimeVisitante;
        this.pontosCasa = 0;
        this.pontosVisitante = 0;
        this.periodoQuarto = 1;
    }

    public void registrarPonto(String time, int pontuacao) {

        if (pontuacao < 1 || pontuacao > 3) {
            System.out.println("Valor da pontuação inválida!");
            return;
        }

        if (time.equalsIgnoreCase("casa")) {
            this.pontosCasa += pontuacao;
            System.out.println("Cesta de " + pontuacao + " para o " + nomeTimeCasa);

        } else if (time.equalsIgnoreCase("visitante")) {
            this.pontosVisitante += pontuacao;
            System.out.println("Cesta de " + pontuacao + " para o " + nomeTimeVisitante);
        } else {
            System.out.println("Time não foi identificado.");
        }
    }


    public void proximoQuarto() {
        if (periodoQuarto == 4) {
            System.out.println("Jogo encerrado!");
        } else {
            this.periodoQuarto++;
            System.out.println("Iniciando o " + this.periodoQuarto + "º Quarto.");
        }
    }

    @Override
    public String toString() {
        return String.format("""
                %s [%d]    x    [%d] %s
                Período: %d
                """, this.nomeTimeCasa, this.pontosCasa, this.pontosVisitante, this.nomeTimeVisitante, this.periodoQuarto);
    }
}
