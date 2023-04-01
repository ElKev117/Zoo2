/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.zooproject.Vista;

import com.mycompany.zooproject.Controlador.PetFoodSale;
import static java.lang.Float.parseFloat;
import static java.lang.Integer.parseInt;

/**
 *
 * @author USUARIO
 */
public class BuyFoodAnimalWindow extends javax.swing.JFrame {

    /**
     * Creates new form BuyFoodAnimalWindow
     */
    public BuyFoodAnimalWindow() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        tfBuyFoodPetProduct = new javax.swing.JTextField();
        tfBuyFoodPetPrice = new javax.swing.JTextField();
        tfBuyFoodPetQuantity = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnBuyPetFood = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 255, 153));

        jLabel1.setFont(new java.awt.Font("Likhan", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Comprar la comida de mi mascota");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        tfBuyFoodPetProduct.setBackground(new java.awt.Color(255, 255, 255));
        tfBuyFoodPetProduct.setForeground(new java.awt.Color(51, 51, 51));
        tfBuyFoodPetProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfBuyFoodPetProductActionPerformed(evt);
            }
        });

        tfBuyFoodPetPrice.setBackground(new java.awt.Color(255, 255, 255));
        tfBuyFoodPetPrice.setForeground(new java.awt.Color(51, 51, 51));
        tfBuyFoodPetPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfBuyFoodPetPriceActionPerformed(evt);
            }
        });

        tfBuyFoodPetQuantity.setBackground(new java.awt.Color(255, 255, 255));
        tfBuyFoodPetQuantity.setForeground(new java.awt.Color(51, 51, 51));
        tfBuyFoodPetQuantity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfBuyFoodPetQuantityActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Liberation Mono", 1, 15)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Producto");

        jLabel3.setFont(new java.awt.Font("Liberation Mono", 1, 15)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Precio");

        jLabel5.setFont(new java.awt.Font("Liberation Mono", 1, 15)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Cantidad");

        btnBuyPetFood.setBackground(new java.awt.Color(255, 255, 255));
        btnBuyPetFood.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        btnBuyPetFood.setForeground(new java.awt.Color(51, 51, 51));
        btnBuyPetFood.setText("Comprar comida");
        btnBuyPetFood.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuyPetFoodActionPerformed(evt);
            }
        });

        btnVolver.setBackground(new java.awt.Color(255, 255, 255));
        btnVolver.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        btnVolver.setForeground(new java.awt.Color(51, 51, 51));
        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(147, 147, 147)
                .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnBuyPetFood)
                .addGap(203, 203, 203))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(126, 126, 126)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                            .addComponent(tfBuyFoodPetQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(37, 37, 37)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(tfBuyFoodPetPrice, javax.swing.GroupLayout.DEFAULT_SIZE, 425, Short.MAX_VALUE)
                                .addComponent(tfBuyFoodPetProduct))))
                    .addGap(124, 124, 124)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 308, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBuyPetFood)
                    .addComponent(btnVolver))
                .addGap(76, 76, 76))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(131, 131, 131)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(tfBuyFoodPetProduct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(tfBuyFoodPetPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(25, 25, 25)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(tfBuyFoodPetQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(245, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 728, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfBuyFoodPetProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfBuyFoodPetProductActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfBuyFoodPetProductActionPerformed

    private void tfBuyFoodPetPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfBuyFoodPetPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfBuyFoodPetPriceActionPerformed

    private void tfBuyFoodPetQuantityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfBuyFoodPetQuantityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfBuyFoodPetQuantityActionPerformed

    private void btnBuyPetFoodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuyPetFoodActionPerformed
        // TODO add your handling code here:
        PetFoodSale petFoodSale = new PetFoodSale(tfBuyFoodPetProduct.getText(), 
                parseFloat(tfBuyFoodPetPrice.getText()), 
                parseInt(tfBuyFoodPetQuantity.getText()));
        
        ZooWindow.costumers.getCostumer().get(ZooWindow.currentCostumer).setPurchaseAmount(petFoodSale.getPrice()*parseInt(tfBuyFoodPetQuantity.getText()));
    }//GEN-LAST:event_btnBuyPetFoodActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        // TODO add your handling code here:
        new ZooWindow().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuyPetFood;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField tfBuyFoodPetPrice;
    private javax.swing.JTextField tfBuyFoodPetProduct;
    private javax.swing.JTextField tfBuyFoodPetQuantity;
    // End of variables declaration//GEN-END:variables
}
