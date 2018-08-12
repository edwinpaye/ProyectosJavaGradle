package ProyectoDosUI;

import javax.swing.JFrame;
// import javax.swing.JPanel;
// import javax.swing.JButton;
// import javax.swing.JTextField;
// import javax.swing.JLabel;
// import javax.swing.ImageIcon;

// import java.awt.Color;
// import java.awt.Image;
// import java.awt.Container;

public class Ventana extends JFrame{

	public Ventana(int ancho, int alto){
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		add(new InsertImageA());
		setTitle("Proyecto Dos UI");
		setSize(alto, ancho);
		setVisible(true);
		setLocationRelativeTo(null);
		setResizable(false);
	}

	public static void main(String[] args){
		new Ventana(500, 700);
	}
}
