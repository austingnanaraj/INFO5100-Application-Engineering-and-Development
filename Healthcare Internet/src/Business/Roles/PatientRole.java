/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Roles;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import UserInterface.Patient.PatientWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author AustinGnanaraj
 */
public class PatientRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem ecoSystem, Network network) {
        return new PatientWorkAreaJPanel(userProcessContainer,enterprise, account,ecoSystem); 
    }
    
}
