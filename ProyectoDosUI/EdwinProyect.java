package ProyectoDosUI;

public class EdwinProyect {

	public static void main(String[] args) {

		AplicacionTransformacion app = new AplicacionTransformacion(new Menu(), new Tablero(11, 11));
		app.iniciar();

    Animacion animacion = new Animacion();
    animacion.start();
	}
}
