/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.udesc.greenhouse.bean;

import br.udesc.greenhouse.modelo.dao.core.FactoryDAO;
import br.udesc.greenhouse.modelo.dao.core.NoticiaDAO;
import br.udesc.greenhouse.modelo.dao.core.OficinaDAO;
import br.udesc.greenhouse.modelo.dao.core.UsuarioDAO;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import org.primefaces.model.chart.Axis;
import org.primefaces.model.chart.AxisType;
import org.primefaces.model.chart.CategoryAxis;
import org.primefaces.model.chart.LineChartModel;
import org.primefaces.model.chart.LineChartSeries;

/**
 *
 * @author ignoi
 */
@ManagedBean
@ViewScoped
public class GeralBean {

    private int usuarios;
    private int noticias;
    private int oficinas;

    private UsuarioDAO usuariodao;
    private NoticiaDAO noticiadao;
    private OficinaDAO oficinadao;

    private LineChartModel areaModel;

    public LineChartModel getAreaModel() {
        return areaModel;
    }

    @PostConstruct
    public void init() {
        usuariodao = FactoryDAO.getFactoryDAO().getUsuarioDAO();
        noticiadao = FactoryDAO.getFactoryDAO().getNoticiaDAO();
        oficinadao = FactoryDAO.getFactoryDAO().getOficinaDAO();

        usuarios = usuariodao.listar().size();
        oficinas = oficinadao.listar().size();
        noticias = noticiadao.listar().size();
        
        createAreaModel();
    }

    public int getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(int usuarios) {
        this.usuarios = usuarios;
    }

    public int getNoticias() {
        return noticias;
    }

    public void setNoticias(int noticias) {
        this.noticias = noticias;
    }

    public int getOficinas() {
        return oficinas;
    }

    public void setOficinas(int oficinas) {
        this.oficinas = oficinas;
    }

    private void createAreaModel() {
        areaModel = new LineChartModel();

        LineChartSeries colaboradores = new LineChartSeries();
        colaboradores.setFill(true);
        colaboradores.setLabel("Colaboradores");
        
        colaboradores.set("domingo", 0);
        colaboradores.set("segunda-feira", 3);
        colaboradores.set("quarta-feira", 5);
        colaboradores.set("quinta-feira", 6);
        colaboradores.set("sexta-feira", 2);
        colaboradores.set("sábado", 1);
       

        areaModel.addSeries(colaboradores);

        areaModel.setTitle("Atividades registradas última semana");
        areaModel.setLegendPosition("ne");
        areaModel.setStacked(true);
        areaModel.setShowPointLabels(true);

        Axis xAxis = new CategoryAxis("Dia da semana");
        areaModel.getAxes().put(AxisType.X, xAxis);
        Axis yAxis = areaModel.getAxis(AxisType.Y);
        yAxis.setLabel("Número de atividades (dia)");
        
        
        yAxis.setMin(0);
        yAxis.setMax(10);
    }

}
