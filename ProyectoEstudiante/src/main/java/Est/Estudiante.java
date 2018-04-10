package Est;

import java.util.Arrays;

public class Estudiante implements Comparable<Estudiante> {

  private int edad;
  private String nombre;
  private int id;
  private Universidad universidad;

  public Estudiante(int edad, String nombre, int id, Universidad universidad) {
    this.edad = edad;
    this.nombre = nombre;
    this.id = id;
    this.universidad = universidad;
  }

  public void setEdad(int edad){
    this.edad = edad;
  }
  public int getEdad(){
    return edad;
  }
  public void setNombre(String nombre){
    this.nombre = nombre;
  }
  public String getNombre(){
    return nombre;
  }
  public void setId(int id){
    this.id = id;
  }
  public int getId(){
    return id;
  }
  public void setUniv(Universidad universidad){
    this.universidad = universidad;
  }
  public Universidad getUni(){
    return universidad;
  }
  @Override
  public int compareTo(Estudiante e){
    if (edad < e.getEdad()) {
      return -1;
    }
    if (edad > e.getEdad()) {
      return 1;
    }
    return 0;
  }
}
