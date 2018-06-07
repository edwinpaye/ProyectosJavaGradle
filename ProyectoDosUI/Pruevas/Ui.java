import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.ImageIcon;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;

public class Ui extends JFrame{

	JButton boton1,boton2,boton3;
	// JPanel contentpane;
	Ui() {
		setTitle("Ventana Ui");
		setBounds(300,300,500,500);
		setVisible(true);
		Container contentpane = getContentPane();
		boton1 = new JButton(new ImageIcon("imagen1.jpg"));
		boton1.setRolloverIcon(new ImageIcon("imagen2.jpg"));
		contentpane.setLayout(new GridLayout(2,2));
		contentpane.add(boton1);

		JPanel temp = this.getContentPane();
		SwingUtilities.updateTreeUI(temp);
		temp.validateTree();
	}

	public static void main(String[] args){
		Ui u = new Ui();
	}
}