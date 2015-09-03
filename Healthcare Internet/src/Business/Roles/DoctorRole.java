/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Roles;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.DoctorOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import UserInterface.Hospital.Doctor.DoctorWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author AustinGnanaraj
 */
public class DoctorRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem ecoSystem,Network net) {
       return new DoctorWorkAreaJPanel (userProcessContainer, enterprise, account, (DoctorOrganization)organization,ecoSystem,net);
    }
    
}
