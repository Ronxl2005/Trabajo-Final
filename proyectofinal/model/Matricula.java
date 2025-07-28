/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectofinal.model;

import java.util.List;

public class Matricula {

    private Estudiante estudiante;
    private List<Curso> cursosSeleccionados;

    public Matricula(Estudiante estudiante, List<Curso> cursosSeleccionados) {
        this.estudiante = estudiante;
        this.cursosSeleccionados = cursosSeleccionados;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public List<Curso> getCursosSeleccionados() {
        return cursosSeleccionados;
    }
}
