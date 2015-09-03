/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Organization;

import Business.Roles.DoctorRole;
import Business.Roles.Role;
import java.util.ArrayList;

/**
 *
 * @author AustinGnanaraj
 */
public class DoctorOrganization extends Organization {

    public DoctorOrganization() {
     super(Organization.Type.DoctorOrganization.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> r = new ArrayList<>();              
       r.add(new DoctorRole());
        return r;
        
    }
    
}
