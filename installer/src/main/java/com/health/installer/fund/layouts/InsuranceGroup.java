/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.health.installer.fund.layouts;

import com.health.baseobjects.JCheckBoxTree2;
import javax.swing.JButton;
import javax.swing.JTextField;

/**
 *
 * @author Inspiron
 */
public class InsuranceGroup extends javax.swing.JPanel {

    /**
     * Creates new form InsuranceGroup
     */
    public InsuranceGroup() {
        initComponents();
    }

    public JTextField getPercentage() {
        return this.PercentageText;
    }

    public JButton getRemove() {
        return this.RemoveBtn;
    }

    public JCheckBoxTree2 getTree() {
        return this.InsuranceTree;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        InsuranceGroupPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        InsuranceTree = new com.health.baseobjects.JCheckBoxTree2();
        RemoveBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        PercentageText = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();

        InsuranceGroupPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jScrollPane1.setViewportView(InsuranceTree);

        RemoveBtn.setText("Remove");

        jLabel2.setText("Discount Percentage (%)");

        PercentageText.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        PercentageText.setText("30");

        jLabel4.setText("Selected Insurances");

        javax.swing.GroupLayout InsuranceGroupPanelLayout = new javax.swing.GroupLayout(InsuranceGroupPanel);
        InsuranceGroupPanel.setLayout(InsuranceGroupPanelLayout);
        InsuranceGroupPanelLayout.setHorizontalGroup(
            InsuranceGroupPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InsuranceGroupPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(InsuranceGroupPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(InsuranceGroupPanelLayout.createSequentialGroup()
                        .addGroup(InsuranceGroupPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(PercentageText, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 300, Short.MAX_VALUE)
                        .addComponent(RemoveBtn))
                    .addGroup(InsuranceGroupPanelLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        InsuranceGroupPanelLayout.setVerticalGroup(
            InsuranceGroupPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, InsuranceGroupPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(InsuranceGroupPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RemoveBtn)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(PercentageText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addGap(5, 5, 5)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 549, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(InsuranceGroupPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 353, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(InsuranceGroupPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel InsuranceGroupPanel;
    private com.health.baseobjects.JCheckBoxTree2 InsuranceTree;
    private javax.swing.JTextField PercentageText;
    private javax.swing.JButton RemoveBtn;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
