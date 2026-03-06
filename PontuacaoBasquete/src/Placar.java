public class Placar {
    private String nomeTimeCasa;
    private String nomeTimeVisitante;
    private int pontosCasa;
    private int pontosVisitante;
    private int periodoQuarto;

    public Placar(String nomeTimeCasa, String nomeTimeVisitante) {
        this.setNomeTimeCasa(nomeTimeCasa);
        this.setNomeTimeVisitante(nomeTimeVisitante);
        this.pontosCasa = 0;
        this.pontosVisitante = 0;
        this.periodoQuarto = 1;
    }

    public String getNomeTimeCasa() {
        return nomeTimeCasa;
    }

    public void setNomeTimeCasa(String nomeTimeCasa) {
        this.nomeTimeCasa = nomeTimeCasa;
    }

    public String getNomeTimeVisitante() {
        return nomeTimeVisitante;
    }

    public void setNomeTimeVisitante(String nomeTimeVisitante) {
        this.nomeTimeVisitante = nomeTimeVisitante;
    }

    public int getPontosCasa() {
        return pontosCasa;
    }

    public void setPontosCasa(int pontosCasa) {
        this.pontosCasa = pontosCasa;
    }

    public int getPontosVisitante() {
        return pontosVisitante;
    }

    public void setPontosVisitante(int pontosVisitante) {
        this.pontosVisitante = pontosVisitante;
    }

    public int getPeriodoQuarto() {
        return periodoQuarto;
    }

    public void setPeriodoQuarto(int periodoQuarto) {
        this.periodoQuarto = periodoQuarto;
    }

    public void registrarPonto(String time, int pontuacao) {
        time = time.toLowerCase();
        if (pontuacao == 1) {
            System.out.println("Lance Livre!");
        } else if (pontuacao == 2) {
            System.out.println("Cesta!");
        } else if (pontuacao == 3) {
            System.out.println("Cesta de Três!");
        } else {
            System.out.println("Valor da pontuação inválida!");
            return;
        }
        if (time.equals("casa")) {
            System.out.println("Para o time: " + this.nomeTimeCasa);
            this.pontosCasa += pontuacao;
        } else if (time.equals("visitante")) {
            System.out.println("Para o time: " + this.nomeTimeVisitante);
            this.pontosVisitante += pontuacao;
        } else {
            System.out.println("Time não encontrado!");
        }
    }
    public void proximoQuarto() {
        if (periodoQuarto == 4) {
            System.out.println("Jogo encerrado!");
        } else {
            this.periodoQuarto++;
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
