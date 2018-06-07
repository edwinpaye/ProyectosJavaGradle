package ProyectoDosUI;

public class Datos() {

  private int[] coordenadas;
  private double modulo;
  private double anguloX;
  private double angulo;

  Datos(int[] a, double b, double c, double d){
    coordenadas = a;
    modulo = b;
    anguloX = c;
    angulo = d;
  }

  public int[] getCoordenadas(){
    return coordenadas;
  }

  public double getModulo(){
    return modulo;
  }

  public double getAnguloX(){
    return anguloX;
  }

  public double getAngulo(){
    return angulo;
  }
}
