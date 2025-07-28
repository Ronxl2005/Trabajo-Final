/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectofinal.model;

public class Curso {

    private String codigo;
    private String nombre;
    private Docente docente;
    private double precio;

    public Curso(String codigo, String nombre, Docente docente, double precio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.docente = docente;
        this.precio = precio;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public Docente getDocente() {
        return docente;
    }

    public double getPrecio() {
        return precio;
    }
}
