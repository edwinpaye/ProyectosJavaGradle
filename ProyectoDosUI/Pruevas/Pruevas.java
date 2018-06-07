public class Pruevas {

  Pruevas(int[] arreglo){
    getArreglo(arreglo);
  }

  private void getArreglo(int[] dato){
    System.out.println(dato[0]+dato[1]+dato[2]+dato[3]);
  }

  public static void main(String[] args){
    int[] a = {4,3,2,1};
    new Pruevas(a);
  }
}
