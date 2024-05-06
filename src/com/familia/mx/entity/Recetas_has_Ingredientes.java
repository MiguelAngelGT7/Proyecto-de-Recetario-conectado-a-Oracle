package com.familia.mx.entity;

/**
 *
 * @author luis_
 */
public class Recetas_has_Ingredientes {
    //declarar las variables y columnas de la tabla
    private int id_recetario;
    private String clasificacion_nombre_ing;

    public Recetas_has_Ingredientes() {
    }

    public Recetas_has_Ingredientes(int id_recetario, String clasificacion_nombre_ing) {
        this.id_recetario = id_recetario;
        this.clasificacion_nombre_ing = clasificacion_nombre_ing;
    }

    public int getId_recetario() {
        return id_recetario;
    }

    public void setId_recetario(int id_recetario) {
        this.id_recetario = id_recetario;
    }

    public String getClasificacion_nombre_ing() {
        return clasificacion_nombre_ing;
    }

    public void setClasificacion_nombre_ing(String clasificacion_nombre_ing) {
        this.clasificacion_nombre_ing = clasificacion_nombre_ing;
    }

    @Override
    public String toString() {
        return "Recetas_has_Ingredientes{" + "id_recetario=" + id_recetario + ", clasificacion_nombre_ing=" + clasificacion_nombre_ing + '}';
    }
    
    
}
