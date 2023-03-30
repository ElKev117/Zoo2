/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.zooproject.Vista;

/**
 *
 * @author USUARIO
 */
public class PlanWindow extends javax.swing.JFrame {

    /**
     * Creates new form PlanWindow
     */
    public PlanWindow() {
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

        bgPlanes = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        rBPlan0 = new javax.swing.JRadioButton();
        rBPlan2 = new javax.swing.JRadioButton();
        rBPlan1 = new javax.swing.JRadioButton();
        rBPlan3 = new javax.swing.JRadioButton();
        rBPlan4 = new javax.swing.JRadioButton();
        rBPlan5 = new javax.swing.JRadioButton();
        btnAvanzar = new javax.swing.JButton();
        btnBuyPlan = new javax.swing.JButton();
        btnBuyPet2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 255, 204));

        jPanel2.setBackground(new java.awt.Color(102, 255, 204));

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Planes");

        jScrollPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jTextArea1.setBackground(new java.awt.Color(102, 255, 204));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 14)); // NOI18N
        jTextArea1.setForeground(new java.awt.Color(51, 51, 51));
        jTextArea1.setRows(5);
        jTextArea1.setText("Puedes elegir entre los diferentes planes que tenemos para tí, puedes ir desde tener ningún plan a tener nuestro plan más avanzado, los planes están diseñados para dar una mayor\nsatisfación y comodidad a nuestros clientes:\n\nNota: recuerda que si eliges la opcion \"Ir sin plan\" no podrás acceder a los descuentos especializados que tenemos para tí\n\nPlan 1:\n\nPlan 2:\n\nPlan 3:\n\nPlan 4:\n\nPlan 5:");
        jScrollPane1.setViewportView(jTextArea1);

        jLabel1.setFont(new java.awt.Font("Segoe UI Emoji", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Selecciona un plan:");

        bgPlanes.add(rBPlan0);
        rBPlan0.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        rBPlan0.setForeground(new java.awt.Color(51, 51, 51));
        rBPlan0.setText("Ir sin plan");
        rBPlan0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rBPlan0ActionPerformed(evt);
            }
        });

        bgPlanes.add(rBPlan2);
        rBPlan2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        rBPlan2.setForeground(new java.awt.Color(51, 51, 51));
        rBPlan2.setText("Plan 2");
        rBPlan2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rBPlan2ActionPerformed(evt);
            }
        });

        bgPlanes.add(rBPlan1);
        rBPlan1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        rBPlan1.setForeground(new java.awt.Color(51, 51, 51));
        rBPlan1.setText("Plan 1");
        rBPlan1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rBPlan1ActionPerformed(evt);
            }
        });

        bgPlanes.add(rBPlan3);
        rBPlan3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        rBPlan3.setForeground(new java.awt.Color(51, 51, 51));
        rBPlan3.setText("Plan 3");
        rBPlan3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rBPlan3ActionPerformed(evt);
            }
        });

        bgPlanes.add(rBPlan4);
        rBPlan4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        rBPlan4.setForeground(new java.awt.Color(51, 51, 51));
        rBPlan4.setText("Plan 4");
        rBPlan4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rBPlan4ActionPerformed(evt);
            }
        });

        bgPlanes.add(rBPlan5);
        rBPlan5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        rBPlan5.setForeground(new java.awt.Color(51, 51, 51));
        rBPlan5.setText("Plan 5");
        rBPlan5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rBPlan5ActionPerformed(evt);
            }
        });

        btnAvanzar.setBackground(new java.awt.Color(255, 255, 255));
        btnAvanzar.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        btnAvanzar.setForeground(new java.awt.Color(51, 51, 51));
        btnAvanzar.setText("SIguiente");
        btnAvanzar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAvanzarActionPerformed(evt);
            }
        });

        btnBuyPlan.setBackground(new java.awt.Color(255, 255, 255));
        btnBuyPlan.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        btnBuyPlan.setForeground(new java.awt.Color(51, 51, 51));
        btnBuyPlan.setText("Comprar plan");
        btnBuyPlan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuyPlanActionPerformed(evt);
            }
        });

        btnBuyPet2.setBackground(new java.awt.Color(255, 255, 255));
        btnBuyPet2.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        btnBuyPet2.setForeground(new java.awt.Color(51, 51, 51));
        btnBuyPet2.setText("Volver");
        btnBuyPet2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuyPet2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(568, 568, 568)
                        .addComponent(jLabel2))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel1)
                        .addGap(88, 88, 88)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rBPlan5)
                            .addComponent(rBPlan4)
                            .addComponent(rBPlan3)
                            .addComponent(rBPlan2)
                            .addComponent(rBPlan1)
                            .addComponent(rBPlan0))))
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(200, 200, 200)
                .addComponent(btnBuyPet2, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 324, Short.MAX_VALUE)
                .addComponent(btnBuyPlan)
                .addGap(311, 311, 311)
                .addComponent(btnAvanzar, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(267, 267, 267))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rBPlan0)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addComponent(rBPlan1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(rBPlan2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rBPlan3)
                .addGap(12, 12, 12)
                .addComponent(rBPlan4)
                .addGap(18, 18, 18)
                .addComponent(rBPlan5)
                .addGap(120, 120, 120)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAvanzar)
                    .addComponent(btnBuyPlan)
                    .addComponent(btnBuyPet2))
                .addGap(71, 71, 71))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rBPlan0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rBPlan0ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rBPlan0ActionPerformed

    private void rBPlan2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rBPlan2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rBPlan2ActionPerformed

    private void rBPlan1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rBPlan1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rBPlan1ActionPerformed

    private void rBPlan3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rBPlan3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rBPlan3ActionPerformed

    private void rBPlan4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rBPlan4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rBPlan4ActionPerformed

    private void rBPlan5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rBPlan5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rBPlan5ActionPerformed

    private void btnAvanzarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAvanzarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAvanzarActionPerformed

    private void btnBuyPlanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuyPlanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBuyPlanActionPerformed

    private void btnBuyPet2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuyPet2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBuyPet2ActionPerformed

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
            java.util.logging.Logger.getLogger(PlanWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PlanWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PlanWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PlanWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PlanWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bgPlanes;
    private javax.swing.JButton btnAvanzar;
    private javax.swing.JButton btnBuyPet2;
    private javax.swing.JButton btnBuyPlan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JRadioButton rBPlan0;
    private javax.swing.JRadioButton rBPlan1;
    private javax.swing.JRadioButton rBPlan2;
    private javax.swing.JRadioButton rBPlan3;
    private javax.swing.JRadioButton rBPlan4;
    private javax.swing.JRadioButton rBPlan5;
    // End of variables declaration//GEN-END:variables
}