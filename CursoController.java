// proyectofinal.controller.CursoController.java

package proyectofinal.controller;

import java.util.List;
import proyectofinal.utils.FileManager;

public class CursoController {

    public static boolean existeCodigoCurso(String codigo) {
        var cursos = FileManager.leerLineas("cursos.txt");
        return cursos.stream()
                     .anyMatch(linea -> linea.startsWith(codigo + "|"));
    }

    public static String agregarCurso(String codigo, String nombre, String docente, double precio) {
        if (codigo.isEmpty() || nombre.isEmpty() || docente.isEmpty() || precio < 0) {
            System.out.println("LOG: Error al agregar curso: Campos inválidos o vacíos.");
            return "Datos del curso incompletos o inválidos.";
        }
        
        if (existeCodigoCurso(codigo)) {
            System.out.println("LOG: Error al agregar curso: El código '" + codigo + "' ya existe.");
            return "El código de curso '" + codigo + "' ya está registrado. Por favor, ingrese uno diferente.";
        }

        String lineaCurso = codigo + "|" + nombre + "|" + docente + "|" + String.format("%.2f", precio);
        FileManager.escribirLinea("cursos.txt", lineaCurso);
        System.out.println("LOG: Curso '" + nombre + "' con código '" + codigo + "' agregado exitosamente.");
        return null; // Indica éxito
    }

    public static List<String> obtenerCursos() {
        return FileManager.leerLineas("cursos.txt");
    }
}