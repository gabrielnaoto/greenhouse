/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.udesc.greenhouse.bean;

import br.udesc.greenhouse.modelo.entidade.Usuario;
import br.udesc.greenhouse.uc.GerenciarUsuariosUC;
import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import org.primefaces.context.RequestContext;
import org.primefaces.event.SelectEvent;
import org.primefaces.event.UnselectEvent;

/**
 *
 * @author ignoi
 */
@ManagedBean
@ViewScoped
public class UsuarioBean implements Serializable {

    private List<Usuario> usuarios;
    private List<Usuario> selecionados;
    private List<Usuario> filtrados;
    private Usuario selecionado;
    private Usuario novo;
    private GerenciarUsuariosUC gerenciador;

    @PostConstruct
    public void init() {
        gerenciador = new GerenciarUsuariosUC();
        novo = new Usuario();
        listar();
    }

    public void inserir(ActionEvent actionEvent) {
        System.out.println("inseri aqui");
        if (gerenciador.inserir(novo)) {
            novo = new Usuario();
            RequestContext.getCurrentInstance().execute("PF('dlg1').hide();");
            notificar("Sucesso", "Usuário inserido com sucesso!");
        } else {
            notificar("Falha", "Erro ao inserir usuário!");
        }
        listar();
    }

    public void editar(ActionEvent actionEvent) {
        if (selecionado != null) {
            System.out.println("editei aqui");
            if (gerenciador.editar(selecionado)) {
                RequestContext.getCurrentInstance().execute("PF('dlg2').hide();");
                notificar("Sucesso", "Usuário editado com sucesso!");
            } else {
                notificar("Falha", "Erro ao editar usuário!");
            }
            listar();
            selecionado = null;
        } else {
            notificar("Falha", "É necessário selecionar um usuário para editar.");
        }
    }

    public void remover(ActionEvent actionEvent) {
        if (selecionado == null) {
            notificar("Falha", "É necessário selecionar um usuário antes de excluir.");
        } else {
            if (gerenciador.remover(selecionado.getUsuarioid())) {
                notificar("Sucesso", "Usuário removido com sucesso!");
            } else {
                notificar("Falha", "Erro ao remover usuário!");
            }
            listar();
        }
    }

    public void listar() {
        System.out.println("listei aqui");
        this.usuarios = gerenciador.listar();
    }

    public void onRowSelect(SelectEvent event) {
        selecionado = ((Usuario) event.getObject());
        System.out.println(selecionado.toString() + " aqui");
    }

    public void onRowUnselect(UnselectEvent event) {
        selecionado = null;
    }

    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(List<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    public Usuario getSelecionado() {
        return selecionado;
    }

    public void setSelecionado(Usuario selecionado) {
        this.selecionado = selecionado;
    }

    public void notificar(String title, String msg) {
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(title, msg));
    }

    public List<Usuario> getSelecionados() {
        return selecionados;
    }

    public void setSelecionados(List<Usuario> selecionados) {
        this.selecionados = selecionados;
    }

    public Usuario getNovo() {
        return novo;
    }

    public void setNovo(Usuario novo) {
        this.novo = novo;
    }

    public List<Usuario> getFiltrados() {
        return filtrados;
    }

    public void setFiltrados(List<Usuario> filtrados) {
        this.filtrados = filtrados;
    }

}
