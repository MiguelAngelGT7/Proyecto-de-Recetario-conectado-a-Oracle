package com.familia.mx.entity;

/**
 *
 * @author luis_
 */
public class Recetas {
    private int id_recetario;
    private int id_comentario;
    private int id_clasificacion;
    private String nombre_receta;
    private String descripcion_receta;
    private String tiempo_en_cocina;
    private String tiempo_coccion;
    private String utencilios;
    private String procedimiento_recetas;
    private String notas;

    public Recetas() {
    }

    public Recetas(int id_recetario, int id_comentario, int id_clasificacion, String nombre_receta, String descripcion_receta, String tiempo_en_cocina, String tiempo_coccion, String utencilios, String procedimiento_recetas, String notas) {
        this.id_recetario = id_recetario;
        this.id_comentario = id_comentario;
        this.id_clasificacion = id_clasificacion;
        this.nombre_receta = nombre_receta;
        this.descripcion_receta = descripcion_receta;
        this.tiempo_en_cocina = tiempo_en_cocina;
        this.tiempo_coccion = tiempo_coccion;
        this.utencilios = utencilios;
        this.procedimiento_recetas = procedimiento_recetas;
        this.notas = notas;
    }

    public int getId_recetario() {
        return id_recetario;
    }

    public void setId_recetario(int id_recetario) {
        this.id_recetario = id_recetario;
    }

    public int getId_comentario() {
        return id_comentario;
    }

    public void setId_comentario(int id_comentario) {
        this.id_comentario = id_comentario;
    }

    public int getId_clasificacion() {
        return id_clasificacion;
    }

    public void setId_clasificacion(int id_clasificacion) {
        this.id_clasificacion = id_clasificacion;
    }

    public String getNombre_receta() {
        return nombre_receta;
    }

    public void setNombre_receta(String nombre_receta) {
        this.nombre_receta = nombre_receta;
    }

    public String getDescripcion_receta() {
        return descripcion_receta;
    }

    public void setDescripcion_receta(String descripcion_receta) {
        this.descripcion_receta = descripcion_receta;
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

    public String getUtencilios() {
        return utencilios;
    }

    public void setUtencilios(String utencilios) {
        this.utencilios = utencilios;
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
        return "Recetas{" + "id_recetario=" + id_recetario + ", id_comentario=" + id_comentario + ", id_clasificacion=" + id_clasificacion + ", nombre_receta=" + nombre_receta + ", descripcion_receta=" + descripcion_receta + ", tiempo_en_cocina=" + tiempo_en_cocina + ", tiempo_coccion=" + tiempo_coccion + ", utencilios=" + utencilios + ", procedimiento_recetas=" + procedimiento_recetas + ", notas=" + notas + '}';
    }
    
    
    
}
