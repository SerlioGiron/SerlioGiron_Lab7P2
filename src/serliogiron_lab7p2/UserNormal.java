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
public class UserNormal extends Usuario{
    ArrayList <Cancion> favoritas = new ArrayList();
    ArrayList <ListaR> listasReproducciones = new ArrayList();
    ArrayList <ListaR> listasMegusta = new ArrayList();

    public UserNormal() {
        super();
    }
    
    

    @Override
    public String toString() {
        return "UserNormal{" + username +'}';
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
    
    

    public ArrayList<Cancion> getFavoritas() {
        return favoritas;
    }

    public void setFavoritas(ArrayList<Cancion> favoritas) {
        this.favoritas = favoritas;
    }

    public ArrayList<ListaR> getListasReproducciones() {
        return listasReproducciones;
    }

    public void setListasReproducciones(ArrayList<ListaR> listasReproducciones) {
        this.listasReproducciones = listasReproducciones;
    }

    public ArrayList<ListaR> getListasMegusta() {
        return listasMegusta;
    }

    public void setListasMegusta(ArrayList<ListaR> listasMegusta) {
        this.listasMegusta = listasMegusta;
    }
    
    
}
