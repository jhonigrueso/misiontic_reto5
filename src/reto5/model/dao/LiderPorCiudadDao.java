package reto5.model.dao;

//Estructura de datos
import java.util.ArrayList;

//Librerías para SQL y Base de Datos
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

//Clase para conexión
import reto5.util.JDBCUtilities;

//Encapsulamiento de los datos
import reto5.model.vo.LiderPorCiudad;

public class LiderPorCiudadDao {
    //Obtener los proyectos por Tipo en la ciudad de 
    public ArrayList<LiderPorCiudad> rankingAsesorPorCiudad() throws SQLException {

        ArrayList<LiderPorCiudad> respuesta = new ArrayList<LiderPorCiudad>();
        Connection conexion = JDBCUtilities.getConnection();

        try{       

            String consulta =   "SELECT ID_Lider, Nombre, Primer_Apellido, Ciudad_Residencia "+
                                "FROM Lider "+
                                "ORDER BY Ciudad_Residencia ASC";


            PreparedStatement statement = conexion.prepareStatement(consulta);
            ResultSet resultSet = statement.executeQuery();

            //Recorrer los registros en los VO específicos
            while(resultSet.next()){
                LiderPorCiudad asesorPorCiudad = new LiderPorCiudad();
                asesorPorCiudad.setIdLider(resultSet.getInt("ID_Lider"));
                asesorPorCiudad.setNombre(resultSet.getString("Nombre"));
                asesorPorCiudad.setPrimerApellido(resultSet.getString("Primer_Apellido"));
                asesorPorCiudad.setCiudadResidencia(resultSet.getString("Ciudad_Residencia"));

                //Se agrega cada registro como un objeto del ArrayList que contiene la consulta
                respuesta.add(asesorPorCiudad);
            }

            resultSet.close();
            statement.close();

        }catch(SQLException e){
            System.err.println("Error consultando los proyectos de tipo Apartaestudio en Quibdo: "+e);
        }finally{
            if(conexion != null){
                conexion.close();
            }
        }

        //Retornar la colección de vo's
        return respuesta;
    }     
}
