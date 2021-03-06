/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Patient;

import Business.Drug.Drug;
import Business.EcoSystem;
import Business.Enterprise.DrugEnterprise;
import Business.Enterprise.Enterprise;
import Business.Enterprise.HospitalEnterprise;
import Business.Network.Network;
import Business.Patient.Patient;
import Business.UserAccount.UserAccount;
import Business.PatientsLikeMe.Review;
import Business.WorkQueue.WorkRequest;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author AustinGnanaraj
 */
public class PatientDrugReviewJPanel extends javax.swing.JPanel {

    /**
     * Creates new form PatientDrugReviewJPanel
     */
    JPanel userProcessContainer;
    Enterprise enterprise;
    EcoSystem eco;
    UserAccount account;

    public PatientDrugReviewJPanel(JPanel userProcessContainer, Enterprise enterprise, EcoSystem eco, UserAccount account) {
        initComponents();
        this.eco = eco;
        this.enterprise = enterprise;
        this.account = account;
        this.userProcessContainer = userProcessContainer;
        populateDrugCompanyCombo();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        cmbDrugCompany = new javax.swing.JComboBox();
        cmbDrug = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        txtReview = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnSubmitReview = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Patient Drug Review JPanel");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(241, 34, 345, 43));

        cmbDrugCompany.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbDrugCompany.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbDrugCompanyActionPerformed(evt);
            }
        });
        add(cmbDrugCompany, new org.netbeans.lib.awtextra.AbsoluteConstraints(311, 94, 253, 39));

        cmbDrug.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(cmbDrug, new org.netbeans.lib.awtextra.AbsoluteConstraints(311, 139, 253, 45));

        jLabel2.setText("Drug");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(129, 139, 142, 45));

        jLabel3.setText("Drug Company");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(121, 92, 120, 43));

        jButton1.setText("Get Review >>");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 110, 210, 52));
        add(txtReview, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 230, 260, 100));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Review", "Reviewer"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
        }

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 80, 510, 110));

        btnSubmitReview.setText("Submit Review");
        btnSubmitReview.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitReviewActionPerformed(evt);
            }
        });
        add(btnSubmitReview, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 360, 260, 70));

        jLabel4.setText("Comments");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 240, 140, 40));
    }// </editor-fold>//GEN-END:initComponents

    private void cmbDrugCompanyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbDrugCompanyActionPerformed
        DrugEnterprise d = (DrugEnterprise) cmbDrugCompany.getSelectedItem();
        if (d != null) {
            cmbDrug.removeAllItems();
            for (Drug drug : d.getDrugDirectory().getDrugDirectory()) {
                cmbDrug.addItem(drug);
            }
        }
    }//GEN-LAST:event_cmbDrugCompanyActionPerformed

    private void btnSubmitReviewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitReviewActionPerformed
        Drug drug = (Drug) cmbDrug.getSelectedItem();
        Review r = new Review();
        r.setMessage(txtReview.getText());
        r.setSender(account);
        r.setStatus("sent");
        drug.getDrugReviewDirectory().getWorkRequestList().add(r);
        JOptionPane.showMessageDialog(null, "Submitted");

    }//GEN-LAST:event_btnSubmitReviewActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Drug d = (Drug) cmbDrug.getSelectedItem();

        DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
        dtm.setRowCount(0);
        for (WorkRequest work : d.getDrugReviewDirectory().getWorkRequestList()) {
            Review r = (Review) work;
            Object row[] = new Object[2];
            row[0] = r.getMessage();
            row[1] = r.getSender().getPerson().getName();
            dtm.addRow(row);

        }
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSubmitReview;
    private javax.swing.JComboBox cmbDrug;
    private javax.swing.JComboBox cmbDrugCompany;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtReview;
    // End of variables declaration//GEN-END:variables

    private void populateDrugCompanyCombo() {
        cmbDrugCompany.removeAllItems();
        for (Network n : eco.getNetworkList()) {
            for (Enterprise e : n.getEnterpriseDirectory().getEnterpriseList()) {
                if (e instanceof DrugEnterprise) {
                    cmbDrugCompany.addItem(e);
                }
            }
        }
    }
}
