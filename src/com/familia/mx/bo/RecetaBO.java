package com.familia.mx.bo;

import com.familia.mx.entity.Recetas;
import java.sql.Connection;
import com.familia.mx.dao.RecetarioDAO;
import com.familia.mx.db.Conexion;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;

/**
 *
 * @author luis_
 */
public class RecetaBO {
    
    private String mensaje ="";
    private RecetarioDAO recetariodao = new RecetarioDAO();
    
    public String agregarReceta(Recetas receta ){
        Connection conneccion = Conexion.getConnection();
        try {
            mensaje =  recetariodao.agregarReceta(conneccion, receta);
            //conneccion.rollback();
        } catch (Exception e) {
            mensaje = mensaje + " " +e.getMessage();
        }finally{
            try {
                if(conneccion != null){
                    conneccion.close();
                }
            } catch (Exception e) {
                mensaje = mensaje + " " +e.getMessage();
            }
        }
    return mensaje;
}

public String modificarReceta( Recetas receta ){
            Connection conneccion = Conexion.getConnection();
        try {
            mensaje =  recetariodao.modificarReceta(conneccion, receta);
            //conneccion.rollback();
        } catch (Exception e) {
            mensaje = mensaje + " " +e.getMessage();
        }finally{
            try {
                if(conneccion != null){
                    conneccion.close();
                }
            } catch (Exception e) {
                mensaje = mensaje + " " +e.getMessage();
            }
        }
    return mensaje;
}

public String eliminarReceta(int id ){
            Connection conneccion = Conexion.getConnection();
        try {
            mensaje =  recetariodao.eliminarReceta(conneccion, id);
            //conneccion.rollback();
        } catch (Exception e) {
            mensaje = mensaje + " " +e.getMessage();
        }finally{
            try {
                if(conneccion != null){
                    conneccion.close();
                }
            } catch (Exception e) {
                mensaje = mensaje + " " +e.getMessage();
            }
        }
    return mensaje;
}

public void listarReceta(JTable tabla ){
    Connection conneccion = Conexion.getConnection();
    recetariodao.listarReceta(conneccion, tabla);
    try {
        conneccion.close();
    } catch (SQLException ex) {
    System.out.println(ex.getMessage());
    }
  }
public int getMaxid(){
      Connection conneccion = Conexion.getConnection();
    int id = recetariodao.getMaxid(conneccion);
    try {
        conneccion.close();
    } catch (SQLException ex) {
    System.out.println(ex.getMessage());
    }
    return id;
}
}
