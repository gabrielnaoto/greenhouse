/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.udesc.modelo.dao.core;

import br.udesc.modelo.entidade.Periodo;
import java.util.List;

/**
 *
 * @author ignoi
 */
public interface PeriodoDAO {
    
     public void inserir(Periodo a);

    public void editar(Periodo a);

    public void remover(Periodo a);

    public Periodo pesquisar(int id);

    public List<Periodo> listar();
    
}
