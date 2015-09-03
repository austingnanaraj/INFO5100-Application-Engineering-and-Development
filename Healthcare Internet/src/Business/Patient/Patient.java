/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Patient;

import Business.VitalSign.VitalSignHistory;
import Business.Encounter.EncounterHistory;
import Business.Person.Person;
import Business.WorkQueue.WorkQueue;

/**
 *
 * @author AustinGnanaraj
 */
public class Patient extends Person {

    private String primaryDoctorName;
    private String preferredPharmacy;
    private EncounterHistory encounterHistory;
    private VitalSignHistory vitalSignHistory;
    private WorkQueue drugPrescriptionDirectory;

    public Patient() {
        encounterHistory = new EncounterHistory();
        vitalSignHistory = new VitalSignHistory();
        drugPrescriptionDirectory = new WorkQueue();
    }

    public VitalSignHistory getVitalSignHistory() {
        return vitalSignHistory;
    }

    public WorkQueue getDrugPrescriptionDirectory() {
        return drugPrescriptionDirectory;
    }

    public void setDrugPrescriptionDirectory(WorkQueue drugPrescriptionDirectory) {
        this.drugPrescriptionDirectory = drugPrescriptionDirectory;
    }

    public void setVitalSignHistory(VitalSignHistory vitalSignHistory) {
        this.vitalSignHistory = vitalSignHistory;
    }

    public String getPrimaryDoctorName() {
        return primaryDoctorName;
    }

    public void setPrimaryDoctorName(String primaryDoctorName) {
        this.primaryDoctorName = primaryDoctorName;
    }

    public String getPreferredPharmacy() {
        return preferredPharmacy;
    }

    public void setPreferredPharmacy(String preferredPharmacy) {
        this.preferredPharmacy = preferredPharmacy;
    }

    public EncounterHistory getEncounterHistory() {
        return encounterHistory;
    }

    public void setEncounterHistory(EncounterHistory encounterHistory) {
        this.encounterHistory = encounterHistory;
    }

    @Override
    public String toString() {
        return super.getName();
    }

}
