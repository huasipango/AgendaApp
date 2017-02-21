/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agendaapp;

import java.awt.*;
import javax.swing.JOptionPane;

/**
 *
 * @author rayo
 */
public class Llamada extends javax.swing.JFrame {
String contacto;
Boolean llamadaencurso;
    /**
     * Creates new form Llamada
     */
    public Llamada() {
        initComponents();
         Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        setBounds(1,1, 363,654);
        setLocationRelativeTo(null);
         bt_volver.setOpaque(false);
        bt_volver.setContentAreaFilled(false);
        bt_submenuazul.setOpaque(false);
        bt_submenuazul.setContentAreaFilled(false);
        bt_llamar.setOpaque(false);
        bt_llamar.setContentAreaFilled(false);
        llamadaencurso=false;
    }
public Llamada(String contacto) {
        initComponents();
         Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        setBounds(1,1, 363,654);
        setLocationRelativeTo(null);
         bt_volver.setOpaque(false);
        bt_volver.setContentAreaFilled(false);
        bt_submenuazul.setOpaque(false);
        bt_submenuazul.setContentAreaFilled(false);
        bt_llamar.setOpaque(false);
        bt_llamar.setContentAreaFilled(false);
        this.contacto=contacto;
        tf_contacto.setText(contacto);
        llamadaencurso=false;
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bt_volver = new javax.swing.JButton();
        bt_submenuazul = new javax.swing.JButton();
        bt_llamar = new javax.swing.JButton();
        tf_contacto = new javax.swing.JTextField();
        bt_buscar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(null);

        bt_volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_volverActionPerformed(evt);
            }
        });
        getContentPane().add(bt_volver);
        bt_volver.setBounds(0, 0, 60, 50);

        bt_submenuazul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_submenuazulActionPerformed(evt);
            }
        });
        getContentPane().add(bt_submenuazul);
        bt_submenuazul.setBounds(293, 0, 50, 50);

        bt_llamar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_llamarActionPerformed(evt);
            }
        });
        getContentPane().add(bt_llamar);
        bt_llamar.setBounds(110, 470, 120, 90);

        tf_contacto.setEditable(false);
        tf_contacto.setBorder(null);
        getContentPane().add(tf_contacto);
        tf_contacto.setBounds(10, 70, 230, 40);

        bt_buscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/agendaapp/imagenes/bg_buscar - copia.png"))); // NOI18N
        bt_buscar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bt_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_buscarActionPerformed(evt);
            }
        });
        getContentPane().add(bt_buscar);
        bt_buscar.setBounds(260, 60, 70, 70);

        jLabel2.setMaximumSize(new java.awt.Dimension(32767, 32767));
        jLabel2.setMinimumSize(new java.awt.Dimension(32767, 32767));
        jPanel1.add(jLabel2);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 140, 350, 320);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/agendaapp/imagenes/bg_llamada.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 345, 612);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt_volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_volverActionPerformed
        // TODO add your handling code here:
        Menu menu1 = new Menu();
        setVisible(false);
        menu1.setVisible(true);
    }//GEN-LAST:event_bt_volverActionPerformed

    private void bt_submenuazulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_submenuazulActionPerformed
      Submenuazul sa =new Submenuazul();
      sa.setVisible(true);
    }//GEN-LAST:event_bt_submenuazulActionPerformed

    private void bt_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_buscarActionPerformed
        Buscar2 b2=new Buscar2(2);
        setVisible(false);
        b2.setVisible(true);

    }//GEN-LAST:event_bt_buscarActionPerformed

    private void bt_llamarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_llamarActionPerformed
       if (llamadaencurso==false)
       {
           JOptionPane.showMessageDialog(null, "llamando");
           llamadaencurso=true;
       }else{
           JOptionPane.showMessageDialog(null, "llamada finalizada");
           llamadaencurso=false;
       }
    }//GEN-LAST:event_bt_llamarActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_buscar;
    private javax.swing.JButton bt_llamar;
    private javax.swing.JButton bt_submenuazul;
    private javax.swing.JButton bt_volver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField tf_contacto;
    // End of variables declaration//GEN-END:variables
}
