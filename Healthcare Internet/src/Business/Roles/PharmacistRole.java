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
import Business.Organization.PharamacyOrganization;
import Business.UserAccount.UserAccount;
import UserInterface.PharmacyRole.PharmacyManagerWorkArea;
import javax.swing.JPanel;

/**
 *
 * @author AustinGnanaraj
 */
public class PharmacistRole extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem ecoSystem, Network net) {
        return new PharmacyManagerWorkArea(userProcessContainer, (PharamacyOrganization) organization, enterprise, account, ecoSystem);
    }

}
