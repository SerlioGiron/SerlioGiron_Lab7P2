/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serliogiron_lab7p2;

/**
 *
 * @author usuario
 */
public class Cancion {
    String titulo;
    double duracion;
    Album album;

    public Cancion() {
    }
    
    

    public Cancion(String titulo, double duracion, Album album) {
        this.titulo = titulo;
        this.duracion = duracion;
        this.album = album;
    }
    
    

    @Override
    public String toString() {
        return "Cancion{" + titulo + ", duracion: " + duracion + ", album: " + album + '}';
    }
    
    

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getDuracion() {
        return duracion;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }

    public Album getAlbum() {
        return album;
    }

    public void setAlbum(Album album) {
        this.album = album;
    }
    
    
}
