/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reto5.controller;
import java.sql.SQLException;
import java.util.ArrayList;



//Modelos (acceso y objetos contenedores)
import reto5.model.dao.LiderPorCiudadDao;
import reto5.model.dao.CompraPorProveedorDao;
import reto5.model.dao.ProyectosCasaCampestreDao;
import reto5.model.vo.LiderPorCiudad;
import reto5.model.vo.CompraPorProveedor;
import reto5.model.vo.ProyectosCasaCampestre;

/**
 *
 * @author Windows 10
 */
public class ReportesController {
    private final CompraPorProveedorDao compraPorProveedorDao;
    private final ProyectosCasaCampestreDao proyectosCasaCampestreDao;
    private final LiderPorCiudadDao asesorPorCiudadDao;
    
    public ReportesController(){
        this.compraPorProveedorDao = new CompraPorProveedorDao();
        this.asesorPorCiudadDao = new LiderPorCiudadDao();
        this.proyectosCasaCampestreDao = new ProyectosCasaCampestreDao();

    }

    public ArrayList<LiderPorCiudad> consultarAsesorPorCiudad() throws SQLException {
        return this.asesorPorCiudadDao.rankingAsesorPorCiudad();
    }
    
    public ArrayList<CompraPorProveedor> consultarCompraPorProveedor() throws SQLException {
        return this.compraPorProveedorDao.rankingCompraPorProveedor();
    }

    public ArrayList<ProyectosCasaCampestre> consultarProyectosCasaCampestre() throws SQLException {
        return this.proyectosCasaCampestreDao.rankingProyectosCasaCampestres();
    }
}
