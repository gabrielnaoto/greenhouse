/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.udesc.greenhouse.bean;

import br.udesc.greenhouse.modelo.entidade.Noticia;
import br.udesc.greenhouse.uc.FormularioMensagemUC;
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
    private String assunto, corpo, nome, emailOrigem;

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

    public void sendEmail() {
        FormularioMensagemUC fm = new FormularioMensagemUC();
        fm.enviarEmail(assunto, corpo, nome, emailOrigem);
    }

    public List<Noticia> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(List<Noticia> usuarios) {
        this.usuarios = usuarios;
    }

    public GerenciarNoticiasUC getGerenciador() {
        return gerenciador;
    }

    public void setGerenciador(GerenciarNoticiasUC gerenciador) {
        this.gerenciador = gerenciador;
    }

    public Gson getG() {
        return g;
    }

    public void setG(Gson g) {
        this.g = g;
    }

    public String getAssunto() {
        return assunto;
    }

    public void setAssunto(String assunto) {
        this.assunto = assunto;
    }

    public String getCorpo() {
        return corpo;
    }

    public void setCorpo(String corpo) {
        this.corpo = corpo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmailOrigem() {
        return emailOrigem;
    }

    public void setEmailOrigem(String emailOrigem) {
        this.emailOrigem = emailOrigem;
    }
    

}
