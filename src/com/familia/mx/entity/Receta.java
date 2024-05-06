package com.familia.mx.entity;

/**
 *
 * @author luis_
 */
public class Receta {
    private int idReceta;
    private String nombre;
    private String descripcion;
    private String tiempo_en_cocina;
    private String tiempo_coccion;
    private String utensilios;
    private String procedimiento_recetas;
    private String notas;

    public Receta() {
    }

    public Receta(int idReceta, String nombre, String descripcion, String tiempo_en_cocina, String tiempo_coccion, String utensilios, String procedimiento_recetas, String notas) {
        this.idReceta = idReceta;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.tiempo_en_cocina = tiempo_en_cocina;
        this.tiempo_coccion = tiempo_coccion;
        this.utensilios = utensilios;
        this.procedimiento_recetas = procedimiento_recetas;
        this.notas = notas;
    }

    public int getIdReceta() {
        return idReceta;
    }

    public void setIdReceta(int idReceta) {
        this.idReceta = idReceta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getTiempo_en_cocina() {
        return tiempo_en_cocina;
    }

    public void setTiempo_en_cocina(String tiempo_en_cocina) {
        this.tiempo_en_cocina = tiempo_en_cocina;
    }

    public String getTiempo_coccion() {
        return tiempo_coccion;
    }

    public void setTiempo_coccion(String tiempo_coccion) {
        this.tiempo_coccion = tiempo_coccion;
    }

    public String getUtensilios() {
        return utensilios;
    }

    public void setUtensilios(String utensilios) {
        this.utensilios = utensilios;
    }

    public String getProcedimiento_recetas() {
        return procedimiento_recetas;
    }

    public void setProcedimiento_recetas(String procedimiento_recetas) {
        this.procedimiento_recetas = procedimiento_recetas;
    }

    public String getNotas() {
        return notas;
    }

    public void setNotas(String notas) {
        this.notas = notas;
    }

    @Override
    public String toString() {
        return "Receta{" + "idReceta=" + idReceta + ", nombre=" + nombre + ", descripcion=" + descripcion + ", tiempo_en_cocina=" + tiempo_en_cocina + ", tiempo_coccion=" + tiempo_coccion + ", utensilios=" + utensilios + ", procedimiento_recetas=" + procedimiento_recetas + ", notas=" + notas + '}';
    }
    
    
}
