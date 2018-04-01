package PracticaVectores;
import java.util.Scanner;

public class MenuVector {

	Scanner scn = new Scanner(System.in);

 	public MenuVector() {}

	public void titulo() {

		System.out.println("--------------------------------------------------------"
			+"\n                      BIENVENIDO                        "
			+"\n--------------------------------------------------------"
			+"\n          (El programa vector esta en ejecucion)        ");
	}

 	public int getVectores() {

 		System.out.print("\nDigite la cantidad de vectores a calcular: ");
 		return scn.nextInt();
 	}

 	public Vector getCoordenada(int numero) {

 		int x;
 		int y;
 		System.out.print("\nDigite el desplazamiento del vector ("+numero+"): "
 			+"\n	X = ");
 		x = scn.nextInt();
 		System.out.print("	Y = ");
 		y = scn.nextInt();
 		return new Vector(0, 0, x, y);
 	}

	private int getRango(int menor, int mayor) {

		int x;
		do{
			x = scn.nextInt();
			if (x < menor || x > mayor) {
				System.out.println("El digito "+x+" no esta en el rango, intente denuevo.");
			}
		}while(x<menor || x>mayor);
		return x;
	}

 	public int printMenu() {

 		System.out.println("\nDigite una de las siguientes opciones: "
 			+"\n1. Ver todos los resultados."
 			+"\n2. Graficar las posiciones."
 			+"\n3. Reiniciar.");
 		return getRango(1, 3);
 	}

	public int getOpcionSalida() {

		System.out.println("\n1. Salir del programa."
			+"\n2. Elegir nueva opcion.");

		return getRango(1, 2);
	}

	public int getMando() {
		System.out.println("\nDigite una de las siguientes opciones:"
				+"\n1. Mover la X hacia arriba."
				+"\n2. Mover la X hacia abajo."
				+"\n3. Mover la X hacia la derecha."
				+"\n4. Mover la X hacia la izquierda."
				+"\n5. Salir.\n");
		return getRango(1, 5);
	}
}
