package ProyectoDos;

public class Main {

	public static void main(String[] args) {

		AplicacionTransformacion app = new AplicacionTransformacion(new Menu(), new Tablero(11, 11));
		app.iniciar();
	}
}
