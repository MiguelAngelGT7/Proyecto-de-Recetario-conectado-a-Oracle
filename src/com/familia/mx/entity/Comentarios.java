package com.familia.mx.entity;

/**
 *
 * @author luis_
 */
public class Comentarios {
    //declare las variables de la tabla
    private int id_comentario;
    private String nombre;
    private int calificacion;
    private String comentario;

    public Comentarios() {
    }

    public Comentarios(int id_comentario, String nombre, int calificacion, String comentario) {
        this.id_comentario = id_comentario;
        this.nombre = nombre;
        this.calificacion = calificacion;
        this.comentario = comentario;
    }

    public int getId_comentario() {
        return id_comentario;
    }

    public void setId_comentario(int id_comentario) {
        this.id_comentario = id_comentario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    @Override
    public String toString() {
        return "Comentarios{" + "id_comentario=" + id_comentario + ", nombre=" + nombre + ", calificacion=" + calificacion + ", comentario=" + comentario + '}';
    }
    
    
}
