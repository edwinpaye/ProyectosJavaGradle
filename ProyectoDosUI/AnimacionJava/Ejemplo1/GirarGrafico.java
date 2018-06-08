package Ejemplo1;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;
import java.awt.event.*;

// import java.awt.BorderLayout;
// import java.awt.FlowLayout;
// import java.awt.event.ActionEvent;
// import java.awt.event.ActionListener;

// import javax.swing.JButton;
// import javax.swing.JFrame;
// import javax.swing.JPanel;
// import javax.swing.WindowConstants;

public class GirarGrafico extends JFrame{

    private Lienzo l;

    public static void main(String[] args) {
        new GirarGrafico();
    }

    public GirarGrafico() {
        
        l = new Lienzo("image1.png");
        setTitle("Prueba");
        getContentPane().add(l);
        
        JPanel botonesRotacion = new JPanel(new FlowLayout());
        JButton botonSentidoHorario = new JButton("+0.1");
        JButton botonSentidoAntiHorario = new JButton("-0.1");
        botonesRotacion.add(botonSentidoAntiHorario);
        botonesRotacion.add(botonSentidoHorario);
        getContentPane().add(botonesRotacion, BorderLayout.NORTH);

        botonSentidoAntiHorario.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
    
                l.setRotacion(0);
                new Timer(40, new ActionListener()
                {
                    public void actionPerformed(ActionEvent evt)
                    {
                        l.setRotacion(l.getRotacion() - 0.005);
                        l.repaint();
                    }
                }).start();
            }
        });
        botonSentidoHorario.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
    
                l.setRotacion(0);
                new Timer(40, new ActionListener()
                {
                    public void actionPerformed(ActionEvent evt)
                    {
                        l.setRotacion(l.getRotacion() + 0.005);
                        l.repaint();
                    }
                }).start();
            }
        });

        pack();
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);        
    }
}