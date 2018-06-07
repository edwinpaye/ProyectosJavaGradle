package ProyectoDosUI;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.ImageIcon;

public class PanelControl extends JPanel {

	private int ancho;
	private int alto;

	public PanelControl(int ancho, int alto){
		this.ancho = ancho;
		this.alto = alto;
	}

	public void paintComponent(Graphics g){
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D)g;

		Plano plano = new Plano(ancho,alto);
		plano.dibujar(g2);
		updateUI();
	}

	public static void main(String[] args){
		JFrame ventana = new JFrame();
		ventana.setTitle("Grafica de ejemplo");
		ventana.setContentPane(new PanelControl(700, 500));
		ventana.pack();
		ventana.setBounds(300, 100, 700, 500);
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventana.setLocationRelativeTo(null);
		ventana.setVisible(true);
	}
}
