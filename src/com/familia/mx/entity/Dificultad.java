package com.familia.mx.entity;

/**
 *
 * @author luis_
 */
public class Dificultad {
    private int idDificultad;
    private String dificultad;

    public Dificultad() {
    }

    public Dificultad(int idDificultad, String dificultad) {
        this.idDificultad = idDificultad;
        this.dificultad = dificultad;
    }

    public int getIdDificultad() {
        return idDificultad;
    }

    public void setIdDificultad(int idDificultad) {
        this.idDificultad = idDificultad;
    }

    public String getDificultad() {
        return dificultad;
    }

    public void setDificultad(String dificultad) {
        this.dificultad = dificultad;
    }

    @Override
    public String toString() {
        return "Dificultad{" + "idDificultad=" + idDificultad + ", dificultad=" + dificultad + '}';
    }
    
    
    
    
}
