/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.udesc.greenhouse.uc;

import br.udesc.greenhouse.modelo.dao.core.FactoryDAO;
import br.udesc.greenhouse.modelo.dao.core.RegistroDAO;
import br.udesc.greenhouse.modelo.entidade.Registro;
import java.util.List;

/**
 *
 * @author ignoi
 */
public class GerenciarRegistrosUC {

    private RegistroDAO dao;
    private List<Registro> registros;
    private Registro r;

    public GerenciarRegistrosUC() {
        dao = FactoryDAO.getFactoryDAO().getRegistroDAO();
        r = new Registro();
        registros = dao.listar();
    }
    
    

}
