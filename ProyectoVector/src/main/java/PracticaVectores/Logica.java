package PracticaVectores;

public class Logica {

	private int dato;
	private int x;
	private int y;

	public Logica() {}

	public void setDato(int dato) {
		this.dato = dato;
	}

	public int movX(int b, int c) {
		x = b;
		y = c - 1;
		if (x == 0 || x == y || dato == 3 || dato == 4) {
			x = x;
		}
		if (dato == 1 && x > 0) {
			x--;
		}
		if (dato == 2 && x < y) {
			x++;
		}
		return x;
	}
	public int movY(int b, int c) {
		x = b;
		y = c -1;
		if (x == 0 || x == y || dato == 1 || dato == 2) {
			x = x;
		}
		if (dato == 3 && x < y) {
			x++;
		}
		if (dato == 4 && x > 0) {
			x--;
		}
		return x;
	}
}