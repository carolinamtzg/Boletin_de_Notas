import java.util.List;
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
    // atributos:
    String nombre = "Jose";
    String apellidos = "Avila";
    String nombreAsignatura = "Math";
    double notaAsignatura = 10;
    //List<Asignatura> asignaturas = Alumno.asignaturas;

    // String respuesta = "N";
    //List asignatura = ;

    

      // System.out.print("Nombre del Alumno: ");
      // nombre = scanner.nextLine();

      // System.out.print("Apellidos del Alumno: ");
      // apellidos = scanner.nextLine();


      // System.out.print("Asignatura: ");
      // nombre_asignatura = scanner.nextLine();

      // System.out.print("Nota: ");
      // nota_asignatura = scanner.nextDouble();

      // constructor:
      Alumno alumno = new Alumno(nombre, apellidos);
      // alumno = { "nombre": "Jose", "apellidos": "Avila", "asignaturas": [] }

      alumno.addAsignatura(nombreAsignatura, notaAsignatura);
      // alumno = { "nombre": "Jose", "apellidos": "Avila", 
      //            "asignaturas": [ { "nombre": "Math", "nota": 10 } ] }
      alumno.addAsignatura("Python", 10);
      // alumno = { "nombre": "Jose", "apellidos": "Avila", 
      //            "asignaturas": [ { "nombre": "Math", "nota": 10 }, { "nombre": "Python", "nota": 10 } ] }

      alumno.setNombre("Caro");
      // alumno = { "nombre": "Caro", "apellidos": "Avila", 
      //            "asignaturas": [ { "nombre": "Math", "nota": 10 }, { "nombre": "Python", "nota": 10 } ] }
      
    // imprimir el boletín de notas para comprobar que el sistema funciona correctamente
    String boletin = alumno.mostrarBoletin();
    System.out.println(boletin);

    System.out.print("¿Desea continuar? (Y/N): ");
    // respuesta = scanner.nextLine();

    // metodos:

    // añadir asignaturas y notas al alumno
    // modificar estas notas
  }
}
