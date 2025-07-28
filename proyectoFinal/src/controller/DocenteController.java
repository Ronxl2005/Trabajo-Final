/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.List;
import utils.FileManager.FileManager;

/**
 *
 * @author Alis
 */
//ALISSON
public class DocenteController {
        public static boolean existeCedulaDocente(String cedula) {
        List<String> docentes = FileManager.leerLineas("docentes.txt");
        for (String linea : docentes) { 
            String[] partes = linea.split("\\|");
            if (partes.length > 1 && partes[1].equals(cedula)) {
                return true; // La cédula ya existe
            }
        }
        return false; // La cédula no existe
    }

    public static String agregarDocente(String nombre, String cedula) {
        if (nombre.trim().isEmpty()) {
            System.out.println("LOG: Error al agregar docente: El nombre no puede estar vacío.");
            return "El nombre del docente no puede estar vacío.";
        }
        if (!cedula.matches("\\d{10}")) {
            System.out.println("LOG: Error al agregar docente: La cédula debe contener exactamente 10 dígitos numéricos.");
            return "La cédula debe contener exactamente 10 dígitos numéricos.";
        }

        if (existeCedulaDocente(cedula)) {
            System.out.println("LOG: Error al agregar docente: La cédula '" + cedula + "' ya está registrada para otro docente.");
            return "La cédula '" + cedula + "' ya está registrada para otro docente. Por favor, ingrese una diferente.";
        }

        String lineaDocente = nombre.trim() + "|" + cedula;
        FileManager.escribirLinea("docentes.txt", lineaDocente);
        System.out.println("LOG: Docente '" + nombre + "' con cédula '" + cedula + "' agregado exitosamente.");
        return null; // Indica éxito
    }

    public static List<String> obtenerDocentes() {
        return FileManager.leerLineas("docentes.txt");
    }
}
    }  
