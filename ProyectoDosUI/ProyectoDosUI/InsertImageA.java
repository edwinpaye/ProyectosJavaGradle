package ProyectoDosUI;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;
import java.awt.event.*;
import java.awt.Graphics;

public class InsertImageA extends JPanel implements ActionListener{
  private ImageA objetivo;
  private ImageB nave;
  private Plano plano;

  public InsertImageA() {
    setBackground(Color.WHITE);
    setFocusable(true);
    addKeyListener(new teclado());

    plano = new Plano(500, 700);
    nave = new ImageB("nave.png");
    objetivo = new ImageA("rotatorio.gif");
    new Timer(10, this).start();
  }

  public void paint(Graphics grafica){
    super.paint(grafica);
    Graphics2D g2 = (Graphics2D)grafica;
    plano.dibujar(g2);

    AffineTransform transformacion = g2.getTransform();
    g2.translate(350 + nave.tenerX(), 250 + nave.tenerY());
    g2.rotate(Math.toRadians(-1*(nave.getRotacion()-90)));
    g2.drawImage(nave.tenerImagen(), -75,-45, null);

    g2.setTransform(transformacion);
    g2.drawImage(objetivo.tenerImagen(), 325 + objetivo.tenerX(), 225 + objetivo.tenerY(), null);
    g2.setFont(new Font("Tempus Sans ITC", 1, 20));
    g2.drawString("Coordenadas del objetivo: ("+(double)objetivo.tenerX()/10+","+(double)(-1*objetivo.tenerY())/10+")",50,100);
    g2.drawString("Coordenadas de la nave: ("+(double)nave.tenerX()/10+","+(double)(-1*nave.tenerY())/10+")",50,80);
    g2.drawString("Grados desde el eje X: "+nave.getRotacion(), 50, 60);
    g2.drawString("Distancia entre la nave y el objetivo: "+getModuloV(), 50, 40);
  }

  public void actionPerformed(ActionEvent e){
    objetivo.mover();
    repaint();
  }

  private class teclado extends KeyAdapter{
    public void keyReleased(KeyEvent e){
      objetivo.keyReleased(e);
      if (e.getKeyCode() == KeyEvent.VK_ENTER) {
          nave.setRotacion(getAnguloDirec());
          nave.setXY(objetivo.tenerX(),objetivo.tenerY());
      }
    }
    public void keyPressed(KeyEvent e){
      objetivo.keyPressed(e);
    }

  }

    public double getModuloV() {
  		return Math.sqrt(((objetivo.tenerX()-nave.tenerX())*(objetivo.tenerX()-nave.tenerX()))+((objetivo.tenerY()-nave.tenerY())*(objetivo.tenerY()-nave.tenerY())));
  	}

  	private double getAngulo() {
  		return (180*Math.acos((objetivo.tenerX()-nave.tenerX())/(getModuloV())))/Math.PI;
  	}

  	public double getAnguloDirec() {
  		double resp = 0;
  		if ((-1*(objetivo.tenerY()-nave.tenerY()))>=0) {
  			resp = getAngulo();
  		}else {
  			resp = 360 - getAngulo();
  		}
  		return resp-getAngulo()%0.0000001;
  	}
}
