/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.udesc.greenhouse.bean;

import br.udesc.greenhouse.modelo.entidade.Usuario;
import br.udesc.greenhouse.uc.GerenciarUsuariosUC;
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

    private List<Usuario> usuarios;
    private GerenciarUsuariosUC gerenciador;
    private Gson g;

    @PostConstruct
    public void init() {
        g = new Gson();
        gerenciador = new GerenciarUsuariosUC();
        usuarios = gerenciador.listar();
    }

    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(List<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    public String getJsonList() {
        System.out.println(g.toJson(usuarios));
        return (usuarios == null) ? "" : g.toJson(usuarios);
    }

}
