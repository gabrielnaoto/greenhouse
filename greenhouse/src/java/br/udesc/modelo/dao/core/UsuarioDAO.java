/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.udesc.modelo.dao.core;

import br.udesc.modelo.entidade.Usuario;
import java.util.List;

/**
 *
 * @author ignoi
 */
public interface UsuarioDAO {

    public void inserir(Usuario a);

    public void editar(Usuario a);

    public void remover(Usuario a);

    public Usuario pesquisar(int id);

    public List<Usuario> listar();

}
