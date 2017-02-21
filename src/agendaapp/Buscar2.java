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
public class Buscar2 extends javax.swing.JFrame {
int tipo;
String contacto,mensaje;
    public Buscar2(int tipo,String contacto,String mensaje) {
        initComponents();
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        setBounds(1,1, 363,654);
        setLocationRelativeTo(null);
        bt_buscar.setOpaque(false);
        bt_buscar.setContentAreaFilled(false);
         bt_enviar.setOpaque(false);
        bt_enviar.setContentAreaFilled(false);
        bt_volver.setOpaque(false);
        bt_volver.setContentAreaFilled(false);
        this.tipo=tipo;
        this.mensaje=mensaje;
        this.contacto=contacto;
    }

    public Buscar2(int tipo) {
        initComponents();
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        setBounds(1,1, 363,654);
        setLocationRelativeTo(null);
        bt_buscar.setOpaque(false);
        bt_buscar.setContentAreaFilled(false);
         bt_enviar.setOpaque(false);
        bt_enviar.setContentAreaFilled(false);
        bt_volver.setOpaque(false);
        bt_volver.setContentAreaFilled(false);
        this.tipo=tipo;
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bt_buscar = new javax.swing.JButton();
        tf_busqueda = new javax.swing.JTextField();
        lb_foto = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_contactos = new javax.swing.JTable();
        bt_agregar = new javax.swing.JButton();
        bt_volver = new javax.swing.JButton();
        bt_enviar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        bt_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_buscarActionPerformed(evt);
            }
        });
        getContentPane().add(bt_buscar);
        bt_buscar.setBounds(10, 70, 50, 40);

        tf_busqueda.setEditable(false);
        tf_busqueda.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        getContentPane().add(tf_busqueda);
        tf_busqueda.setBounds(70, 70, 240, 30);

        lb_foto.setText(".");
        getContentPane().add(lb_foto);
        lb_foto.setBounds(270, 130, 60, 80);

        tb_contactos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tb_contactos);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(30, 220, 300, 270);

        bt_agregar.setBackground(new java.awt.Color(51, 255, 102));
        bt_agregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/agendaapp/imagenes/bg_menu - copia.png"))); // NOI18N
        bt_agregar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bt_agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_agregarActionPerformed(evt);
            }
        });
        getContentPane().add(bt_agregar);
        bt_agregar.setBounds(140, 500, 90, 80);

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
        bt_enviar.setBounds(290, 0, 50, 50);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/agendaapp/imagenes/bg_buscar - copia (2).png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 346, 620);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_buscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bt_buscarActionPerformed

    private void bt_agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_agregarActionPerformed
        if(tf_busqueda.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Es necesario seleccionar un contacto");
        }else{
            if(this.tipo==1){
                    if (contacto.isEmpty()){
                        contacto=tf_busqueda.getText();
                    }else{
                        contacto=contacto+" ; "+tf_busqueda.getText();
                    }
                    Enviomensaje em=new Enviomensaje(contacto,mensaje);
                    setVisible(false);
                    em.setVisible(true);
            }else{
                contacto=tf_busqueda.getText();
                Llamada ll = new Llamada(contacto);
                setVisible(false);
                ll.setVisible(true);
            }
            
        }
        
        
    }//GEN-LAST:event_bt_agregarActionPerformed

    private void bt_volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_volverActionPerformed
        // TODO add your handling code here:
        
        if (this.tipo==1){
            Enviomensaje em=new Enviomensaje(contacto,mensaje);
            setVisible(false);
            em.setVisible(true);
        }else{
                Llamada ll = new Llamada();
                setVisible(false);
                ll.setVisible(true);
            }
        
    }//GEN-LAST:event_bt_volverActionPerformed

    private void bt_enviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_enviarActionPerformed
        bt_agregarActionPerformed(evt);
    }//GEN-LAST:event_bt_enviarActionPerformed

  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_agregar;
    private javax.swing.JButton bt_buscar;
    private javax.swing.JButton bt_enviar;
    private javax.swing.JButton bt_volver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lb_foto;
    private javax.swing.JTable tb_contactos;
    private javax.swing.JTextField tf_busqueda;
    // End of variables declaration//GEN-END:variables
}
