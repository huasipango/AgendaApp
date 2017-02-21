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
public class Enviomensaje extends javax.swing.JFrame {

 String contacto,mensaje;
    public Enviomensaje() {
        initComponents();
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        setBounds(1,1, 363,654);
        setLocationRelativeTo(null);
        bt_enviar.setOpaque(false);
        bt_enviar.setContentAreaFilled(false);
        bt_volver.setOpaque(false);
        bt_volver.setContentAreaFilled(false);
        bt_submenuverde.setOpaque(false);
        bt_submenuverde.setContentAreaFilled(false);
    }
    public Enviomensaje(String contacto,String mensaje) {
        initComponents();
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        setBounds(1,1, 363,654);
        setLocationRelativeTo(null);
        bt_enviar.setOpaque(false);
        bt_enviar.setContentAreaFilled(false);
        bt_volver.setOpaque(false);
        bt_volver.setContentAreaFilled(false);
        bt_submenuverde.setOpaque(false);
        bt_submenuverde.setContentAreaFilled(false);
        tf_contacto.setText(contacto);
        tp_mensaje.setText(mensaje);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bt_buscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tp_mensaje = new javax.swing.JTextPane();
        tf_contacto = new javax.swing.JTextField();
        bt_volver = new javax.swing.JButton();
        bt_enviar = new javax.swing.JButton();
        bt_submenuverde = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(null);

        bt_buscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/agendaapp/imagenes/bg_buscar - copia.png"))); // NOI18N
        bt_buscar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bt_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_buscarActionPerformed(evt);
            }
        });
        getContentPane().add(bt_buscar);
        bt_buscar.setBounds(260, 120, 70, 70);

        jScrollPane1.setViewportView(tp_mensaje);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(20, 280, 310, 190);

        tf_contacto.setText(".");
        tf_contacto.setBorder(null);
        tf_contacto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_contactoActionPerformed(evt);
            }
        });
        getContentPane().add(tf_contacto);
        tf_contacto.setBounds(20, 120, 240, 80);

        bt_volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_volverActionPerformed(evt);
            }
        });
        getContentPane().add(bt_volver);
        bt_volver.setBounds(0, 0, 60, 50);

        bt_enviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_enviarActionPerformed(evt);
            }
        });
        getContentPane().add(bt_enviar);
        bt_enviar.setBounds(263, 0, 50, 50);

        bt_submenuverde.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_submenuverdeActionPerformed(evt);
            }
        });
        getContentPane().add(bt_submenuverde);
        bt_submenuverde.setBounds(303, 0, 40, 50);

        jLabel2.setFont(new java.awt.Font("Tempus Sans ITC", 3, 18)); // NOI18N
        jLabel2.setText("Destinatario:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(60, 80, 120, 14);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/agendaapp/imagenes/bg_enviomensaje.png"))); // NOI18N
        jLabel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 340, 618);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt_volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_volverActionPerformed
        // TODO add your handling code here:
        Menu menu1 = new Menu();
        setVisible(false);
        menu1.setVisible(true);
    }//GEN-LAST:event_bt_volverActionPerformed

    private void tf_contactoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_contactoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_contactoActionPerformed

    private void bt_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_buscarActionPerformed
        Buscar2 b2=new Buscar2(1,tf_contacto.getText(),tp_mensaje.getText());
        setVisible(false);
        b2.setVisible(true);
        
    }//GEN-LAST:event_bt_buscarActionPerformed

    private void bt_enviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_enviarActionPerformed
if((tf_contacto.getText().isEmpty())||tp_mensaje.getText().isEmpty())
{
        JOptionPane.showMessageDialog(null,"Uno de los campos se encuentra vacio");
}else{
        JOptionPane.showMessageDialog(null,"Mensaje enviado satisfactoriamente");
}
    }//GEN-LAST:event_bt_enviarActionPerformed

    private void bt_submenuverdeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_submenuverdeActionPerformed
        Submenuverde sv=new Submenuverde();
        sv.setVisible(true);
    }//GEN-LAST:event_bt_submenuverdeActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_buscar;
    private javax.swing.JButton bt_enviar;
    private javax.swing.JButton bt_submenuverde;
    private javax.swing.JButton bt_volver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField tf_contacto;
    private javax.swing.JTextPane tp_mensaje;
    // End of variables declaration//GEN-END:variables
}
