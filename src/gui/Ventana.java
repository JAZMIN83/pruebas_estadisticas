/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import generadores.MetodoInicial;
import java.util.logging.Level;
import java.util.logging.Logger;
import menu.Menu_Generadores;

/**
 *
 * @author Verónica Cortes / Jazmin Patiño
 */
public class Ventana extends javax.swing.JFrame {

    private MetodoInicial p = new MetodoInicial();
    /**
     * Creates new form Ventana
     */
    public Ventana() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel9 = new javax.swing.JLabel();
        jTextFieldIteraciones1 = new javax.swing.JTextField();
        jLabelResultado1 = new javax.swing.JLabel();
        jScrollBar2 = new javax.swing.JScrollBar();
        jPanelGeneradorBasico = new javax.swing.JPanel();
        jLabelSemilla = new javax.swing.JLabel();
        jTextFieldSemilla = new javax.swing.JTextField();
        jLabelFuncionTransicion = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaFuncionTransicion = new javax.swing.JTextArea();
        jLabelFuncionSalida = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextAreaFuncionSalida = new javax.swing.JTextArea();
        jLabelIteraciones = new javax.swing.JLabel();
        jTextFieldIteraciones = new javax.swing.JTextField();
        jButtonGenerar = new javax.swing.JButton();
        jLabelResultado = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextAreaResultado = new javax.swing.JTextArea();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jTextFieldIteraciones2 = new javax.swing.JTextField();
        jLabelResultado2 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTextAreaResultado1 = new javax.swing.JTextArea();
        jButton14 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuArchivo = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        jLabel9.setText("Tolerancia");

        jLabelResultado1.setText("Resultado");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabelSemilla.setText("Valor semilla:");

        jLabelFuncionTransicion.setText("Función de transición:");

        jTextAreaFuncionTransicion.setColumns(20);
        jTextAreaFuncionTransicion.setRows(5);
        jScrollPane1.setViewportView(jTextAreaFuncionTransicion);

        jLabelFuncionSalida.setText("Función de salida:");

        jTextAreaFuncionSalida.setColumns(20);
        jTextAreaFuncionSalida.setRows(5);
        jScrollPane2.setViewportView(jTextAreaFuncionSalida);

        jLabelIteraciones.setText("Número de iteraciones:");

