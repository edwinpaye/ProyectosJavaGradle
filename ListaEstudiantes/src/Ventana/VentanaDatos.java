package Ventana;

import java.awt.Image;
import java.util.ArrayList;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class VentanaDatos extends javax.swing.JFrame {
    
    private javax.swing.JFrame vAnterior;
    
    public VentanaDatos(ArrayList<Usuario> list, javax.swing.JFrame vAnterior) {
        this.vAnterior = vAnterior;
        initComponents();
        this.setLocationRelativeTo(null);
        ImageIcon imagen = new ImageIcon("src/imagenes/FData.jpg");
        Icon icono = new ImageIcon(imagen.getImage().getScaledInstance(jLabel2.getWidth(), jLabel2.getHeight(), Image.SCALE_DEFAULT));
        jLabel2.setIcon(icono);
        this.repaint();
        printDates(list);
    }
    
    private void printDates(ArrayList<Usuario> list){
        String name ="", lastName="", sueldo="", ocupation="", numReg="";
        for (int i = 0; i < list.size(); i++) {
            name += "<p>"+list.get(i).getName();
            lastName += "<p>"+list.get(i).getLastName();
            numReg += "<p>"+list.get(i).getAge();
            ocupation += "<p>"+list.get(i).getDirection();
            sueldo += "<p>"+list.get(i).getSueldo();
        }
        lblName.setText("<html>Nombre"+name+"<html>");
        lvlLastName.setText("<html>Apellido"+lastName+"<html>");
        lblAge.setText("<html>Cargo"+ocupation+"<html>");
        lblOcupation.setText("<html>Sueldo"+sueldo+"<html>");
        lblNumReg.setText("<html>Num de Reg."+numReg+"<html>");
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        lblNumReg = new javax.swing.JLabel();
        lblOcupation = new javax.swing.JLabel();
        lblAge = new javax.swing.JLabel();
        lvlLastName = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("List of Users");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 30, -1, -1));

        lblNumReg.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblNumReg.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(lblNumReg, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 80, 100, 270));

        lblOcupation.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblOcupation.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(lblOcupation, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 80, 100, 270));

        lblAge.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblAge.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(lblAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 80, 90, 270));

        lvlLastName.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lvlLastName.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(lvlLastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 80, 110, 280));

        lblName.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblName.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(lblName, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 110, 280));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButton1.setText("Exit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 20, -1, -1));

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButton2.setText("Previus");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/FData.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 560, 380));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        vAnterior.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblAge;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblNumReg;
    private javax.swing.JLabel lblOcupation;
    private javax.swing.JLabel lvlLastName;
    // End of variables declaration//GEN-END:variables
}
