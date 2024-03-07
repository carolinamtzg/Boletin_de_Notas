import java.util.Scanner;
/*
La interacción con el usuario (por ejemplo, añadir alumnos, asignaturas, modificar notas, etc.)
se realizará a través del método main de la aplicación
simulando algunos escenarios para demostrar la funcionalidad del sistema.

Escribir código en el método main para crear objetos de tipo Alumno.
añadirles asignaturas y notas, modificar estas notas
y finalmente mostrar el boletín de notas para comprobar que el sistema funciona correctamente.
*/

public class Main {

  static Scanner scanner = new Scanner(System.in);
  public static void main(String[] args)  {

    String respuestaAddEstudiante = "Y";
    
    
    while(respuestaAddEstudiante.equals("Y")){
      String nombre = "";
      String apellidos = "";
  
      System.out.print("Nombre Alumno: ");
       nombre = scanner.next();

      System.out.print("Apellidos: ");
      apellidos = scanner.next();

      Alumno alumno = new Alumno(nombre, apellidos);

      // añadir asignaturas y notas al alumno:

      String respuestaAddAsignaturas = "Y";
      while(respuestaAddAsignaturas.equals("Y")){
        System.out.print("Asignatura: ");
        String nombreAsignatura = scanner.next();
        
        System.out.print("Nota: ");
        Double notaAsignatura = scanner.nextDouble();
        
        alumno.addAsignatura(nombreAsignatura, notaAsignatura);

        System.out.print("¿Desea agregar otra asignatura? (Y/N): ");
        respuestaAddAsignaturas = scanner.next().toUpperCase();
      }
      // imprimir el boletín de notas para comprobar que el sistema funciona correctamente:
      String boletin = alumno.mostrarBoletin();
      System.out.println(boletin);
      // modificar estas notas:
      // Preguntar si quiere modificar asignatura
      System.out.print("¿Quieres modificar alguna nota? (Y/N): ");
      String respuestaModifyAsignaturas = scanner.next().toUpperCase();

      while(respuestaModifyAsignaturas.equals("Y")){
        System.out.print("Asignatura: ");
        String nombreAsignatura = scanner.next();
        
        System.out.print("Nota: ");
        Double notaAsignatura = scanner.nextDouble();
        
        alumno.updateAsignatura(nombreAsignatura, notaAsignatura);
    
        // Mostrar boletin:
        boletin = alumno.mostrarBoletin();
        System.out.println(boletin);
        // Preguntar si quiere modificar otra nota:
        System.out.print("¿Quieres modificar alguna nota? (Y/N): ");
        respuestaModifyAsignaturas = scanner.next().toUpperCase();
        }
        
      System.out.print("¿Desea agregar otro estudiante? (Y/N): ");
      respuestaAddEstudiante = scanner.next().toUpperCase();
    }

  }
}
