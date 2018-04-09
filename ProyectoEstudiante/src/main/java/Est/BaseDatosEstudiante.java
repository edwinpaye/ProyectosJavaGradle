package Est;
import java.util.*;
public class BaseDatosEstudiante{

  ArrayList<Estudiante> estudiantes;
  int size;

  public BaseDatosEstudiante(int d){
    this.estudiantes = new ArrayList<Estudiante>();
    this.size = d;
  }

  public void llenar(){
    Scanner scn = new Scanner(System.in);
    Estudiante estudiant;

    for (int i=0; i<size; i++) {
      System.out.println("Digite la edad del estudiante: ");
      int edad = scn.nextInt();
      System.out.println("Nombre del estudiante: ");
      String nombre = scn.next();
      System.out.println("Digite el Id del estudiante: ");
      int id = scn.nextInt();
      System.out.println("Nombre de la universidad del estudiante: ");
      String universidad = scn.next();
      estudiant = new Estudiante(edad, nombre, id, new Universidad(universidad));
      estudiantes.add(estudiant);
    }
  }

  public void mostrar(){
    for (Estudiante e: estudiantes) {
      System.out.println(e.getNombre());
    }
  }
}
