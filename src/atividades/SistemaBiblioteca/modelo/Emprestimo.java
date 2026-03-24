package atividades.SistemaBiblioteca.modelo;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Emprestimo {
    private int id;
    private LocalDate dataEmprestimo;
    private LocalDate dataDevolucao;
    private Leitor leitor;
    private Livro livro;

    public Emprestimo(LocalDate dataEmprestimo, LocalDate horaDevolucao, Leitor leitor, Livro livro) {
        this.setId();
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucao = horaDevolucao;
        this.leitor = leitor;
        this.livro = livro;
    }

    public void setId() {
        this.id = (int) (Math.random() * 100) + 1;
    }

    @Override
    public String toString() {
        DateTimeFormatter formatoBR = DateTimeFormatter.ofPattern("dd/MM/yy");
        return String.format("""
                Empréstimo [id %d] {
                    Data Empréstimo= %s
                    Data Devolução Prevista= %s
                    Leitor= [
                        %s
                    ]
                    Livro escolhido= [
                        %s
                    ]
                }
                """, this.id, this.dataEmprestimo.format(formatoBR), this.dataDevolucao.format(formatoBR),
                this.leitor, this.livro);

    }
}