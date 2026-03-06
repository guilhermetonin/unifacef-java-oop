public class TestaSmartTv {
    public static void main(String[] args) {
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

        // altera marca
        tv1.setMarca("MarcaA");
        System.out.println("Marca alterada: " + tv1.getMarca());

        // altera modelos
        tv1.setModelo("ModeloA");
        System.out.println("Modelo alterado: " + tv1.getModelo());

        // teste aumenta e diminui volumes
        tv1.setVolume(20);
        tv1.aumentaVolume(50);
        System.out.println(tv1.getVolume());

        tv1.diminuiVolume(50);
        tv1.diminuiVolume(15);
        System.out.println(tv1.getVolume());

    }
}
