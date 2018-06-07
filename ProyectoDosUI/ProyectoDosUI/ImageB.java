package ProyectoDosUI;

import java.awt.geom.AffineTransform;
// import java.awt.event.KeyEvent;
import java.awt.event.*;
import java.awt.*;

import javax.swing.*;

public class ImageB extends JComponent {

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(icono.getIconWidth(), icono.getIconHeight());
    }

    private ImageIcon icono;

    public ImageB(String imag) {
        icono = new ImageIcon(imag);
    }

    private double rotacion = 0.0;

    public void paint(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        AffineTransform tx = AffineTransform.getRotateInstance(rotacion,
                icono.getIconWidth()/2, icono.getIconHeight()/2);
        g2d.drawImage(icono.getImage(), tx, this);
    }

    public double getRotacion() {
        return rotacion;
    }

    public void setRotacion(double rotacion) {
        this.rotacion = rotacion;
    }

    public void keyPressed(KeyEvent e){
      int key = e.getKeyCode();
      if (key == KeyEvent.VK_ENTER) {
        new Timer(40, new ActionListener()
        {
          public void actionPerformed(ActionEvent evt)
          {
            setRotacion(getRotacion() - 0.005);
            repaint();
          }
        }).start();
      }
    }
}
