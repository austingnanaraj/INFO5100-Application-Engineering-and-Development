/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Drug;

import Business.WorkQueue.WorkQueue;

/**
 *
 * @author AustinGnanaraj
 */
public class Drug {

    private String drugName;
    private String manufacturingCompany;
    private String drugComposition;
    private WorkQueue drugReviewDirectory;

    public Drug() {
        drugReviewDirectory = new WorkQueue();
    }

    public String getDrugName() {
        return drugName;
    }

    public void setDrugName(String drugName) {
        this.drugName = drugName;
    }

    public String getManufacturingCompany() {
        return manufacturingCompany;
    }

    public void setManufacturingCompany(String manufacturingCompany) {
        this.manufacturingCompany = manufacturingCompany;
    }

    public String getDrugComposition() {
        return drugComposition;
    }

    public void setDrugComposition(String drugComposition) {
        this.drugComposition = drugComposition;
    }

    public WorkQueue getDrugReviewDirectory() {
        return drugReviewDirectory;
    }

    public void setDrugReviewDirectory(WorkQueue drugReviewDirectory) {
        this.drugReviewDirectory = drugReviewDirectory;
    }

    @Override
    public String toString() {
        return drugName;
    }

}
