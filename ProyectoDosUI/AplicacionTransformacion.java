package ProyectoDosUI;

public class AplicacionTransformacion {

	private Menu menu;
	private Tablero tablero;
	private Vector vectores[];

	public AplicacionTransformacion(Menu menu, Tablero tablero) {
		this.menu = menu;
		this.tablero = tablero;
	}

	private void setDatos() {
		vectores = new Vector[menu.getVectores()];
		for (int i=0; i<vectores.length; i++) {
			vectores[i] = menu.getCoordenada(i+1);
		}
	}

	private void resultados() {
		int x = 0;
		int y = 0;
		for (int i=0; i<vectores.length; i++) {
			x += vectores[i].x1;
			y += vectores[i].y1;
			System.out.println("\nResultados del vector "+(i+1)+".\n"
				+"\n	-Traslacion = "+vectores[i].getModuloV()
				+"\n	-Rotacion = "+vectores[i].getAnguloDirec()
				+"\n	-Vector posicion (punto final) = ("+x+"i, "+y+"j)");
		}
	}

	private void grafica() {
		int dato = 0;
		Vector vX;
		do{
			tablero.printMatriz(dato);
			dato = menu.getMando();
			if (dato == 5) {
				tablero.setInicial();
			}
			if (dato == 6) {
				tablero.setFinal();
			}
			if (dato == 7) {
				vX = tablero.getVector();
				printVecGrafic(vX);
				dato = 8;
			}
		}while(dato != 8);
	}

	private void printVecGrafic(Vector v) {
		System.out.println("\nResultados de la transformacion.\n"
			+"\n	-Modulo = "+v.getModuloV()
			+"\n	-Angulo de direccion = "+v.getAnguloDirec()
			+"\n	-Puto actual = ("+v.x1+"i, "+v.y1+"j)");
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
			case 2:	grafica();
							break;
			case 3:	setDatos();
							opciones();
							break;
		}
	}
}
