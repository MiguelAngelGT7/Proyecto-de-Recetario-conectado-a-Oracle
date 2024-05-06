package com.familia.mx.entity;

/**
 *
 * @author luis_
 */
public class Clasificacion {
    
    private int id_clasificacion;
    private String nombre_clasificacion;

    public Clasificacion() {
    }

    public Clasificacion(int id_clasificacion, String nombre_clasificacion) {
        this.id_clasificacion = id_clasificacion;
        this.nombre_clasificacion = nombre_clasificacion;
    }

    public int getId_clasificacion() {
        return id_clasificacion;
    }

    public void setId_clasificacion(int id_clasificacion) {
        this.id_clasificacion = id_clasificacion;
    }

    public String getNombre_clasificacion() {
        return nombre_clasificacion;
    }

    public void setNombre_clasificacion(String nombre_clasificacion) {
        this.nombre_clasificacion = nombre_clasificacion;
    }

    @Override
    public String toString() {
        return "Clasificacion{" + "id_clasificacion=" + id_clasificacion + ", nombre_clasificacion=" + nombre_clasificacion + '}';
    }
    
    
}
