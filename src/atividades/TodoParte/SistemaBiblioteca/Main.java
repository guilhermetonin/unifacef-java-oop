package atividades.TodoParte.SistemaBiblioteca;

import atividades.TodoParte.SistemaBiblioteca.modelo.Emprestimo;
import atividades.TodoParte.SistemaBiblioteca.modelo.Leitor;
import atividades.TodoParte.SistemaBiblioteca.modelo.Livro;

import java.time.LocalDate;

public class Main {
    static void main(String[] args) {

        Leitor leitor = new Leitor("Guilherme");

        Livro livro = new Livro("Harry Potter", "J. K. Rowling");

        LocalDate dataEmpre = LocalDate.of(2026, 3, 23);
        LocalDate dataDevo = LocalDate.of(2026, 3, 30);
        Emprestimo emprestimo = new Emprestimo(dataEmpre, dataDevo, leitor, livro);

        System.out.println(emprestimo);

    }
}
