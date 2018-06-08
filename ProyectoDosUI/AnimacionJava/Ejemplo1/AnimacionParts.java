import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;
import java.awt.event.*;

public class AnimacionParts extends JPanel {

	GeneralPath palaMolino = new GeneralPath();

	int numero;
	float tamanio;
	double[] limites = new double[] {0, 7, 4, -1};

	AnimacionParts() {
		setPreferredSize(new Dimension(720, 500));

		palaMolino.moveTo(0, 0);
		palaMolino.lineTo(0.5, 0.1);
		palaMolino.lineTo(1.5, 0);
		palaMolino.lineTo(0.5, -0.1);
		palaMolino.closePath();

		new Timer(30, new ActionListener()
		{
			public void actionPerformed(ActionEvent evt)
			{
				numero++;
				repaint();
			}
		}).start();
	}

	protected void paintComponent(Graphics g) {
		Graphics2D g2D = (Graphics2D)g;

		g2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		controlar_limites(g2D, getWidth(), getHeight(), limites);
		g2D.setColor(new Color(154, 243, 252));
		g2D.fillRect(0, 0, 7, 4);
		AffineTransform transformacion = g2D.getTransform();
		g2D.setTransform(transformacion);
		g2D.translate(2.3, 0.0);
		g2D.scale(0.8, 0.8);
		dibujar_molino(g2D);
	}

	void controlar_limites(Graphics2D g2D, int anchura, int altura, double[] limites) {

		double ancho = Math.abs((limites[1]-limites[0])/anchura);
		double alto = Math.abs((limites[3]-limites[2])/altura);
		tamanio = (float) Math.min(ancho, alto);
		g2D.scale(anchura/(limites[1]-limites[0]), altura/(limites[3]-limites[2]));
		g2D.translate(-limites[0], -limites[2]);
	}

	void dibujar_molino(Graphics2D g2D) {

		g2D.setColor(Color.BLACK);
		g2D.fill(new Rectangle2D.Double(-0.05,0,0.1,3));
		g2D.translate(0,3);
		g2D.rotate(numero/23.0);
		g2D.setColor(new Color(138, 43, 226));
		for (int i=0; i<6; i++) {
			g2D.rotate(Math.PI/3);
			g2D.fill(palaMolino);
		}
	}

	public static void main(String[] args) {
		JFrame ventana = new JFrame();
		ventana.setContentPane(new AnimacionParts());
		ventana.pack();
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventana.setLocationRelativeTo(null);
		ventana.setVisible(true);
	}	
}