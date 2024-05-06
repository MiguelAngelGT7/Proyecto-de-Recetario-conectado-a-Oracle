package com.familia.mx.entity;

/**
 *
 * @author luis_
 */
public class clasificacion_ingredientes {
     //declarar las variables y columnas de la tabla
    private int id_clasificacion_ingredientes;
    private String clasificacion_nombre_ing;

    public clasificacion_ingredientes() {
    }

    public clasificacion_ingredientes(int id_clasificacion_ingredientes, String clasificacion_nombre_ing) {
        this.id_clasificacion_ingredientes = id_clasificacion_ingredientes;
        this.clasificacion_nombre_ing = clasificacion_nombre_ing;
    }

    public int getId_clasificacion_ingredientes() {
        return id_clasificacion_ingredientes;
    }

    public void setId_clasificacion_ingredientes(int id_clasificacion_ingredientes) {
        this.id_clasificacion_ingredientes = id_clasificacion_ingredientes;
    }

    public String getClasificacion_nombre_ing() {
        return clasificacion_nombre_ing;
    }

    public void setClasificacion_nombre_ing(String clasificacion_nombre_ing) {
        this.clasificacion_nombre_ing = clasificacion_nombre_ing;
    }

    @Override
    public String toString() {
        return "clasificacion_ingredientes{" + "id_clasificacion_ingredientes=" + id_clasificacion_ingredientes + ", clasificacion_nombre_ing=" + clasificacion_nombre_ing + '}';
    }

    
}
