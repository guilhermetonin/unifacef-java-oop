package atividades.TodoParte.ClinicaMedica;

import atividades.TodoParte.ClinicaMedica.modelo.Consulta;
import atividades.TodoParte.ClinicaMedica.modelo.Medico;
import atividades.TodoParte.ClinicaMedica.modelo.Paciente;

import java.time.LocalDate;

public class Main {
    static void main(String[] args) {

        Medico m1 = new Medico("Roger" ,"Oftalmologista");
        Paciente p1 = new Paciente("Miguel", "123.123.123-12");

        LocalDate data = LocalDate.of(2026, 5, 20);
        Consulta c1 = new Consulta(data, 200, m1, p1);

        System.out.println(c1);
    }
}
