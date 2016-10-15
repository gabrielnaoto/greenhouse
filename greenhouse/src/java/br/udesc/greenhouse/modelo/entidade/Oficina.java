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
@Table(name = "oficinas")
public class Oficina {

    @Id
    @GeneratedValue
    @Column
    private int oficinaid;

    @Column
    private int capacidade;

    @Column
    private String nome;

    @Column
    private String descricao;

    @Column
    private String fotoDestaque;

    @Column
    private List<String> fotos;

    @Column
    private List<String> videos;

    @JoinColumn
    @OneToMany
    private List<Periodo> periodos;

    @JoinColumn
    @OneToMany
    private List<Usuario> usuarios;

    public Oficina() {
        fotos = new ArrayList<>();
        videos = new ArrayList<>();
        periodos = new ArrayList<>();
        usuarios = new ArrayList<>();

    }

    public int getOficinaid() {
        return oficinaid;
    }

    public void setOficinaid(int oficinaid) {
        this.oficinaid = oficinaid;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getFotoDestaque() {
        return fotoDestaque;
    }

    public void setFotoDestaque(String fotoDestaque) {
        this.fotoDestaque = fotoDestaque;
    }

    public List<String> getFotos() {
        return fotos;
    }

    public void setFotos(List<String> fotos) {
        this.fotos = fotos;
    }

    public List<String> getVideos() {
        return videos;
    }

    public void setVideos(List<String> videos) {
        this.videos = videos;
    }

    private void addFoto(String url) {
        fotos.add(url);
    }

    private void addVideo(String url) {
        videos.add(url);
    }

    public List<Periodo> getPeriodos() {
        return periodos;
    }

    public void setPeriodos(List<Periodo> periodos) {
        this.periodos = periodos;
    }

    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(List<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

}
