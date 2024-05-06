package com.familia.mx.entity;

/**
 *
 * @author luis_
 */
public class Ingredientes {
     //declarar las variables y columnas de la tabla
    private int id_ingredientes;
    private int id_clasificacion_ingredientes;
    private String nombre;
    private String unidad_de_medida;
    private String cantidad;

    public Ingredientes() {
    }

    public Ingredientes(int id_ingredientes, int id_clasificacion_ingredientes, String nombre, String unidad_de_medida, String cantidad) {
        this.id_ingredientes = id_ingredientes;
        this.id_clasificacion_ingredientes = id_clasificacion_ingredientes;
        this.nombre = nombre;
        this.unidad_de_medida = unidad_de_medida;
        this.cantidad = cantidad;
    }

    public int getId_ingredientes() {
        return id_ingredientes;
    }

    public void setId_ingredientes(int id_ingredientes) {
        this.id_ingredientes = id_ingredientes;
    }

    public int getId_clasificacion_ingredientes() {
        return id_clasificacion_ingredientes;
    }

    public void setId_clasificacion_ingredientes(int id_clasificacion_ingredientes) {
        this.id_clasificacion_ingredientes = id_clasificacion_ingredientes;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUnidad_de_medida() {
        return unidad_de_medida;
    }

    public void setUnidad_de_medida(String unidad_de_medida) {
        this.unidad_de_medida = unidad_de_medida;
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "Ingredientes_basicos{" + "id_ingredientes=" + id_ingredientes + ", id_clasificacion_ingredientes=" + id_clasificacion_ingredientes + ", nombre=" + nombre + ", unidad_de_medida=" + unidad_de_medida + ", cantidad=" + cantidad + '}';
    }
    
    
    
}