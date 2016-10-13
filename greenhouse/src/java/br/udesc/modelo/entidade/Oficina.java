/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.udesc.modelo.entidade;

import java.util.List;

/**
 *
 * @author ignoi
 */
public class Oficina {

    private int oficinaid;
    private int capacidade;
    private String nome;
    private String descricao;
    private String fotoDestaque;
    private List<String> fotos;
    private List<String> videos;

    public Oficina() {
    }

    public Oficina(int oficinaid, int capacidade, String nome, String descricao, String fotoDestaque, List<String> fotos, List<String> videos) {
        this.oficinaid = oficinaid;
        this.capacidade = capacidade;
        this.nome = nome;
        this.descricao = descricao;
        this.fotoDestaque = fotoDestaque;
        this.fotos = fotos;
        this.videos = videos;
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
    
    private void addFoto(String url){
        fotos.add(url);
    }
    
    private void addVideo(String url){
        videos.add(url);
    }

}
