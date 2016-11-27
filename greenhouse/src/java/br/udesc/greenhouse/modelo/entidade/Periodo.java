/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.udesc.greenhouse.modelo.entidade;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;

/**
 *
 * @author ignoi
 */
@Entity
@Table(name = "periodos")
public class Periodo implements Serializable {

    @Id
    @GeneratedValue
    @Column
    private long periodoid;

    @Column(nullable = false)
    private String diaDaSemana;

    @Column(nullable = false)
    @Temporal(javax.persistence.TemporalType.TIME)
    private Date horaInicio;

    @Column(nullable = false)
    @Temporal(javax.persistence.TemporalType.TIME)
    private Date horaFim;

    public Periodo() {
    }

    public long getPeriodoid() {
        return periodoid;
    }

    public void setPeriodoid(long periodoid) {
        this.periodoid = periodoid;
    }

    public String getDiaDaSemana() {
        return diaDaSemana;
    }

    public void setDiaDaSemana(String diaDaSemana) {
        this.diaDaSemana = diaDaSemana;
    }

    public Date getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(Date horaInicio) {
        this.horaInicio = horaInicio;
    }

    public Date getHoraFim() {
        return horaFim;
    }

    public void setHoraFim(Date horaFim) {
        this.horaFim = horaFim;
    }

    @Override
    public String toString() {
        return diaDaSemana + " - " + extrairData(horaInicio) + " às " + extrairData(horaFim);
    }

    private String extrairData(Date date) {
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
        return sdf.format(date);
    }

}
