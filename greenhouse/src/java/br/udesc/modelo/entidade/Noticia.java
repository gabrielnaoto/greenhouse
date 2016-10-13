/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.udesc.modelo.entidade;

import java.util.Date;

/**
 *
 * @author ignoi
 */
public class Noticia {

    private int noticiaid;
    private String foto;
    private String titulo;
    private boolean fixada;
    private String descricao;
    private Date data;

    public Noticia() {
    }

    public Noticia(int noticiaid, String foto, String titulo, boolean fixada, String descricao, Date data) {
        this.noticiaid = noticiaid;
        this.foto = foto;
        this.titulo = titulo;
        this.fixada = fixada;
        this.descricao = descricao;
        this.data = data;
    }

    public int getNoticiaid() {
        return noticiaid;
    }

    public void setNoticiaid(int noticiaid) {
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
