/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectofinal.controller;

import java.util.List;
import proyectofinal.utils.FileManager;

public class UsuarioController {

    public static void crearAdminPorDefecto() {
        List<String> usuarios = FileManager.leerLineas("usuarios.txt");
        // Verifica si existe un usuario con el rol ADMIN
        boolean existe = usuarios.stream().anyMatch(l -> l.contains("|ADMIN"));
        if (!existe) {
            // Formato: username|password|nombre|cedula|tipo
            FileManager.escribirLinea("usuarios.txt", "admin|admin123|Administrador Principal|0000000000|ADMIN");
        }
    }

    public static boolean existeUsuario(String username) {
        return FileManager.leerLineas("usuarios.txt").stream()
                .anyMatch(l -> l.startsWith(username + "|"));
    }

    public static boolean existeCedula(String cedula) {
        return FileManager.leerLineas("usuarios.txt").stream()
                .anyMatch(l -> {
                    String[] partes = l.split("\\|");
                    return partes.length > 3 && partes[3].equals(cedula);
                });
    }

    public static String registrarEstudiante(String user, String pass, String nombre, String cedula) {
        if (user.isEmpty() || pass.isEmpty() || nombre.isEmpty()) {
            System.out.println("LOG: Error de registro: Campos de usuario, contraseña o nombre vacíos.");
            return "Todos los campos (usuario, contraseña, nombre) son obligatorios.";
        }
        
        if (!cedula.matches("\\d{10}")) {
            System.out.println("LOG: Error de registro: Formato de cédula inválido.");
            return "La cédula debe contener exactamente 10 dígitos numéricos.";
        }
        
        if (existeUsuario(user)) {
            System.out.println("LOG: Error de registro: El nombre de usuario '" + user + "' ya existe.");
            return "El nombre de usuario '" + user + "' ya está en uso. Por favor, elige otro.";
        }

        if (existeCedula(cedula)) {
            System.out.println("LOG: Error de registro: La cédula '" + cedula + "' ya está registrada.");
            return "La cédula '" + cedula + "' ya se encuentra registrada en el sistema.";
        }

        String linea = user + "|" + pass + "|" + nombre + "|" + cedula + "|ESTUDIANTE";
        FileManager.escribirLinea("usuarios.txt", linea);
        System.out.println("LOG: Estudiante '" + nombre + "' registrado exitosamente.");
        return null; 
    }

    public static String[] validarLogin(String user, String pass) {
        for (String l : FileManager.leerLineas("usuarios.txt")) {
            String[] p = l.split("\\|");
            if (p.length == 5 && p[0].equals(user) && p[1].equals(pass)) {
                return p; // [username, password, nombre, cedula, tipo]
            }
        }
        return null;
    }
}