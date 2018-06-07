package ProyectoDosUI;

public class Tablero {

	private int filas;
	private int columnas;
	private int x = 0;
	private int y;
	private int vector[] = new int[4];

	public Tablero(int x, int y) {
		columnas = x;
		filas = y;
		this.y = y -1;
	}

	public Vector getVector() {
		return new Vector(vector[0], vector[1], vector[2], vector[3]);
	}

	public void setInicial() {
		vector[0] = x;
		vector[1] = filas-y-1;
	}

	public void setFinal() {
		vector[2] = x;
		vector[3] = filas-y-1;
	}

	private void setPosicion(int dato) {
		if (dato == 1 && y > 0) {
			y--;
		}
		if (dato == 2 && y < filas-1) {
			y++;
		}
		if (dato == 3 && x < columnas-1) {
			x++;
		}
		if (dato == 4 && x > 0) {
			x--;
		}
	}

	public void printMatriz(int dato) {
		setPosicion(dato);
		System.out.println("\nLa posicion de X en coordenadas ("+x+","+(filas-y-1)+") es:\n");
		for (int i=0; i<filas; i++) {
			for (int j=0; j<columnas; j++) {
				if (i == y && j == x) {
					System.out.print("X" + " ");
				}
				else {
					if (i == filas-1) {
						System.out.print(j + " ");
					}
					else {
						if(j == 0) {
							System.out.print((filas-i-1) + " ");
						}
						else {
							System.out.print(0 + " ");
						}
					}
				}
			}
			System.out.println(" ");
		}
	}
}
