/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Doctor;

import Business.Encounter.EncounterHistory;
import Business.Patient.PatientDirectory;
import Business.Person.Person;
import Business.WorkQueue.WorkQueue;

/**
 *
 * @author AustinGnanaraj
 */
public class Doctor extends Person {

    private String department;
    private String hospitalEmployed;
    private PatientDirectory patientEnquiryDirectory;
    private EncounterHistory enquiryDirectory;
    private WorkQueue adverseReportDirectory;
//    private PatientDirectory patientEnquiryDirectory;

    public Doctor() {
        enquiryDirectory = new EncounterHistory();
        adverseReportDirectory = new WorkQueue();
         patientEnquiryDirectory = new PatientDirectory();

    }

    public EncounterHistory getEnquiryDirectory() {
        return enquiryDirectory;
    }

    public void setEnquiryDirectory(EncounterHistory enquiryDirectory) {
        this.enquiryDirectory = enquiryDirectory;
    }

    public String getHospitalEmployed() {
        return hospitalEmployed;
    }

    public void setHospitalEmployed(String hospitalEmployed) {
        this.hospitalEmployed = hospitalEmployed;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public WorkQueue getAdverseReportDirectory() {
        return adverseReportDirectory;
    }

    public void setAdverseReportDirectory(WorkQueue adverseReportDirectory) {
        this.adverseReportDirectory = adverseReportDirectory;
    }

    public PatientDirectory getPatientEnquiryDirectory() {
        return patientEnquiryDirectory;
    }

    public void setPatientEnquiryDirectory(PatientDirectory patientEnquiryDirectory) {
        this.patientEnquiryDirectory = patientEnquiryDirectory;
    }
}
