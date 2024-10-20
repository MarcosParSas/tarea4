package tarea4;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.Date;

/**
 * @author Marcos Paredes
 */

public class EjecutableAlumnos {


 public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	 SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");

	 // Solicitar la ruta del fichero
	 System.out.print("Introduce la ruta del fichero binario donde guardar los alumnos: ");
	 String rutaFichero = sc.nextLine();

	 try (FileOutputStream fos = new FileOutputStream(rutaFichero);
			 ObjectOutputStream oos = new ObjectOutputStream(fos)) {

	            // Pedir datos de 5 alumnos
	            for (int i = 0; i < 5; i++) {
	                System.out.println("\nAlumno " + (i + 1) + ":");

	                System.out.print("NIA: ");
	                int nia = sc.nextInt();
	                sc.nextLine();  // Limpiar el buffer del Scanner

	                System.out.print("Nombre: ");
	                String nombre = sc.nextLine();

	                System.out.print("Apellidos: ");
	                String apellidos = sc.nextLine();

	                System.out.print("Género (M/F): ");
	                char genero = sc.next().charAt(0);
	                sc.nextLine();  // Limpiar el buffer

	                System.out.print("Fecha de nacimiento (dd/MM/yyyy): ");
	                String fechaNacStr = sc.nextLine();
	                Date fechaNacimiento = null;
	                
	                try {
	                    fechaNacimiento = formatoFecha.parse(fechaNacStr);  // Convertir cadena a Date
	                } catch (ParseException e) {
	                    System.out.println("Error: Formato de fecha no válido.");
	                      
	                }
	                sc.nextLine();  // Limpiar el buffer

	                System.out.print("Ciclo: ");
	                String ciclo = sc.nextLine();

	                System.out.print("Curso: ");
	                String curso = sc.nextLine();

	                System.out.print("Grupo: ");
	                String grupo = sc.nextLine();

	                // Crear el objeto Alumno y guardarlo
	                Alumno alumno = new Alumno(nia, nombre, apellidos, genero, fechaNacimiento, ciclo, curso, grupo);
	                oos.writeObject(alumno);

	                System.out.println("Alumno " + (i + 1) + " guardado.");
	            }

	        } catch (IOException e) {
	            System.out.println("Error al escribir en el fichero: " + e.getMessage());
	        } finally {
	            sc.close();
	        }
	    
	}

}
