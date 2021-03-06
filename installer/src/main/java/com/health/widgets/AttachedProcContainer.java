/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.health.widgets;

import com.health.advanced.Handler;
import com.health.objects.GetCondtion;
import com.health.objects.GetProcedure;
import com.health.objects.Types;
import java.util.ArrayList;

/**
 *
 * @author Inspiron
 */
public class AttachedProcContainer extends javax.swing.JPanel {

    /**
     * Creates new form AttachedProcContainer
     */
    private GetCondtion.Condtion cond;

    public AttachedProcContainer() {
        initComponents();
    }

    public void setData(GetCondtion.Condtion cond, boolean is_new) {
        this.cond = cond;
        if (!is_new) {

            for (int i = 0; i < cond.attached_procedures.size(); i++) {
                addProcedure(cond.attached_procedures.get(i));
            }
        }
    }

    public void addNewProcedure() {
        Handler d = new Handler();
        d.chooseProcedure(new Handler.ChoosedProc() {
            @Override
            public void onChoose(GetProcedure.Procedure proc) {
                cond.attached_procedures.add(0, proc);
                proc.type=Types.Type_Template_User;
                Procedure p = new Procedure();
                p.setData(cond, proc, false, null);
                Container.add(p, 0);
                Container.revalidate();
                Container.repaint();
            }
        });

    }

    public void addProcedure(GetProcedure.Procedure proc) {

        Procedure p = new Procedure();
        p.setData(cond, proc, false, null);
        Container.add(p);
        Container.revalidate();
        Container.repaint();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        add = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        Container = new javax.swing.JPanel();

        setBorder(javax.swing.BorderFactory.createEtchedBorder());

        add.setText("Add");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });

        jLabel1.setText("Attached Visits");

        Container.setLayout(new javax.swing.BoxLayout(Container, javax.swing.BoxLayout.Y_AXIS));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Container, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(33, 33, 33)
                        .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 548, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(add))
                .addGap(18, 18, 18)
                .addComponent(Container, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        // TODO add your handling code here:
        addNewProcedure();
    }//GEN-LAST:event_addActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Container;
    private javax.swing.JButton add;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
