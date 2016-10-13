/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.udesc.modelo.dao.core;

import br.udesc.modelo.entidade.Noticia;
import java.util.List;

/**
 *
 * @author ignoi
 */
public interface NoticiaDAO {
    
     public void inserir(Noticia a);

    public void editar(Noticia a);

    public void remover(Noticia a);

    public Noticia pesquisar(int id);

    public List<Noticia> listar();
    
}
