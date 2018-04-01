package PracticaVectores;

public class AplicacionVectores {

	private MenuVector menu;
	private Tablero tablero;
	private Vector vectores[];

	public AplicacionVectores(MenuVector menu, Tablero tablero) {
		this.menu = menu;
		this.tablero = tablero;
	}

	private void setDatos() {
		vectores = new Vector[menu.getVectores()];
		for (int i=0; i<vectores.length; i++) {
			vectores[i] = menu.getCoordenada();
		}
	}

	private void resultados() {
		int x = 0;
		int y = 0;
		for (int i=0; i<vectores.length; i++) {
			x += vectores[i].x1;
			y += vectores[i].y1;
			System.out.println("\nLos resultados del vector "+(i+1)+" son:\n"
				+"\nLa distancia rrecorrida (Modulo) = "+vectores[i].getModuloV()
				+"\nEl angulo de direccion = "+vectores[i].getAnguloDirec()
				+"\nEl vector posicion del punto final = ("+x+"i, "+y+"j)");
		}
	}

	private void ficha() {
		Logica b = new Logica();
		tablero.iniciarMatriz();
		int x = 0, y = 0, dato = 0;
		do{
			tablero.printMatriz(x, y);
			dato = menu.getMando();
			b.setDato(dato);
			x = b.movX(x, 11);
			y = b.movY(y, 11);
		}while(dato != 5);
	}

	public void iniciar() {

		menu.titulo();
		do{
			if (vectores == null) {
				setDatos();
				opciones();
			}else {
				opciones();
			}
		}while (menu.getOpcionSalida() == 2);
	}

	private void opciones() {

		switch (menu.printMenu()) {
			case 1:	resultados();
					break;
			case 2:	ficha();
					break;
			case 3:	setDatos();
					opciones();
					break;
		}
	}
}
