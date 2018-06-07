package ProyectoDosUI;

import javax.swing.*;
import java.awt.event.*;
import java.awt.Graphics;
import java.awt.*;
import java.awt.geom.*;

public class InsertImageA extends JPanel implements ActionListener{
  private ImageA nave;
  private Timer timer;
  private Plano plano;
  // private ImageB aa;

  public InsertImageA() {
    setBackground(Color.WHITE);
    setFocusable(true);
    addKeyListener(new teclado());

    // aa = new ImageB("nave.png");
    plano = new Plano(500, 700);
    nave = new ImageA("nave.png");
    timer = new Timer(10, this);
    timer.start();
  }

  public void paint(Graphics grafica){
    super.paint(grafica);
    Graphics2D g2 = (Graphics2D)grafica;
    plano.dibujar(g2);

    // AffineTransform tx = AffineTransform.getRotateInstance(0,
    // nave.tenerX()/2, nave.tenerY()/2);
    // g2.drawImage(nave.tenerImagen(), tx, this);

    g2.drawImage(nave.tenerImagen(), nave.tenerX(), nave.tenerY(), null);
    grafica.drawString("Coordenadas de la nave: ("+nave.tenerX()+","+nave.tenerY()+")",50,100);
  }

  public void actionPerformed(ActionEvent e){
    nave.mover();
    repaint();
  }

  private class teclado extends KeyAdapter{
    public void keyReleased(KeyEvent e){
      nave.keyReleased(e);
    }
    public void keyPressed(KeyEvent e){
      nave.keyPressed(e);
    }
  }
  //clase coordenadas.
  // public void paintComponent(Graphics g){
  //   super.paintComponent(g);
  //   Graphics2D g2 = (Graphics2D)g;
  //   //dibuja una linea
  //   // g.drawLine(70,100,300,50);
  //   // g.setFont(new Font("Tempus Sans ITC", 1, 20));
  // }
}
