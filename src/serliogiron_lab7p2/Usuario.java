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
public class Usuario {
    String username;
    String password;
    int edad;

    public Usuario() {
    }
    
    

    public Usuario(String username, String password, int edad) {
        this.username = username;
        this.password = password;
        this.edad = edad;
    }
    
    

    @Override
    public String toString() {
        return "Usuario{" + username + '}';
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
