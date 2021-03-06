/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Hospital.Doctor;

import Business.Doctor.Doctor;
import Business.Drug.Drug;
import Business.EcoSystem;
import Business.Enterprise.DrugEnterprise;
import Business.Enterprise.Enterprise;
import Business.Enterprise.HospitalEnterprise;
import Business.Enterprise.PharmacyEnterprise;
import Business.Network.Network;
import Business.Organization.DoctorOrganization;
import Business.Patient.Patient;
import Business.WorkQueue.DoctorPrescriptionToPharmacy;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author AustinGnanaraj
 */
public class OrderDrugsForPatientsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form OrderDrugsFromManufacturerJPanel
     */
    JPanel userProcessContainer;
    Patient patient;
    Doctor doctor;
    EcoSystem eco;
    HospitalEnterprise enterprise;
    DoctorOrganization organization;
    DrugEnterprise de;
    Network net;

    public OrderDrugsForPatientsJPanel(JPanel userProcessContainer, Patient patient, Doctor doctor, EcoSystem eco, HospitalEnterprise enterprise, DoctorOrganization organization, Network net) {
        initComponents();
        this.organization
                = organization;
        this.patient = patient;
        this.userProcessContainer = userProcessContainer;
        this.doctor = doctor;
        this.eco = eco;
        this.enterprise = enterprise;
        this.net = net;
        populateManufacturerer();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cmbManufacturerer = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cmbDrugName = new javax.swing.JComboBox();
        spnQuantity = new javax.swing.JSpinner();
        jButton1 = new javax.swing.JButton();
        backJButton = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cmbManufacturerer.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbManufacturerer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbManufacturererActionPerformed(evt);
            }
        });
        add(cmbManufacturerer, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 70, 290, 60));

        jLabel1.setText("Quantity");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 250, 160, 60));

        jLabel2.setText("Drug Manufacturer");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 70, 160, 60));

        jLabel3.setText("Drug Name");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 160, 160, 60));

        cmbDrugName.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(cmbDrugName, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 160, 290, 60));
        add(spnQuantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 250, 290, 60));

        jButton1.setText("Submit Request");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 370, 290, 50));

        backJButton.setText("<< Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 370, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void cmbManufacturererActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbManufacturererActionPerformed
        DrugEnterprise network = (DrugEnterprise) cmbManufacturerer.getSelectedItem();
        if (network != null) {
            populateDrugs(network);
        }
    }//GEN-LAST:event_cmbManufacturererActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        DoctorPrescriptionToPharmacy dpp = new DoctorPrescriptionToPharmacy();
        DrugEnterprise de = (DrugEnterprise) cmbManufacturerer.getSelectedItem();
        Drug drug = (Drug) cmbDrugName.getSelectedItem();

        int quantity = (int) spnQuantity.getValue();
        eco.getDrugPrescriptionDirectory().getWorkRequestList().add(dpp);
        dpp.setDoctor(doctor);
        dpp.setDrug(drug);
        dpp.setPatient(patient);
        dpp.setQuantityOfDrugs(quantity);
        dpp.setHospitalEnterprise(enterprise);
        dpp.setNetwork(net);
        dpp.setStatus("requested");
        JOptionPane.showMessageDialog(null, "submitted");

    }//GEN-LAST:event_jButton1ActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JComboBox cmbDrugName;
    private javax.swing.JComboBox cmbManufacturerer;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JSpinner spnQuantity;
    // End of variables declaration//GEN-END:variables

    private void populateManufacturerer() {
        cmbManufacturerer.removeAllItems();
        for (Network n : eco.getNetworkList()) {
            for (Enterprise de : n.getEnterpriseDirectory().getEnterpriseList()) {
                if (de instanceof DrugEnterprise) {
                    cmbManufacturerer.addItem(de);

                }
            }
        }
    }

    private void populateDrugs(DrugEnterprise de) {
        cmbDrugName.removeAllItems();
        for (Drug d : de.getDrugDirectory().getDrugDirectory()) {
            cmbDrugName.addItem(d);
        }
    }
}
