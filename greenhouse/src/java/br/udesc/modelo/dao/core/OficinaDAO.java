/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.udesc.modelo.dao.core;

import br.udesc.modelo.entidade.Oficina;
import java.util.List;

/**
 *
 * @author ignoi
 */
public interface OficinaDAO {
    
     public void inserir(Oficina a);

    public void editar(Oficina a);

    public void remover(Oficina a);

    public Oficina pesquisar(int id);

    public List<Oficina> listar();
    
}
