/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectofinal.model;

public class Estudiante extends Usuario {

    private String cedula;

    public Estudiante(String username, String password, String nombreCompleto, String cedula) {
        super(username, password, nombreCompleto);
        this.cedula = cedula;
    }

    public String getCedula() {
        return cedula;
    }
}
