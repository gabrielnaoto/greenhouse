/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.udesc.greenhouse.modelo.entidade;

import java.io.Serializable;
import java.util.Date;
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
@Table(name = "noticias")
public class Noticia implements Serializable {

    @Id
    @GeneratedValue
    @Column
    private long noticiaid;

    @Column
    private String foto;

    @Column(nullable = false)
    private String titulo;

    @Column
    private boolean fixada;

    @Column(nullable = false)
    private String descricao;

    @Column
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date data;

    public Noticia() {
    }

    public Noticia(long noticiaid, String foto, String titulo, boolean fixada, String descricao, Date data) {
        this.noticiaid = noticiaid;
        this.foto = foto;
        this.titulo = titulo;
        this.fixada = fixada;
        this.descricao = descricao;
        this.data = data;
    }

    public long getNoticiaid() {
        return noticiaid;
    }

    public void setNoticiaid(long noticiaid) {
        this.noticiaid = noticiaid;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public boolean isFixada() {
        return fixada;
    }

    public void setFixada(boolean fixada) {
        this.fixada = fixada;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

}
