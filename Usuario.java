/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectofinal.model;

public abstract class Usuario {

    protected String username;
    protected String password;
    protected String nombreCompleto;

    public Usuario(String username, String password, String nombreCompleto) {
        this.username = username;
        this.password = password;
        this.nombreCompleto = nombreCompleto;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }
}
