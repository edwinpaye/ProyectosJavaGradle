import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Container;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.Icon;


public class VentanaDos extends JFrame{

	JPanel contentpane;
	JButton boton;
	ImageIcon imagen;
	Icon icono;
	public VentanaDos(){

		this.setTitle("Ventana");
		this.setBounds(0,0,400,400);
		this.setVisible(true);
		// Container contentpane = getContentPane();
		contentpane = new JPanel();
		setContentPane(contentpane);
		contentpane.setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		boton = new JButton();
		boton.setBounds(0,0,80,80);

		imagen = new ImageIcon("images/imagen1.jpg");
		icono = new Icon(imagen.getImage());
		boton.setIcon(icono);
		contentpane.add(boton);

		contentpane.updateUI();
	}

	public static void main(String[] args) {
		VentanaDos a = new VentanaDos();
	}
}
