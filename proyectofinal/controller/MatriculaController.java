/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectofinal.controller;

import com.lowagie.text.Document;
import com.lowagie.text.Font;
import com.lowagie.text.Paragraph;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfWriter;
import java.awt.Desktop;
import java.io.File;
import java.io.FileOutputStream;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JFileChooser;
import proyectofinal.utils.FileManager;

public class MatriculaController {

    public static List<String> cursosMatriculados(String username) {
        List<String> cursosMatriculadosDelEstudiante = new ArrayList<>();
        List<String> todasLasMatriculas = FileManager.leerLineas("matriculas.txt");

        System.out.println("LOG: Buscando cursos matriculados para: " + username);
        System.out.println("LOG: Total de matrículas en archivo: " + todasLasMatriculas.size());

        for (String matriculaLinea : todasLasMatriculas) {
            String[] partes = matriculaLinea.split("\\|");

            if (partes.length >= 2 && partes[0].equals(username)) {

                String cursoCompletoInfo = "";
                if (partes.length > 1) {
                    cursoCompletoInfo = String.join("|", java.util.Arrays.copyOfRange(partes, 1, partes.length));
                }

                cursosMatriculadosDelEstudiante.add(cursoCompletoInfo);
                System.out.println("LOG: Curso matriculado encontrado: " + cursoCompletoInfo);
            } else {
                System.out.println("LOG: Línea de matrícula ignorada (no coincide con usuario o formato incorrecto): " + matriculaLinea);
            }
        }
        System.out.println("LOG: Total de cursos matriculados encontrados para " + username + ": " + cursosMatriculadosDelEstudiante.size());
        return cursosMatriculadosDelEstudiante;
    }

    public static boolean matricular(String username, List<String> cursos) {
        List<String> actuales = cursosMatriculados(username);
        for (String c : cursos) {
            if (actuales.contains(c)) {
                return false; // Ya existe uno repetido
            }
        }

        for (String curso : cursos) {
            FileManager.escribirLinea("matriculas.txt", username + "|" + curso);
        }
        return true;
    }

    public static boolean generarFacturaPDF(String username, String nombreCompleto, List<String> cursos, double total) {
        try {
            JFileChooser fileChooser = new JFileChooser();
            fileChooser.setDialogTitle("Selecciona la carpeta para guardar la factura");
            fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);

            int userSelection = fileChooser.showSaveDialog(null);
            if (userSelection != JFileChooser.APPROVE_OPTION) {
                return false;
            }

            String path = fileChooser.getSelectedFile().getAbsolutePath();
            String fecha = new SimpleDateFormat("dd-MM-yyyy").format(new Date());
            String nombreArchivo = path + "/factura_" + username + "_" + fecha + ".pdf";

            Document doc = new Document();
            PdfWriter.getInstance(doc, new FileOutputStream(nombreArchivo));
            doc.open();

            doc.add(new Paragraph("FACTURA", new Font(Font.HELVETICA, 20, Font.BOLD)));
            doc.add(new Paragraph("Estudiante: " + nombreCompleto));
            doc.add(new Paragraph("Fecha: " + fecha));
            doc.add(new Paragraph("\n"));

            PdfPTable tabla = new PdfPTable(3);
            tabla.setWidths(new int[]{4, 4, 2});
            tabla.setWidthPercentage(100);

            tabla.addCell("Curso");
            tabla.addCell("Docente");
            tabla.addCell("Precio");

            for (String c : cursos) {
                String[] partes = c.split("\\|");
                tabla.addCell(partes[1]);
                tabla.addCell(partes[2]);
                tabla.addCell("$" + partes[3]);
            }

            doc.add(tabla);
            doc.add(new Paragraph("\n"));

            double subtotal = total / 1.15;
            double iva = total - subtotal;

            DecimalFormat df = new DecimalFormat("#.00");
            doc.add(new Paragraph("Subtotal: $" + df.format(subtotal)));
            doc.add(new Paragraph("IVA (15%): $" + df.format(iva)));
            doc.add(new Paragraph("TOTAL A PAGAR: $" + df.format(total)));

            doc.close();
            File archivo = new File(nombreArchivo);
            if (archivo.exists()) {
                Desktop.getDesktop().open(archivo);
            }

            return true;

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

}
