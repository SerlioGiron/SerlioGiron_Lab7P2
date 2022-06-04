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
public class Single extends Lanzamiento{
    Cancion cancion;

    public Single() {
        super();
    }
    
    

    public Single(Cancion cancion) {
        this.cancion = cancion;
    }
    
    

    @Override
    public String toString() {
        return "Single{" + "cancion: " + cancion.getTitulo() + '}';
    }
    
    

    public Cancion getCancion() {
        return cancion;
    }

    public void setCancion(Cancion cancion) {
        this.cancion = cancion;
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
