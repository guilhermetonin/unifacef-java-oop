public class TestaDrone {
    static void main(String[] args) {

        // cria uma nova instância
        Drone d1 = new Drone("DR0001", 0, 15, false);

        d1.decolar(); // tenta decolar o drone com a bateria fraca
        System.out.println(d1); // exibe na tela

        d1.setBateria(100); // muda a porcentagem da bateria
        d1.decolar(); // decola com bateria suficiente
        System.out.println(d1); // exibe na tela

        d1.subir(50.0); // sobe 50m
        System.out.println(d1); // exibe na tela

        d1.subir(100.0); // tenta subir um valor inválido
        System.out.println(d1); // exibe na tela

        d1.descer(200.0); // tenta descer um valor inválido
        System.out.println(d1); // exibe na tela

        d1.setBateria(150); // tenta mudar a porcentagem da bateria para um valor inválido
    }
}
