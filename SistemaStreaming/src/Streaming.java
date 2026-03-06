public class Streaming {
    private String usuario;
    private String plano;
    private double mensalidade;
    private boolean ativo;
    private String ultimoFilmeAssistido;

    public Streaming(String usuario, String plano) {
        this.setUsuario(usuario);
        this.setPlano(plano);
        this.setMensalidade();
        this.ativo = true;
        this.ultimoFilmeAssistido = "";
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPlano() {
        return plano;
    }

    public void setPlano(String plano) {
        this.plano = plano;
    }

    public double getMensalidade() {
        return this.mensalidade;
    }

    public void setMensalidade() {
        if (this.plano == "Básico") {
            this.mensalidade = 25.90;
        } else if (this.plano == "Premium") {
            this.mensalidade = 45.90;
        } else if (this.plano == "Família") {
            this.mensalidade = 60.90;
        } else {
            System.out.println("Não foi possível identificar o tipo do plano.");
            this.mensalidade = 0;
        }
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public String getUltimoFilmeAssistido() {
        return ultimoFilmeAssistido;
    }

    public void setUltimoFilmeAssistido(String ultimoFilmeAssistido) {
        this.ultimoFilmeAssistido = ultimoFilmeAssistido;
    }

    public void assistirFilme(String nomeFilme) {
        if (this.ativo) {
            nomeFilme = String.format("Assistindo: [%s]", nomeFilme);
            this.ultimoFilmeAssistido = nomeFilme;
            System.out.println("Atualizado! você está assistindo: " + nomeFilme);
        } else {
            System.out.println("Conta inativa. Deve pagar a fatura.");
        }
    }

    public void cancelarAssinatura() {
        if (this.ativo) {
            this.ativo = !this.ativo;
        } else {
            System.out.println("Impossível cancelar assinatura, a conta está inativa.");
        }
    }

    @Override
    public String toString() {
        String estado = this.ativo ? "Ativa" : "Suspenso";
        return String.format("""
                Usuário: %s
                Plano: %s
                Mensalidade: %.2f
                Último filme assistido: %s
                Status: %s
                """, this.usuario, this.plano, this.mensalidade, this.ultimoFilmeAssistido, estado);
    }
}
