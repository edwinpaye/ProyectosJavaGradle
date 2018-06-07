import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.Color;

public class Imagen extends JFrame{

	JButton boton1,boton2,boton3;
	ImageIcon imagen;

	Imagen() {

		setTitle("Ventana");
		setBounds(300,300,500,500);
		setVisible(true);

		Container contentpane = getContentPane();
		contentpane.setLayout(new GridLayout(2,2));
		// boton1.setRolloverIcon();
		// boton1 = new JButton(new ImageIcon("image1.jpg"));
		// contentpane.add(boton1);
		imagen = new ImageIcon("image1.jpg");
		contentpane.add(imagen.getImage());

		// contentpane.updateUI();

	}

	public static void main(String[] args){
		Imagen image = new Imagen();
	}
}