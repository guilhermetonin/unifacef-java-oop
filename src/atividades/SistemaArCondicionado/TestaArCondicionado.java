package atividades.SistemaArCondicionado;

public class TestaArCondicionado {
    static void main(String[] args) {

        // cria instância com marca/modelo preferidos e 22°C
        ArCondicionado meuAr = new ArCondicionado("Samsung", "WindFree", 22);

        // testa de temperatura inválida e válida
        meuAr.ajustarTemperatura(24); // testa erro (aparelho desligado)
        meuAr.ligar();
        meuAr.ajustarTemperatura(10); // testa erro (temp fora da faixa)

        meuAr.ajustarTemperatura(25);

        // imprime dados
        System.out.println("\nEstado atual:\n" + meuAr);

        // testa modoTurbo com aparelho desligado
        meuAr.desligar();
        meuAr.ativarModoTurbo();

        // liga para usar modoTurbo
        meuAr.ligar();
        meuAr.ativarModoTurbo();

        // imprime dados
        System.out.println("\nEstado final:\n" + meuAr);

    }
}
