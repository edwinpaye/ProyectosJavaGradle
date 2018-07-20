package ProyectoDosUI;

import java.awt.*;
import javax.swing.*;

public class ImageB {

    private int dx;
    private int dy;
    private int x;
    private int y;
    private double rotacion = 0.0;
    private Image imagen ;

    public ImageB(String imag) {
        x = 0;
        y = 0;
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

    public void setXY(int a, int b){
      x = a; y = b;
    }

    public int tenerY(){
        return y;
    }

    public Image tenerImagen(){
        return imagen;
    }

    public double getRotacion() {
        return rotacion;
    }

    public void setRotacion(double rotacion) {
        this.rotacion = rotacion;
    }

}
