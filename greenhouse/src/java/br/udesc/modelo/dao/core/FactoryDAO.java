/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.udesc.modelo.dao.core;

/**
 *
 * @author ignoi
 */
public abstract class FactoryDAO {
    
    public abstract NoticiaDAO getNoticiaDAO();
    
    public abstract OficinaDAO getOficinaDAO();
    
    public abstract PeriodoDAO getPeridoDAO();
    
    //TODO OTHER GETDAOS;
    
}
