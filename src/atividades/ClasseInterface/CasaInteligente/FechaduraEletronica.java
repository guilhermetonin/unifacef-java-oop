package atividades.ClasseInterface.CasaInteligente;

public class FechaduraEletronica implements Autenticavel, DispositivoLigavel {
    private boolean permissao;
    private String senha;

    public FechaduraEletronica() {
        this.permissao = false;
    }

    public FechaduraEletronica(String senha) {
        this.permissao = false;
        this.senha = senha;
    }

    @Override
    public void validarAcesso(String senha) {
        if (this.senha.equals(senha)) {
            System.out.println("Acesso permitido");
            permissao = true;
        } else {
            System.out.println("Acesso negado");
            permissao = false;
        }
    }

    @Override
    public void ligar() {
        if (permissao) {
            System.out.println("Destrancada.");
        } else {
            System.out.println("Sem permissão para ligar.");
        }
    }

    @Override
    public void desligar() {
        this.permissao = false;
        System.out.println("Trancada.");
    }
}
