/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Enterprise;

import Business.Roles.Role;
import java.util.ArrayList;

/**
 *
 * @author AustinGnanaraj
 */
public class ClinicEnterprise extends Enterprise {

    public ClinicEnterprise(String name) {
        super(name, EnterpriseType.Clinic);
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
      return null;
    }
    
    
}
