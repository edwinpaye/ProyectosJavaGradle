import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Ventana extends JFrame {

	JPanel contentpane;
	JTextField texto1,texto2,texto3;
	JButton boton1,boton2,boton3,boton4;

	public Ventana() {

		setBounds(300,300,400,300);
		setVisible(true);
		contentpane = new JPanel();
		contentpane.setBackground(Color.RED);
		setContentPane(contentpane);
		contentpane.setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		texto1 = new JTextField();
		texto2 = new JTextField();
		texto3 = new JTextField();

		boton1 = new JButton();
		boton2 = new JButton();
		boton3 = new JButton();
		boton4 = new JButton();

		texto1.setBounds(25, 45, 130, 25);
		contentpane.add(texto1);

		texto2.setBounds(25, 85, 130, 25);
		contentpane.add(texto2);

		texto3.setBounds(175, 45, 200, 60);
		contentpane.add(texto3);

		boton1.setBounds(25, 130, 130, 80);
		boton1.setForeground(Color.white);
		boton1.setBackground(Color.BLUE);
		contentpane.add(boton1);

		boton2.setBounds(175, 130, 88, 25);
		boton2.setForeground(Color.white);
		boton2.setBackground(Color.BLUE);
		contentpane.add(boton2);

		boton3.setBounds(175, 175, 88, 35);
		boton3.setForeground(Color.white);
		boton3.setBackground(Color.BLUE);
		contentpane.add(boton3);

		boton4.setBounds(270, 130, 108, 80);
		boton4.setForeground(Color.white);
		boton4.setBackground(Color.BLUE);
		contentpane.add(boton4);

		contentpane.updateUI();
	}

	public static void main(String[] args){
		Ventana v = new Ventana();
	}
}