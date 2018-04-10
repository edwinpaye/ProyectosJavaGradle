package Est;

  public class Main {
    public static void main(String[] args){

    BaseDatosEstudiante bde = new BaseDatosEstudiante(3);

    bde.llenar();
    bde.setArrayEst();
    bde.mostrar();
    bde.OrdEdadAcen();
    bde.OrdEdadDecen();
  }
}
