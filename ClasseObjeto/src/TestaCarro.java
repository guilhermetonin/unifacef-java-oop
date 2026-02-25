public class TestaCarro {
    // void - não retorna nada
    public static void main(String[] args) {
        // instanciar objeto obj1
        Carro obj1 = new Carro();
        obj1.marca = "Fiat";
        obj1.modelo = "Uno";
        obj1.velocidade = 0;
        obj1.motor = false;

        // instanciar objeto obj2
        Carro obj2 = new Carro();
        obj2.marca = "Chevrolet";
        obj2.modelo = "Onix";
        obj2.velocidade = 0;
        obj2.motor = false;

        // System é uma classe | out é uma variável | println é um metodo
        System.out.println(obj1.toString());
        System.out.println(obj2.toString());

        // classe tem variáveis e metodos
        // metodos (eram as antigas funções)
    }
}
