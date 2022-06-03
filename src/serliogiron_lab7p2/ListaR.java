/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serliogiron_lab7p2;

import java.util.ArrayList;

/**
 *
 * @author usuario
 */
public class ListaR {
    String nombre;
    int likes = 0;
    ArrayList <Cancion> canciones = new ArrayList();

    
    
    public ListaR(String nombre) {
        this.nombre = nombre;
    }
    
    

    @Override
    public String toString() {
        return "ListaR{" + nombre + " likes " + likes + '}';
    }
    
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public ArrayList<Cancion> getCanciones() {
        return canciones;
    }

    public void setCanciones(ArrayList<Cancion> canciones) {
        this.canciones = canciones;
    }
    
    
}
