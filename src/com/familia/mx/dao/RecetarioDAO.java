package com.familia.mx.dao;

import com.familia.mx.entity.Recetas;
import java.sql.*;
import javax.swing.JTable;

/**
 *
 * @author luis_
 */
public class RecetarioDAO {
    
    private String mensaje = "";

public String agregarReceta(Connection conneccion, Recetas receta ){
    PreparedStatement pst = null;
    String sql = "INSERT INTO Recetas (id_comentario, id_clasificacion, nombre_receta, descripcion_receta, \n" +
"tiempo_en_cocina, tiempo_coccion, utensilios, procedimiento_recetas, notas) VALUES(?,?,?,?,?,?,?,?,?); ";
    
    try {
        pst = conneccion.prepareStatement(sql);
        pst.setString(1, receta.getNombre_receta());
        pst.setString(2, receta.getDescripcion_receta());
        pst.setString(3, receta.getTiempo_en_cocina());
        pst.setString(4, receta.getTiempo_coccion());
        pst.setString(5, receta.getUtencilios());
        pst.setString(6, receta.getProcedimiento_recetas());
        pst.setString(7, receta.getNombre_receta());
        mensaje = "Guardado Correctamente";
        pst.execute();
        pst.close();
    } catch (SQLException e) {
        mensaje = "No se pudo guardado Correctamente \n" + e.getMessage();
    }
    return mensaje;
}

public String modificarReceta(Connection conneccion, Recetas receta ){
        PreparedStatement pst = null;
    String sql = "UPDATE Recetas  SET  nombre_receta = ?, descripcion_receta = ?, tiempo_en_cocina = ?, tiempo_coccion = ?, utensilios = ?, procedimiento_recetas = ?, notas = ?"
            + "WHERE  id_comentario = ? ";
    
    try {
        pst = conneccion.prepareStatement(sql);
        pst.setString(1, receta.getNombre_receta());
        pst.setString(2, receta.getDescripcion_receta());
        pst.setString(3, receta.getTiempo_en_cocina());
        pst.setString(4, receta.getTiempo_coccion());
        pst.setString(5, receta.getUtencilios());
        pst.setString(6, receta.getProcedimiento_recetas());
        pst.setString(7, receta.getNombre_receta());
        pst.setInt(8, receta.getId_recetario());
        mensaje = "Actualizado Correctamente";
        pst.execute();
        pst.close();
    } catch (SQLException e) {
        mensaje = "No se pudo modificar Correctamente \n" + e.getMessage();
    }    
    return mensaje;
}

public String eliminarReceta(Connection conneccion, int id ){
     PreparedStatement pst = null;
    String sql = "DELETE FROM Recetas WHERE  id_comentario = ? ";
    
    try {
        pst = conneccion.prepareStatement(sql);
        pst.setInt(1, id);
        mensaje = "Actualizado Correctamente";
        pst.execute();
        pst.close();
    } catch (SQLException e) {
        mensaje = "No se pudo modificar Correctamente \n" + e.getMessage();
    }
    return mensaje;
}

public void listarReceta(Connection conneccion, JTable tabla){

}
}
