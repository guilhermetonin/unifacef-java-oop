public class TestaSmartTv {
    static void main(String[] args) {
        // instancia tv1
        SmartTv tv1 = new SmartTv("LG", "IPS 34 Polegadas", 10);

        // tenta volumes inválidos
        tv1.setVolume(-50);
        tv1.setVolume(500);

        // troca de volume
        tv1.setVolume(50);
        System.out.println("Volume da tv1: " + tv1.getVolume());

        // instacia tv2
        SmartTv tv2 = new SmartTv("Samsung", "QLED 75 Polegadas", 10);

        // instacia tv3 (com o volume inválido)
        SmartTv tv3 = new SmartTv("Asus", "OLED 27 Polegadas", 100);
        System.out.println(tv3.getMarca());
    }
}
