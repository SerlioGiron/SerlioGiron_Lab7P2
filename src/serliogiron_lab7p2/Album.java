/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serliogiron_lab7p2;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author usuario
 */
public class Album extends Lanzamiento{
    ArrayList <Cancion> canciones = new ArrayList();
    int canciones_cant = 0;

    @Override
    public String toString() {
        return "Album{" + titulo + '}';
    }
    
    

    public ArrayList<Cancion> getCanciones() {
        return canciones;
    }

    public void setCanciones(ArrayList<Cancion> canciones) {
        this.canciones = canciones;
    }

    public int getCanciones_cant() {
        return canciones_cant;
    }

    public void setCanciones_cant(int canciones_cant) {
        this.canciones_cant = canciones_cant;
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
