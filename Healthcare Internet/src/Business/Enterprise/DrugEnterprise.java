/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Drug.DrugDirectory;
import Business.Roles.DrugManufacturerAdminRole;
import Business.Roles.Role;
import java.util.ArrayList;

/**
 *
 * @author AustinGnanaraj
 */
public class DrugEnterprise extends Enterprise {

    private DrugDirectory drugDirectory;

    public DrugEnterprise(String name) {
        super(name, EnterpriseType.Drug);

        this.drugDirectory = new DrugDirectory();
    }

    public DrugDirectory getDrugDirectory() {
        return drugDirectory;
    }

    public void setDrugDirectory(DrugDirectory drugDirectory) {
        this.drugDirectory = drugDirectory;
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> r = new ArrayList<>();
        r.add(new DrugManufacturerAdminRole());
        return r;

    }

}
