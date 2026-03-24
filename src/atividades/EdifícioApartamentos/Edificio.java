package atividades.EdifícioApartamentos;

import java.util.ArrayList;
import java.util.List;

public class Edificio {
    private String nome;
    private String endereco;
    private List<Apartamento> listaApartamentos;

    public Edificio(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
        this.listaApartamentos = new ArrayList<>();
    }

    public void construirApartamento(int numero, int andar) {
        listaApartamentos.add(new Apartamento(numero, andar));
    }

    @Override
    public String toString() {
        return "Edificio{" +
                "nome='" + nome + '\'' +
                ", endereco='" + endereco + '\'' +
                ", listaApartamentos=" + listaApartamentos +
                '}';
    }
}
