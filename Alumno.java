import java.util.ArrayList;
import java.util.List;

/*
Clase principal:
Alumno: Representa a un estudiante con sus datos personales y sus asignaturas.
Funcionalidades de la Clase Alumno:
- Añadir asignaturas junto con sus notas.
- Modificar la nota de una asignatura específica.
- Calcular el promedio de todas las notas del alumno.
- Mostrar un boletin de notas que incluya todas las asignaturas y notas del alumno, junto con su promedio.

Definir la Clase Alumno:
Debe contener tres propiedades: nombre (String), apellidos y asignaturas, coleccion de asignaturas.
Implementar un constructor para inicializar las propiedades necesarias.
Proporcionar métodos getters y setters para cada propiedad.
Implementar el metodo informarAsignatura que incluya la nota tambien.
Implementar el metodo mostrarBoletin debe incluir nota media.
*/

public class Alumno {
  // atributos:
  private String nombre;
  private String apellidos;
  private List<Asignatura> asignaturas = new ArrayList<Asignatura>(); // le paso el tipo <Type> a la list 
  
  // constructor:
  public Alumno(String nombre, String apellidos) {
    this.nombre = nombre;
    this.apellidos = apellidos;
  }

  // metodos getters: 
  public String getNombre(){
    return nombre;
  }

  public String getApellidos() {
    return apellidos;
  }

  public List<Asignatura> getAsignatura(){
    return asignaturas;
  }

  // metodos setters:

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public void setApellidos(String apellidos) {
    this.apellidos = apellidos;
  }

  public void addAsignatura(String nombreAsignatura, double notaAsignatura) {
    Asignatura asignatura = new Asignatura(nombreAsignatura, notaAsignatura);
    this.asignaturas.add(asignatura);
  }

  public void updateAsignatura(String nombreAsignatura, double notaAsignatura) {
    int len = this.asignaturas.size();
    int index = 0;
    while (index < len) {
      Asignatura asignatura = this.asignaturas.get(index);
      if (asignatura.getNombre().equals(nombreAsignatura)) {
        asignatura.setNota(notaAsignatura);
        return;
      }
      index += 1;
    }
  }
  // Calcular el promedio de todas las notas del alumno.
  public double calcularPromedio(){
    double sumaNotas = 0;
    int len = asignaturas.size();

    for(Asignatura asignatura : asignaturas){
      sumaNotas += asignatura.getNota();
    }
    double promedio = sumaNotas / len;
    return promedio;
  }

  // Metodo para informarAsignatura + nota:
  public void informarAsignatura(Asignatura asignatura){
    System.out.println(asignatura.getNombre());
    System.out.println(asignatura.getNota());
  }

  // Metodo mostrarBoletin debe incluir nota media:
  public String mostrarBoletin(){
    StringBuilder sb = new StringBuilder();
    sb.append("\t1\t   2\t     3\t       4\t 5\n");
    sb.append("12345678901234567890123456789012345678901234567890\n");
    sb.append(String.format("Alumno: %s %s\n", getNombre(), getApellidos()));
    sb.append("Asignatura\t\t" + "\t\tNota\n");
    sb.append("-------------------------------------------------\n");
    // asignaturas + notas
    for(Asignatura asignatura : asignaturas){
      sb.append(String.format("%s\t\t\t\t\t%.1f\n", asignatura.getNombre(),asignatura.getNota()));
    }

    sb.append("-------------------------------------------------\n");
    sb.append(String.format("Nota Media:\t\t\t\t%.1f", calcularPromedio())); // calcularPromedio()));
    return sb.toString();
                            }
  
}
