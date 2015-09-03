/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Organization;

import Business.Roles.PharmacistRole;
import Business.Roles.Role;
import java.util.ArrayList;

/**
 *
 * @author AustinGnanaraj
 */
public class PharamacyOrganization extends Organization {

   
    public PharamacyOrganization() {
        super(Organization.Type.pharmacy.getValue());
    }

        @Override
       public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new PharmacistRole());
        return roles;
    }
    
    
}
