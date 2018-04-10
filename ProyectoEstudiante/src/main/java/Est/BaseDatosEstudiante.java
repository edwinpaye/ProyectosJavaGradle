package Est;
import java.util.*;
public class BaseDatosEstudiante{

  ArrayList<Estudiante> estudiantes;
  int size;
  Estudiante[] estudi;

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

  public void setArrayEst(){
    estudi = estudiantes.toArray(new Estudiante[estudiantes.size()]);
  }

  public void mostrar(){
    System.out.println("Orden Acendente");
    for (Estudiante e: estudi) {
      System.out.println("\nNombre: "+e.getNombre()+" Edad: "+e.getEdad()+" Id: "+e.getId());
    }
  }

  public void OrdEdadDecen() {
    Arrays.sort(estudi);
    System.out.println("Orden Decendente");
    for (int i=0; i<estudi.length; i++) {
      System.out.println("\nNombre: "+estudi[estudi.length-i-1].getNombre()+" Edad: "+estudi[estudi.length-i-1].getEdad()+" Id: "+estudi[estudi.length-i-1].getId());
    }
  }

  public void OrdEdadAcen() {
    Arrays.sort(estudi);
    mostrar();
  }
}
