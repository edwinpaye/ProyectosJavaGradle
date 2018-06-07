package ProyectoDosUI;

import java.awt.*;
// import java.awt.Image;
// import java.awt.event.KeyEvent;
import java.awt.event.*;

import javax.swing.ImageIcon;

public class ImageA {

  private int dx;
  private int dy;
  private int x;
  private int y;
  private Image imagen ;

  public ImageA(String imag) {
    x = 325;
    y = 225;
    // ImageIcon img = new ImageIcon(this.getClass().getResource(imag));
    imagen = new ImageIcon(this.getClass().getResource(imag))
    .getImage().getScaledInstance(150,90, Image.SCALE_DEFAULT);
  }

  public void mover(){
    x += dx;
    y += dy;
  }

  public int tenerX(){
    return x;
  }

  public int tenerY(){
    return y;
  }

  public Image tenerImagen(){
    return imagen;
  }

  public void keyPressed(KeyEvent e){
    int key = e.getKeyCode();
    if (key == KeyEvent.VK_LEFT) {
      dx = -1;
    }

    if (key == KeyEvent.VK_RIGHT) {
      dx = 1;
    }

    if (key == KeyEvent.VK_UP) {
      dy = -1;
    }

    if (key == KeyEvent.VK_DOWN) {
      dy = 1;
    }
  }

  public void keyReleased(KeyEvent e){
    int key = e.getKeyCode();

    if (key == KeyEvent.VK_LEFT || key == KeyEvent.VK_RIGHT) {
      dx = 0;
    }
/*
    if (key == KeyEvent.VK_RIGHT) {
      dx = 0;
    }

    if (key == KeyEvent.VK_UP) {
      dy = 0;
    }
*/
    if (key == KeyEvent.VK_UP || key == KeyEvent.VK_DOWN) {
      dy = 0;
    }
  }
}
