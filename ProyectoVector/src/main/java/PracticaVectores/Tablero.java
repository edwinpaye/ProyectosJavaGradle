package PracticaVectores;

public class Tablero {

	private int filas;
	private int columnas;
	private int[][] matriz;
	private int cont = 0;
	private int x;
	private int y;

	public Tablero(int x, int y) {
		columnas = x;
		filas = y;
	}

	// private int getPosicion(int dato) {
	// 	x = b;
	// 	y = c - 1;
	// 	if (x == 0 || x == y || dato == 3 || dato == 4) {
	// 		x = x;
	// 	}
	// 	if (dato == 1 && x > 0) {
	// 		x--;
	// 	}
	// 	if (dato == 2 && x < y) {
	// 		x++;
	// 	}
	// 	return x;
	// }

	public int[][] iniciarMatriz() {
		this.matriz = new int[filas][columnas];
		cont=0;
		for (int i=0; i<filas; i++) {
			for (int j=0; j<columnas; j++) {
				if (i == 0) {
				matriz[i][j] = cont;
				cont++;
				}
				if (i > 0 && j == 0) {
				matriz[i][j] = i;
				}
			}
		}
		return matriz;
	}

	public void printMatriz(int a, int b) {
		System.out.println("\nLa posicion de X en coordenadas ("+x+","+y+") es:\n");
		for (int i=0; i<filas; i++) {
			for (int j=0; j<columnas; j++) {
				if (i == a && j == b) {
					System.out.print("X" + " ");
				}
				else {
					System.out.print(matriz[i][j] + " ");
				}
			}
			System.out.println(" ");
		}
	}
}
