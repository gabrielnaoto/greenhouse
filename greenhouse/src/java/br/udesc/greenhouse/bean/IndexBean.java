/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.udesc.greenhouse.bean;

import br.udesc.greenhouse.modelo.entidade.Noticia;
import br.udesc.greenhouse.uc.GerenciarNoticiasUC;
import com.google.gson.Gson;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author ignoi
 */
@ManagedBean
@ViewScoped
public class IndexBean {

    private List<Noticia> usuarios;
    private GerenciarNoticiasUC gerenciador;
    private Gson g;

    @PostConstruct
    public void init() {
        g = new Gson();
        gerenciador = new GerenciarNoticiasUC();
        usuarios = gerenciador.listar();
    }

    public List<Noticia> getNoticias() {
        return usuarios;
    }

    public void setNoticias(List<Noticia> usuarios) {
        this.usuarios = usuarios;
    }

    public String getJsonList() {
        System.out.println(g.toJson(usuarios));
        return (usuarios == null) ? "" : g.toJson(usuarios);
    }

}
