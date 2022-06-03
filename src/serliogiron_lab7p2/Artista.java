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
public class Artista extends Usuario{
    String nombre_art;
    ArrayList <Cancion> canciones = new ArrayList();
    ArrayList <Album> albumes = new ArrayList();

    public Artista() {
        super();
    }
    
    

    public Artista(String nombre_art) {
        this.nombre_art = nombre_art;
    }
    
    

    @Override
    public String toString() {
        return "Artista{" + nombre_art + '}';
    }
    
    

    public String getNombre_art() {
        return nombre_art;
    }

    public void setNombre_art(String nombre_art) {
        this.nombre_art = nombre_art;
    }

    public ArrayList<Cancion> getCanciones() {
        return canciones;
    }

    public void setCanciones(ArrayList<Cancion> canciones) {
        this.canciones = canciones;
    }

    public ArrayList<Album> getAlbumes() {
        return albumes;
    }

    public void setAlbumes(ArrayList<Album> albumes) {
        this.albumes = albumes;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    
    
}
