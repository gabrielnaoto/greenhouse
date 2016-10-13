/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.udesc.modelo.entidade;

/**
 *
 * @author ignoi
 */
public class Registro {

    private int registroid;
    private String dia;
    private String mes;
    private String descricao;
    private int ano;

    public Registro() {
    }

    public Registro(int registroid, String dia, String mes, String descricao, int ano) {
        this.registroid = registroid;
        this.dia = dia;
        this.mes = mes;
        this.descricao = descricao;
        this.ano = ano;
    }

    public int getRegistroid() {
        return registroid;
    }

    public void setRegistroid(int registroid) {
        this.registroid = registroid;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

}
