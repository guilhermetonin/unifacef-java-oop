public class TestaArCondicionado {
    static void main(String[] args) {

        // cria uma nova instância
        ArCondicionado ar1 = new ArCondicionado("LG", "15.000BTU", 0, false);
        System.out.println(ar1); // exibe na tela

        ar1.setMarca("Samsung"); // muda o nome da marca
        ar1.setTemperatura(16); // tenta mudar a temperatura para 16 (sem ligar antes)

        ar1.ligar(); // liga o ar
        ar1.setTemperatura(24); // muda a temperatura
        System.out.println(ar1); // exibe na tela

        ar1.ativarModoTurbo(); // ativa o modo turbo (temp 16)
        System.out.println(ar1); // exibe na tela

        ar1.desligar(); // desliga o ar
        System.out.println(ar1); // exibe na tela

    }
}
