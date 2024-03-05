
/*
Definir la Clase Asignatura:
Debe contener dos propiedades: nombre (String) y nota (double).
Implementar un constructor para inicializar estas propiedades.
Proporcionar métodos getters y setters para cada propiedad.
*/

public class Asignatura {
  // crear un lista con las asignaturas:
  // Borrar  String[] listaAsignaturas = {"Programacíon 101", "Git","POO & TDD, Python", "Introducción a Java"};

  // atributos:
  private String nombre;
  private double nota;

  // contructor:
  public Asignatura(String nombre, double nota) {
    this.nombre = nombre;
    this.nota = nota;
  }
  // metodos getters:
  public String getNombre() {
    return nombre;
  }

  public double getNota() {
    return nota;
  }
  // metodos setters:

  public void setNombre(String name) {
    this.nombre = name;
  }

  public void setNota(double nota) {
    this.nota = nota;
  }

}
