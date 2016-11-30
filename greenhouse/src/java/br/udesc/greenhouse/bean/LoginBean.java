/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.udesc.greenhouse.bean;

import br.udesc.greenhouse.modelo.entidade.Usuario;
import br.udesc.greenhouse.uc.LoginUC;
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

/**
 *
 * @author ignoi
 */
@ManagedBean
@SessionScoped
public class LoginBean {

    private String usuario;
    private String senha;
    private Usuario user;

    private LoginUC uc;

    @PostConstruct
    public void init() {
        user = new Usuario();
        uc = new LoginUC();
        usuario = "";
        senha = "";
    }

    public String login() {
        user = uc.getUser(usuario, senha);
        if (user != null) {
            System.out.println(user);
            SessionUtil.setParam("usuario", user);
            return "index.jsf";
        } else {
            saveMessage("Problemas ao efetuar login", "Confira seus dados e tente novamente!");
            return null;
        }
    }

    public String logout() {
        System.out.println("saindo");
        SessionUtil.invalidate();
        return "/greenhouse/index.jsf";
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public static void saveMessage(String title, String msg) {
        FacesContext context = FacesContext.getCurrentInstance();
        context.addMessage(null, new FacesMessage(title, msg));
    }

    public Usuario getUser() {
        return user;
    }

    public void setUser(Usuario user) {
        this.user = user;
    }

}
