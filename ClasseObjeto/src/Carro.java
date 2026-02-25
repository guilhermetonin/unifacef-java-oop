// public é a visibilidade da classe - deixe sempre pública
public class Carro {
    // uma classe contém variáveis / propriedades / atributos

    public String marca, modelo; // String é um tipo de dado do tipo classe
    public float velocidade; // float é uma tipo de dado primitivo
    public boolean motor; // boolean é uma tipo de dado primitivo

    // metodo que converte um objeto em string
    public String toString(){

        return String.format("""
                Marca: %s
                Modelo: %s
                Velocidade: %.2f
                Motor: %b
                """, this.marca, this.modelo, this.velocidade, this.motor);
        // this representa o objeto que chama o metodo
    }
}