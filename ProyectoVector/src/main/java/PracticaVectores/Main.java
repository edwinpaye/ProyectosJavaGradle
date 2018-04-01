package PracticaVectores;

public class Main {

	public static void main(String[] args) {

		AplicacionVectores ap = new AplicacionVectores(new MenuVector(), new Tablero(11, 11));
		ap.iniciar();
	}
}
