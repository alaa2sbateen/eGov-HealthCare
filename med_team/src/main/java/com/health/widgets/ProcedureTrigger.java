/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.health.widgets;

import com.health.objects.GetAvailibleRooms;
import com.health.objects.GetAvailibleServices;
import com.health.objects.GetProcedure;
import com.health.objects.StartProcedure;
import com.health.objects.Types;
import com.health.project.medteam.Globals;
import com.health.project.medteam.Util;
import java.util.ArrayList;
import java.util.List;
import javax.swing.SwingUtilities;

/**
 *
 * @author Inspiron
 */
public class ProcedureTrigger extends javax.swing.JPanel {

    /**
     * Creates new form ProcedureTrigger
     */
    private GetProcedure.Procedure procedure;

    public ProcedureTrigger() {
        initComponents();
        Procedurecontainer.setRemoveButtonVisibilty(false);
    }

    public void setData(GetProcedure.Procedure proc) {
        this.procedure = proc;
        this.procedure.type = Types.Type_Procedure_Independent;
        Procedurecontainer.setData(null, this.procedure, false, null);
    }

    public GetProcedure.Procedure get() {
        return this.procedure;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        Procedurecontainer = new com.health.widgets.Procedure();
        jPanel1 = new javax.swing.JPanel();
        StartBtn = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(920, 700));
        setLayout(new javax.swing.BoxLayout(this, javax.swing.BoxLayout.Y_AXIS));

        jScrollPane1.setViewportView(Procedurecontainer);

        add(jScrollPane1);

        jPanel1.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel1.setPreferredSize(new java.awt.Dimension(1056, 100));

        StartBtn.setText("Start Visit");
        StartBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StartBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(StartBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(313, 313, 313))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(StartBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE)
                .addContainerGap())
        );

        add(jPanel1);
    }// </editor-fold>//GEN-END:initComponents

    private void StartBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StartBtnActionPerformed
        // TODO add your handling code here

        boolean check = Util.checkProcedure(procedure);
        if (!check) {
            return;
        }

        StartBtn.setText("Please wait ...");
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                StartProcedure.StartProcedure(Globals.patien_id, procedure);
                Globals.update();
                Globals.startProc.get().dispose();
                Globals.showMsg("Visit Started Successfully");
                StartBtn.setText("Start visit");

            }
        });


    }//GEN-LAST:event_StartBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.health.widgets.Procedure Procedurecontainer;
    private javax.swing.JButton StartBtn;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
