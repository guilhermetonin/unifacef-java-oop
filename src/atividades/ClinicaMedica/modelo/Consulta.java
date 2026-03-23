package atividades.ClinicaMedica.modelo;

import java.time.LocalDate;
public class Consulta {
    private int id;
    private LocalDate data;
    private double valorDaConsulta;
    private Medico medico;
    private Paciente paciente;

    public Consulta(LocalDate data, double valorDaConsulta, Medico medico, Paciente paciente) {
        this.setId();
        this.data = data;
        this.valorDaConsulta = valorDaConsulta;
        this.medico = medico;
        this.paciente = paciente;
    }

    public void setId() {
        this.id = (int) (Math.random() * 10 ) + 1;
    }

    public Consulta(int id, LocalDate data, double valorDaConsulta, Medico medico, Paciente paciente) {
        this.id = id;
        this.data = data;
        this.valorDaConsulta = valorDaConsulta;
        this.medico = medico;
        this.paciente = paciente;
    }

    @Override
    public String toString() {
        return "Consulta{" +
                "id=" + id +
                ", data=" + data +
                ", valorDaConsulta=" + valorDaConsulta +
                ", medico=" + medico +
                ", paciente=" + paciente +
                '}';
    }
}
