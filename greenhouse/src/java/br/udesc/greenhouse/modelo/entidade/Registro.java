/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.udesc.greenhouse.modelo.entidade;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author ignoi
 */
@Entity
@Table(name = "registros")
public class Registro {

    @Id
    @GeneratedValue
    @Column
    private int registroid;

    @Column
    private String dia;

    @Column
    private String mes;

    @Column
    private String descricao;

    @Column
    private int ano;

    @JoinColumn
    @OneToMany
    private List<Usuario> usuarios;

    @JoinColumn
    @OneToMany
    private List<Oficina> oficinas;

    public Registro() {
        usuarios = new ArrayList<>();
        oficinas = new ArrayList<>();
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

    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(List<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    public List<Oficina> getOficinas() {
        return oficinas;
    }

    public void setOficinas(List<Oficina> oficinas) {
        this.oficinas = oficinas;
    }
    
    

}
