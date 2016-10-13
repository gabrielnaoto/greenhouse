/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.udesc.modelo.dao.core;

import br.udesc.modelo.entidade.Registro;
import java.util.List;

/**
 *
 * @author ignoi
 */
public interface RegistroDAO {
    
     public void inserir(Registro a);

    public void editar(Registro a);

    public void remover(Registro a);

    public Registro pesquisar(int id);

    public List<Registro> listar();
    
}
