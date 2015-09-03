/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Hospital.Doctor;

import Business.Doctor.Doctor;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.HospitalEnterprise;
import Business.Network.Network;
import Business.Organization.DoctorOrganization;
import Business.Patient.Patient;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author AustinGnanaraj
 */
public class ManagePatientsJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private Enterprise enterprise;
    private Doctor doctor;
    private EcoSystem eco;
    private Network net;
    private DoctorOrganization organization;

    /**
     * Creates new form ViewPatientDetailsJPanel
     */
    public ManagePatientsJPanel(JPanel userProcessContainer, Enterprise enterprise, UserAccount account, EcoSystem eco, DoctorOrganization organization, Network net) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.eco = eco;
     //   this.net = net;
        this.organization = organization;
        HospitalEnterprise he = (HospitalEnterprise) enterprise;
        for (Doctor d : he.getDoctorDirectory().getDoctorDirectory()) {
            if (account.getPerson().getName().equals(d.getName())) {
                doctor = d;
                break;
            }
        }
        populatepatienttable();
    }

    public void populatepatienttable() {
        DefaultTableModel dtm = (DefaultTableModel) viewPatientDetailsJTable.getModel();
        dtm.setRowCount(0);

        for (Patient patient : ((HospitalEnterprise) enterprise).getPatientDirectory().getPatientDirectory()) {
            Object row[] = new Object[5];
            row[0] = patient;
            row[1] = patient.getSsn();
            row[2] = patient.getPhoneNumber();
            row[3] = patient.getAddress();
            dtm.addRow(row);
        }
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
        viewPatientDetailsJTable = new javax.swing.JTable();
        patientDetailsJLabel = new javax.swing.JLabel();
        searchJButton = new javax.swing.JButton();
        searchPatientJTextField = new javax.swing.JTextField();
        backJButton = new javax.swing.JButton();
        refreshJButton = new javax.swing.JButton();
        createEncounterJButton = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        viewPatientDetailsJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Patient Name", "SSN", "Contact Number", "Address"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(viewPatientDetailsJTable);
        if (viewPatientDetailsJTable.getColumnModel().getColumnCount() > 0) {
            viewPatientDetailsJTable.getColumnModel().getColumn(0).setResizable(false);
            viewPatientDetailsJTable.getColumnModel().getColumn(1).setResizable(false);
            viewPatientDetailsJTable.getColumnModel().getColumn(2).setResizable(false);
            viewPatientDetailsJTable.getColumnModel().getColumn(3).setResizable(false);
        }

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 789, 184));

        patientDetailsJLabel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        patientDetailsJLabel.setText("Patient Details");
        add(patientDetailsJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(378, 13, -1, -1));

        searchJButton.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        searchJButton.setText("Search Patient");
        searchJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchJButtonActionPerformed(evt);
            }
        });
        add(searchJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(155, 260, -1, -1));
        add(searchPatientJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(359, 261, 103, -1));

        backJButton.setText("<<Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 430, 80, 30));

        refreshJButton.setText("Refresh");
        refreshJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshJButtonActionPerformed(evt);
            }
        });
        add(refreshJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, -1, -1));

        createEncounterJButton.setText("Create Encounter>>");
        createEncounterJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createEncounterJButtonActionPerformed(evt);
            }
        });
        add(createEncounterJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 260, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void searchJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchJButtonActionPerformed
        // TODO add your handling code here:

        /*    String searchResult = searchPatientJTextField.getText();
         if (searchResult == null || searchResult.length() == 0) {
         JOptionPane.showMessageDialog(null, "Please input the Patient ID", "warning", JOptionPane.WARNING_MESSAGE);
         }
         Patient search = patientHistory.searchPatient(searchResult);

         // if we don't find the result 
         if (searchResult == null) {
         JOptionPane.showMessageDialog(null, "Input a valid PatientID", "warning", JOptionPane.WARNING_MESSAGE);
         return;
         }

         SearchPatientJPanel sp = new SearchPatientJPanel(userContainer, search);
         userContainer.add("SearchPatientJPanel", sp);
         CardLayout layout = (CardLayout) userContainer.getLayout();
         layout.next(userContainer);
         */

    }//GEN-LAST:event_searchJButtonActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        // TODO add your handling code here:

        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void refreshJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshJButtonActionPerformed
        // TODO add your handling code here:
        populatepatienttable();
    }//GEN-LAST:event_refreshJButtonActionPerformed

    private void createEncounterJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createEncounterJButtonActionPerformed
        // TODO add your handling code here:
        int selectedRow = viewPatientDetailsJTable.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row");
            return;
        }

        {
            Patient patient = (Patient) viewPatientDetailsJTable.getValueAt(selectedRow, 0);

            AddPatientEncounterJPanel pep = new AddPatientEncounterJPanel(userProcessContainer, patient, doctor, eco, net,(HospitalEnterprise)enterprise,organization);
            userProcessContainer.add("PatientEncounterJPanel", pep);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
        }


    }//GEN-LAST:event_createEncounterJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JButton createEncounterJButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel patientDetailsJLabel;
    private javax.swing.JButton refreshJButton;
    private javax.swing.JButton searchJButton;
    private javax.swing.JTextField searchPatientJTextField;
    private javax.swing.JTable viewPatientDetailsJTable;
    // End of variables declaration//GEN-END:variables

}
