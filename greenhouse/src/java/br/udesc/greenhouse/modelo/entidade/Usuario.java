/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.udesc.greenhouse.modelo.entidade;

import java.io.Serializable;
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
@Table(name = "usuarios")
public class Usuario implements Serializable {

    @Id
    @GeneratedValue
    @Column
    private int usuarioid;

    @Column
    private String nome;

    @Column
    private String senha;

    @Column
    private String email;

    @Column
    private String cpf;

    @Column
    private boolean administrador;

    @JoinColumn
    @OneToMany
    private List<Periodo> periodos;

    @JoinColumn
    @OneToMany
    private List<Oficina> oficinas;

    public Usuario() {
        periodos = new ArrayList<>();
        oficinas = new ArrayList<>();
    }

    public int getUsuarioid() {
        return usuarioid;
    }

    public void setUsuarioid(int usuarioid) {
        this.usuarioid = usuarioid;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public boolean getAdministrador() {
        return administrador;
    }

    public void setAdministrador(boolean administrador) {
        this.administrador = administrador;
    }

    public List<Periodo> getPeriodos() {
        return periodos;
    }

    public void setPeriodos(List<Periodo> periodos) {
        this.periodos = periodos;
    }

    public List<Oficina> getOficinas() {
        return oficinas;
    }

    public void setOficinas(List<Oficina> oficinas) {
        this.oficinas = oficinas;
    }

    @Override
    public String toString() {
        return "Usuario{" + "usuarioid=" + usuarioid + ", nome=" + nome + ", senha=" + senha + ", email=" + email + ", cpf=" + cpf + ", administrador=" + administrador + ", periodos=" + periodos + ", oficinas=" + oficinas + '}';
    }

}
