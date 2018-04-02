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
 		System.out.print("\nDigite la cantidad de vectores que desea calcular: ");
 		return scn.nextInt();
 	}

 	public Vector getCoordenada(int numero) {
 		int x, y;
 		System.out.print("\nVector ("+numero+"), digite el desplazamiento en coordenadas (x,y): "
 			+"\n	X = ");
 		x = scn.nextInt();
 		System.out.print("	Y = ");
 		y = scn.nextInt();
 		return new Vector(0, 0, x, y);
 	}

	private int getRango(int menor, int mayor) {
		int x;
		do{
			System.out.print("\nOpcion: ");
			x = scn.nextInt();
			if (x < menor || x > mayor) {
				System.out.println("\nEl digito "+x+" no esta en el rango, intente denuevo.");
			}
		}while(x<menor || x>mayor);
		return x;
	}

 	public int printMenu() {
 		System.out.print("\nDigite una de las opciones\n"
 			+"\n 1. Ver todos los resultados."
 			+"\n 2. Graficar las posiciones."
 			+"\n 3. Reiniciar los datos.\n");
 		return getRango(1, 3);
 	}

	public int getOpcionSalida() {
		System.out.print("\nDigite una de las opciones\n"
			+"\n 1. Salir del programa."
			+"\n 2. Elegir nueva opcion.\n");
			if (getRango(1, 2) == 2) {
				return 2;
			}
			else {
				System.out.println("\n------------   By psyCODElico.   ------------");
				return 1;
			}
	}

	public int getMando() {
		System.out.print("\nDigite el desplazamiento del objeto - X -\n"
				+"\n 1. Mover la X hacia arriba."
				+"\n 2. Mover la X hacia abajo."
				+"\n 3. Mover la X hacia la derecha."
				+"\n 4. Mover la X hacia la izquierda."
				+"\n 5. Seleccionar el punto inicial."
				+"\n 6. Seleccionar el punto final."
				+"\n 7. Obtener resultados."
				+"\n 8. Salir.\n");
		return getRango(1, 8);
	}
}
