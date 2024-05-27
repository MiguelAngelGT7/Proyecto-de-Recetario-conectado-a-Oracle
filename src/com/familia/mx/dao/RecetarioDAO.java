package com.familia.mx.dao;

import com.familia.mx.entity.Recetas;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

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
        pst.setInt(1, receta.getId_recetario());
        pst.setString(2, receta.getNombre_receta());
        pst.setString(3, receta.getDescripcion_receta());
        pst.setString(4, receta.getTiempo_en_cocina());
        pst.setString(5, receta.getTiempo_coccion());
        pst.setString(6, receta.getUtencilios());
        pst.setString(7, receta.getProcedimiento_recetas());
        pst.setString(8, receta.getNombre_receta());
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
        mensaje = "Modificado Correctamente";
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
        mensaje = "Eliminar Correctamente";
        pst.execute();
        pst.close();
    } catch (SQLException e) {
        mensaje = "No se pudo Eliminar Correctamente \n" + e.getMessage();
    }
    return mensaje;
}

public void listarReceta(Connection conneccion, JTable tabla){
    DefaultTableModel model;
    String [] columnas = {"Id_recetario","Nombre_receta","Descripcion_receta","Tiempo_en_cocina","Tiempo_coccion","Utencilios","Procedimiento_recetas"};
    model = new DefaultTableModel(null, columnas);
    
    String sql = "SELECT * FROM RECETARIO ORDER BY Id_recetario";
    
    String [] filas = new String [7];
    Statement st = null;
    ResultSet rs= null;
    
    try {
        st = conneccion.createStatement();
        rs = st.executeQuery(sql);
        while (rs.next()){
            for (int i = 0; i < 7; i++) {
                filas[i] = rs.getString (i+1);
            }
            model.addRow(filas);
        }
        tabla.setModel(model);
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "No Se puede Mostrar la tabla ");
    }
}
public int getMaxid(Connection conneccion){
    int id = 0;
    PreparedStatement pst = null;
    ResultSet rs = null;
    String sql = "SELECT MAX(Id_recetario) FROM TB RECETARIO";//<---  REVISAR
    try {
        pst = conneccion.prepareStatement("SELECT MAX(Id_recetario)+1 as id FROM RECETARIO");
        rs= pst.executeQuery();
        if (rs.next()){
            id = rs.getInt(1);
        }
        pst.close();
        pst.close();
    } catch (Exception e) {
        System.out.println("Error al ostrar id" + e.getMessage() );
    }
    return id;
}
}
