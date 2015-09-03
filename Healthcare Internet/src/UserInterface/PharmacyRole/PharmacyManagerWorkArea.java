/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.PharmacyRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.PharmacyEnterprise;
import Business.Network.Network;
import Business.Organization.PharamacyOrganization;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author AustinGnanaraj
 */
public class PharmacyManagerWorkArea extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private Enterprise enterprise;
    private PharamacyOrganization organization;
    private UserAccount account;
    private Network net;
    private EcoSystem eco;

    /**
     * Creates new form PharmacyManagerWorkArea
     */
    public PharmacyManagerWorkArea(JPanel userProcessContainer, PharamacyOrganization organization, Enterprise enterprise, UserAccount account, EcoSystem eco) {
        initComponents();
        this.account = account;
        this.enterprise = enterprise;
        this.organization = organization;
        this.eco = eco;
        this.userProcessContainer = userProcessContainer;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pharamacyManagerWorkAreaJLabel = new javax.swing.JLabel();
        manageRequests = new javax.swing.JButton();
        manageStocks = new javax.swing.JButton();
        manageMessages = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pharamacyManagerWorkAreaJLabel.setText("Pharamacy Manager WorkArea");
        add(pharamacyManagerWorkAreaJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 20, 202, 26));

        manageRequests.setText("Manage Requests");
        manageRequests.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageRequestsActionPerformed(evt);
            }
        });
        add(manageRequests, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 100, 310, 60));

        manageStocks.setText("Manage Stocks");
        manageStocks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageStocksActionPerformed(evt);
            }
        });
        add(manageStocks, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 210, 310, 60));

        manageMessages.setText(" Messages");
        add(manageMessages, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 330, 310, 60));
    }// </editor-fold>//GEN-END:initComponents

    private void manageRequestsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageRequestsActionPerformed
        ManageRequestsJPanel manageRequestsJPanel = new ManageRequestsJPanel(userProcessContainer, eco, (PharmacyEnterprise) enterprise);
        userProcessContainer.add("manageOrganizationJPanel", manageRequestsJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_manageRequestsActionPerformed

    private void manageStocksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageStocksActionPerformed
        // TODO add your handling code here:
        InventoryManagementJPanel inventoryManagementJPanel = new InventoryManagementJPanel(userProcessContainer, (PharmacyEnterprise) enterprise, eco);
        userProcessContainer.add("InventoryManagementJPanel", inventoryManagementJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_manageStocksActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton manageMessages;
    private javax.swing.JButton manageRequests;
    private javax.swing.JButton manageStocks;
    private javax.swing.JLabel pharamacyManagerWorkAreaJLabel;
    // End of variables declaration//GEN-END:variables
}
