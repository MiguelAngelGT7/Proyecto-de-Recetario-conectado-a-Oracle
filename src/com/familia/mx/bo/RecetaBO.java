package com.familia.mx.bo;

import com.familia.mx.entity.Recetas;
import java.sql.Connection;
import com.familia.mx.dao.RecetarioDAO;
import com.familia.mx.db.Conexion;

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

public void listarReceta(){

}
}