        jButtonGenerar.setText("Generar");
        jButtonGenerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGenerarActionPerformed(evt);
            }
        });

        jLabelResultado.setText("Resultado");

        jTextAreaResultado.setColumns(20);
        jTextAreaResultado.setRows(5);
        jScrollPane4.setViewportView(jTextAreaResultado);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("GENERADOR BASIC0");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setText("PRUEBAS ESTADISTICAS");

        jButton10.setText("Promedio");
        jButton10.setActionCommand("jButton2 ");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jButton11.setText("CHI Cuadrado");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jButton12.setText("Varianza");

        jButton13.setText("Kolmogorov-Smirnov");

        jLabel10.setText("Tolerancia");

        jLabelResultado2.setText("Resultado");

        jTextAreaResultado1.setColumns(20);
        jTextAreaResultado1.setRows(5);
        jScrollPane5.setViewportView(jTextAreaResultado1);

        jButton14.setText("Volver");
        jButton14.setName("volver"); // NOI18N
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelGeneradorBasicoLayout = new javax.swing.GroupLayout(jPanelGeneradorBasico);
        jPanelGeneradorBasico.setLayout(jPanelGeneradorBasicoLayout);
        jPanelGeneradorBasicoLayout.setHorizontalGroup(
            jPanelGeneradorBasicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelGeneradorBasicoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelGeneradorBasicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelGeneradorBasicoLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(225, 225, 225))
                    .addGroup(jPanelGeneradorBasicoLayout.createSequentialGroup()
                        .addComponent(jLabelResultado)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonGenerar, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(128, 128, 128))
                    .addGroup(jPanelGeneradorBasicoLayout.createSequentialGroup()
                        .addGroup(jPanelGeneradorBasicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelResultado2)
                            .addGroup(jPanelGeneradorBasicoLayout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldIteraciones2, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelGeneradorBasicoLayout.createSequentialGroup()
                                .addGap(189, 189, 189)
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelGeneradorBasicoLayout.createSequentialGroup()
                                .addComponent(jLabelSemilla, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(jTextFieldSemilla, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelGeneradorBasicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jButton14)
                                .addGroup(jPanelGeneradorBasicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jScrollPane5, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelGeneradorBasicoLayout.createSequentialGroup()
                                        .addComponent(jLabelIteraciones)
                                        .addGap(18, 18, 18)
                                        .addComponent(jTextFieldIteraciones, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanelGeneradorBasicoLayout.createSequentialGroup()
                                        .addGroup(jPanelGeneradorBasicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabelFuncionTransicion)
                                            .addComponent(jLabelFuncionSalida))
                                        .addGap(33, 33, 33)
                                        .addGroup(jPanelGeneradorBasicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 377, Short.MAX_VALUE)
                                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)))))
                            .addGroup(jPanelGeneradorBasicoLayout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(jButton10)
                                .addGap(2, 2, 2)
                                .addComponent(jButton11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton13)))
                        .addContainerGap(112, Short.MAX_VALUE))))
        );
        jPanelGeneradorBasicoLayout.setVerticalGroup(
            jPanelGeneradorBasicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelGeneradorBasicoLayout.createSequentialGroup()
                .addComponent(jLabel11)
                .addGap(8, 8, 8)
                .addGroup(jPanelGeneradorBasicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelGeneradorBasicoLayout.createSequentialGroup()
                        .addGroup(jPanelGeneradorBasicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelSemilla)
                            .addComponent(jTextFieldSemilla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelGeneradorBasicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelFuncionTransicion)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanelGeneradorBasicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelGeneradorBasicoLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabelFuncionSalida))
                            .addGroup(jPanelGeneradorBasicoLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(22, 22, 22)
                        .addGroup(jPanelGeneradorBasicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelIteraciones)
                            .addComponent(jTextFieldIteraciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jButtonGenerar))
                    .addComponent(jLabelResultado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel12)
                .addGap(18, 18, 18)
                .addGroup(jPanelGeneradorBasicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton10)
                    .addComponent(jButton11)
                    .addComponent(jButton12)
                    .addComponent(jButton13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelGeneradorBasicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jTextFieldIteraciones2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelResultado2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jButton14)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        jLabelFuncionTransicion.getAccessibleContext().setAccessibleName("Función de transición");

        jMenuArchivo.setText("Archivo");

        jMenuItem1.setLabel("Generador Básico");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenuArchivo.add(jMenuItem1);

        jMenuBar1.add(jMenuArchivo);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelGeneradorBasico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelGeneradorBasico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonGenerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGenerarActionPerformed
         
        try {
            Double semilla = new Double(jTextFieldSemilla.getText());
            Integer iteraciones = new Integer(jTextFieldIteraciones.getText());                       
            p.iniciar(semilla, jTextAreaFuncionTransicion.getText(), jTextAreaFuncionSalida.getText(), iteraciones);
            p.procesar();
            jTextAreaResultado.setText(p.imprimirResultados());
        } catch (Exception ex) {
            jTextAreaResultado.setText(ex.getMessage());
        }
    }//GEN-LAST:event_jButtonGenerarActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        this.jPanelGeneradorBasico.setVisible(!this.jPanelGeneradorBasico.isVisible());
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        // TODO add your handling code here:
        Menu_Generadores Volver  = new Menu_Generadores();
        Volver.setVisible(true);
    }//GEN-LAST:event_jButton14ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButtonGenerar;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelFuncionSalida;
    private javax.swing.JLabel jLabelFuncionTransicion;
    private javax.swing.JLabel jLabelIteraciones;
    private javax.swing.JLabel jLabelResultado;
    private javax.swing.JLabel jLabelResultado1;
    private javax.swing.JLabel jLabelResultado2;
    private javax.swing.JLabel jLabelSemilla;
    private javax.swing.JMenu jMenuArchivo;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanelGeneradorBasico;
    private javax.swing.JScrollBar jScrollBar2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTextArea jTextAreaFuncionSalida;
    private javax.swing.JTextArea jTextAreaFuncionTransicion;
    private javax.swing.JTextArea jTextAreaResultado;
    private javax.swing.JTextArea jTextAreaResultado1;
    private javax.swing.JTextField jTextFieldIteraciones;
    private javax.swing.JTextField jTextFieldIteraciones1;
    private javax.swing.JTextField jTextFieldIteraciones2;
    private javax.swing.JTextField jTextFieldSemilla;
    // End of variables declaration//GEN-END:variables
}
