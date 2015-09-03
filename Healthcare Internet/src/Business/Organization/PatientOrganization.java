/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Organization;

import Business.Roles.PatientRole;
import Business.Roles.Role;
import java.util.ArrayList;

/**
 *
 * @author AustinGnanaraj
 */
public class PatientOrganization extends Organization{

     public PatientOrganization() {
        super(Organization.Type.patient.getValue());
    }

    @Override
   public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new PatientRole());
        return roles;
        
   }
    
}
