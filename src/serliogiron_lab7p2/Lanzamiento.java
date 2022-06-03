/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serliogiron_lab7p2;

import java.util.Date;

/**
 *
 * @author usuario
 */
public class Lanzamiento {
    String titulo;
    Date fecha;
    int likes;

    public Lanzamiento() {
    }
    
    

    public Lanzamiento(String titulo, Date fecha, int likes) {
        this.titulo = titulo;
        this.fecha = fecha;
        this.likes = likes;
    }
    
    

    @Override
    public String toString() {
        return "Lanzamiento{" + "titulo=" + titulo + ", fecha=" + fecha + ", likes=" + likes + '}';
    }
    
    

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }
    
    
}
