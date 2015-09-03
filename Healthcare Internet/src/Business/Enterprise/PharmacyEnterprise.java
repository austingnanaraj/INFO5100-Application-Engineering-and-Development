/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Roles.PharmacistAdminRole;
import Business.Roles.Role;
import Business.Stock.StockDirectory;
import java.util.ArrayList;

/**
 *
 * @author AustinGnanaraj
 */
public class PharmacyEnterprise extends Enterprise {

    StockDirectory stockDirectory;

    public PharmacyEnterprise(String name) {
        super(name, EnterpriseType.Pharmacy);
        stockDirectory = new StockDirectory();
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> r = new ArrayList<>();
        r.add(new PharmacistAdminRole());
        return r;

    }

    public StockDirectory getStockDirectory() {
        return stockDirectory;
    }

    public void setStockDirectory(StockDirectory stockDirectory) {
        this.stockDirectory = stockDirectory;
    }

}
