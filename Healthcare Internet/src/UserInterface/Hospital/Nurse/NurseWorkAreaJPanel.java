/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Hospital.Nurse;

import Business.Enterprise.HospitalEnterprise;
import Business.Organization.NurseOrganization;
import Business.Patient.Patient;
import Business.VitalSign.VitalSign;
import Business.UserAccount.UserAccount;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author AustinGnanaraj
 */
public class NurseWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form NurseWorkAreaJPanel
     */
    JPanel userProcessContainer;
    NurseOrganization organization;
    HospitalEnterprise enterprise;
    UserAccount account;
    Date date;

    public NurseWorkAreaJPanel(JPanel userProcessContainer, NurseOrganization organization, HospitalEnterprise enterprise, UserAccount account) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.organization = organization;
        this.enterprise = enterprise;
        this.account = account;
        populateTable();

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
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPatients = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        btnAddVitalSigns = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtRespiratory = new javax.swing.JTextField();
        txtSystolic = new javax.swing.JTextField();
        txtHeartRate = new javax.swing.JTextField();
        txtWeight = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblVitalSigns = new javax.swing.JTable();
        btnGetVitalSign = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Nurse Work Area");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 29, 192, 29));

        tblPatients.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Patient Name", "SSN"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblPatients);
        if (tblPatients.getColumnModel().getColumnCount() > 0) {
            tblPatients.getColumnModel().getColumn(0).setResizable(false);
            tblPatients.getColumnModel().getColumn(1).setResizable(false);
        }

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 490, 130));

        jLabel2.setText("Patient List");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 130, 30));

        btnAddVitalSigns.setText("Add VitalSigns >>");
        btnAddVitalSigns.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddVitalSignsActionPerformed(evt);
            }
        });
        add(btnAddVitalSigns, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 370, 160, 50));

        jLabel3.setText("Respiratory Rate");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 360, 110, 30));

        jLabel4.setText("Heart Rate");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 410, 80, 30));

        jLabel5.setText("Systolic Blood Pressure");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 354, 120, 30));

        jLabel6.setText("Weight");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 404, 80, 30));
        add(txtRespiratory, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 360, 130, 30));
        add(txtSystolic, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 360, 170, 30));
        add(txtHeartRate, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 410, 130, 30));
        add(txtWeight, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 410, 170, 30));

        tblVitalSigns.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Test Date", "Respiratory Rate", "Heart Rate", "Systolic Blood Pressure", "Weight"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblVitalSigns);
        if (tblVitalSigns.getColumnModel().getColumnCount() > 0) {
            tblVitalSigns.getColumnModel().getColumn(0).setResizable(false);
            tblVitalSigns.getColumnModel().getColumn(1).setResizable(false);
            tblVitalSigns.getColumnModel().getColumn(2).setResizable(false);
            tblVitalSigns.getColumnModel().getColumn(3).setResizable(false);
            tblVitalSigns.getColumnModel().getColumn(4).setResizable(false);
        }

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 160, 610, 130));

        btnGetVitalSign.setText("Get Vital Sign >>");
        btnGetVitalSign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGetVitalSignActionPerformed(evt);
            }
        });
        add(btnGetVitalSign, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 200, 140, 50));
    }// </editor-fold>//GEN-END:initComponents

    private void btnGetVitalSignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGetVitalSignActionPerformed
        int selectedRow = tblPatients.getSelectedRow();
        if (selectedRow >= 0) {
            DefaultTableModel dtm = (DefaultTableModel) tblPatients.getModel();
            dtm.setRowCount(0);
            Patient d = (Patient) tblPatients.getValueAt(selectedRow, 0);
            Object[] row = new Object[5];
            for (VitalSign v : d.getVitalSignHistory().getVitalSignList()) {
                row[0] = v;
                row[1] = v.getRespiratoryRate();
                row[2] = v.getHeartRate();
                row[3] = v.getSystolicBloodPressure();
                row[4] = v.getWeight();
                dtm.addRow(row);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Please select a row");
        }
    }//GEN-LAST:event_btnGetVitalSignActionPerformed

    private void btnAddVitalSignsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddVitalSignsActionPerformed
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        date = new Date();
        int selectedRow = tblPatients.getSelectedRow();
        Patient d = (Patient) tblPatients.getValueAt(selectedRow, 0);
        VitalSign v = d.getVitalSignHistory().addVitalSign();
        v.setHeartRate(Float.parseFloat(txtHeartRate.getText()));
        v.setRespiratoryRate(Float.parseFloat(txtRespiratory.getText()));
        v.setSystolicBloodPressure(Float.parseFloat(txtSystolic.getText()));
        v.setTestDate(dateFormat.format(date));
        v.setWeight(Float.parseFloat(txtWeight.getText()));
        DefaultTableModel dtm = (DefaultTableModel) tblVitalSigns.getModel();
        dtm.setRowCount(0);
        Object[] row = new Object[5];
        for (VitalSign ve : d.getVitalSignHistory().getVitalSignList()) {
            row[0] = ve;
            row[1] = ve.getRespiratoryRate();
            row[2] = ve.getHeartRate();
            row[3] = ve.getSystolicBloodPressure();
            row[4] = ve.getWeight();
            dtm.addRow(row);
        }
    }//GEN-LAST:event_btnAddVitalSignsActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddVitalSigns;
    private javax.swing.JButton btnGetVitalSign;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblPatients;
    private javax.swing.JTable tblVitalSigns;
    private javax.swing.JTextField txtHeartRate;
    private javax.swing.JTextField txtRespiratory;
    private javax.swing.JTextField txtSystolic;
    private javax.swing.JTextField txtWeight;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
        DefaultTableModel dtm = (DefaultTableModel) tblPatients.getModel();
        dtm.setRowCount(0);
        Object[] row = new Object[2];
        for (Patient p : enterprise.getPatientDirectory().getPatientDirectory()) {
            row[0] = p;
            row[1] = p.getSsn();
            dtm.addRow(row);
        }
    }
}
