package Ejemplo1;

// import java.awt.geom.AffineTransform;
import java.awt.*;
import javax.swing.*;
import java.awt.geom.*;
import java.awt.event.*;

// import java.awt.Dimension;
// import java.awt.Graphics;
// import java.awt.Graphics2D;
// import javax.swing.ImageIcon;
// import javax.swing.JComponent;

public class Lienzo extends JComponent {
    
    // private Timer timer;

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(icono.getIconWidth(), icono.getIconHeight());
    }

    private ImageIcon icono;

    public Lienzo(String imag) {
        icono = new ImageIcon(imag);
        // timer = new Timer(15, this);
        // timer.start();
    }
    /**
     * Cuanto queremos que se rote la foto, en radianes.
     */
    private double rotacion = 0.0;
    /**
     * Dibujo de la foto rotandola.
     */
    public void paint(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        // AffineTransform realiza el giro, usando como eje de giro el centro
        // de la foto (width/2, height/2) y el angulo que indica el atributo
        // rotacion.
        AffineTransform tx = AffineTransform.getRotateInstance(rotacion, 
        icono.getIconWidth()/2, icono.getIconHeight()/2);
        // dibujado con la AffineTransform de rotacion
        g2d.drawImage(icono.getImage(), tx, this);
    }

    public double getRotacion() {
        return rotacion;
    }

    public void setRotacion(double rotacion) {
        this.rotacion = rotacion;
    }
}