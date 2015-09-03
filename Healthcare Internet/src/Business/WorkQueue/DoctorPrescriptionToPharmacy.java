/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Doctor.Doctor;
import Business.Drug.Drug;
import Business.Enterprise.HospitalEnterprise;
import Business.Network.Network;
import Business.Organization.DoctorOrganization;
import Business.Patient.Patient;

/**
 *
 * @author AustinGnanaraj
 */
public class DoctorPrescriptionToPharmacy extends WorkRequest {

    Patient patient;
    Drug drug;
    int quantityOfDrugs;
    HospitalEnterprise hospitalEnterprise;
    Network network;
    DoctorOrganization doctororganization;
    Doctor doctor;

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

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

    public HospitalEnterprise getHospitalEnterprise() {
        return hospitalEnterprise;
    }

    public void setHospitalEnterprise(HospitalEnterprise hospitalEnterprise) {
        this.hospitalEnterprise = hospitalEnterprise;
    }

    public Network getNetwork() {
        return network;
    }

    public void setNetwork(Network network) {
        this.network = network;
    }

    public DoctorOrganization getDoctororganization() {
        return doctororganization;
    }

    public void setDoctororganization(DoctorOrganization doctororganization) {
        this.doctororganization = doctororganization;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    @Override
    public String toString() {
        return drug.getDrugName();
    }

}
