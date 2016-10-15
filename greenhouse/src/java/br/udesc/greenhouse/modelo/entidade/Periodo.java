/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.udesc.greenhouse.modelo.entidade;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author ignoi
 */
@Entity
@Table(name = "periodos")
public class Periodo {

    @Id
    @GeneratedValue
    @Column
    private int periodoid;

    @Column
    private Dia semana;

    @Column
    private String horaInicio;

    @Column
    private String horaFim;

    public Periodo() {
    }

    public Periodo(int periodoid, Dia semana, String horaInicio, String horaFim) {
        this.periodoid = periodoid;
        this.semana = semana;
        this.horaInicio = horaInicio;
        this.horaFim = horaFim;
    }

    public int getPeriodoid() {
        return periodoid;
    }

    public void setPeriodoid(int periodoid) {
        this.periodoid = periodoid;
    }

    public Dia getSemana() {
        return semana;
    }

    public void setSemana(Dia semana) {
        this.semana = semana;
    }

    public String getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(String horaInicio) {
        this.horaInicio = horaInicio;
    }

    public String getHoraFim() {
        return horaFim;
    }

    public void setHoraFim(String horaFim) {
        this.horaFim = horaFim;
    }

}
