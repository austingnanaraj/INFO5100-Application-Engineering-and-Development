/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Drug.Drug;
import Business.Enterprise.DrugEnterprise;
import Business.Enterprise.PharmacyEnterprise;
import Business.Network.Network;

/**
 *
 * @author AustinGnanaraj
 */
public class PharmacyRequestToManufacturerer extends WorkRequest {

    Drug drug;
    int quantityOfDrugs;
    PharmacyEnterprise PharmacyEnterprise;
    Network network;
    DrugEnterprise drugEnterprise;

    public Drug getDrug() {
        return drug;
    }

    public void setDrug(Drug drug) {
        this.drug = drug;
    }

    public int getQuantityOfDrugs() {
        return quantityOfDrugs;
    }

    public void setQuantityOfDrugs(int quantityOfDrugs) {
        this.quantityOfDrugs = quantityOfDrugs;
    }

    public PharmacyEnterprise getPharmacyEnterprise() {
        return PharmacyEnterprise;
    }

    public void setPharmacyEnterprise(PharmacyEnterprise PharmacyEnterprise) {
        this.PharmacyEnterprise = PharmacyEnterprise;
    }

    public Network getNetwork() {
        return network;
    }

    public void setNetwork(Network network) {
        this.network = network;
    }

    @Override
    public String toString() {
        return drug.getDrugName();
    }

    public DrugEnterprise getDrugEnterprise() {
        return drugEnterprise;
    }

    public void setDrugEnterprise(DrugEnterprise drugEnterprise) {
        this.drugEnterprise = drugEnterprise;
    }

}
