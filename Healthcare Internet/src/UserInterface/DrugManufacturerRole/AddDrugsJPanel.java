/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.DrugManufacturerRole;

import Business.Drug.Drug;
import Business.Drug.DrugDirectory;
import Business.Enterprise.DrugEnterprise;
import Business.Enterprise.Enterprise;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author AustinGnanaraj
 */
public class AddDrugsJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private Enterprise enterprise;
    private Drug drug;
    private DrugDirectory dd;

    /**
     * Creates new form AddDrugsJPanel
     */
    public AddDrugsJPanel(JPanel userProcessContainer, Enterprise enterprise, DrugDirectory dd) {
        initComponents();

        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.dd = dd;
        drugCompanyNameJTextField.setText(enterprise.getName());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        addDrugsJLabel = new javax.swing.JLabel();
        drugNameJLabel = new javax.swing.JLabel();
        drugManunameJLabel = new javax.swing.JLabel();
        compoJLabel = new javax.swing.JLabel();
        addDrugJButton = new javax.swing.JButton();
        drugNameJTextField = new javax.swing.JTextField();
        drugCompanyNameJTextField = new javax.swing.JTextField();
        compositionJTextField = new javax.swing.JTextField();
        backJButton = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        addDrugsJLabel.setText("Add Drugs");
        add(addDrugsJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(263, 13, -1, -1));

        drugNameJLabel.setText("Drug Name");
        add(drugNameJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(151, 88, -1, -1));

        drugManunameJLabel.setText("Drug Company Name");
        add(drugManunameJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(94, 162, -1, -1));

        compoJLabel.setText("Drug Composition");
        add(compoJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(114, 262, -1, -1));

        addDrugJButton.setText("Add Drug ");
        addDrugJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addDrugJButtonActionPerformed(evt);
            }
        });
        add(addDrugJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(357, 378, -1, -1));
        add(drugNameJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(425, 88, 200, -1));
        add(drugCompanyNameJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(425, 174, 200, -1));
        add(compositionJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(425, 242, 200, 57));

        backJButton.setText("<< Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(114, 378, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void addDrugJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addDrugJButtonActionPerformed
        // TODO add your handling code here:

        String drugName = drugNameJTextField.getText();

        String composition = compositionJTextField.getText();

        Drug d = ((DrugEnterprise) enterprise).getDrugDirectory().addDrug();
        d.setDrugComposition(composition);
        d.setDrugName(drugName);
        d.setManufacturingCompany(enterprise.getName());
        JOptionPane.showMessageDialog(null, "Drug Added Successfully");
        System.out.println(d);

    }//GEN-LAST:event_addDrugJButtonActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addDrugJButton;
    private javax.swing.JLabel addDrugsJLabel;
    private javax.swing.JButton backJButton;
    private javax.swing.JLabel compoJLabel;
    private javax.swing.JTextField compositionJTextField;
    private javax.swing.JTextField drugCompanyNameJTextField;
    private javax.swing.JLabel drugManunameJLabel;
    private javax.swing.JLabel drugNameJLabel;
    private javax.swing.JTextField drugNameJTextField;
    // End of variables declaration//GEN-END:variables
}
