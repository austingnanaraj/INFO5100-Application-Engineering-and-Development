/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Encounter;

import Business.Doctor.Doctor;
import Business.Patient.Patient;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author AustinGnanaraj
 */
public class Encounter {

    private String patientName;
    private String doctorName;
    private String descriptionOfComplaint;
    private Date date;
    private String diagnosis;
    private Doctor doctor;
    private Patient patient;

    public Encounter() {

    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public String getDescriptionOfComplaint() {
        return descriptionOfComplaint;
    }

    public void setDescriptionOfComplaint(String descriptionOfComplaint) {
        this.descriptionOfComplaint = descriptionOfComplaint;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setDate() {
        Calendar c = Calendar.getInstance();
        this.date = c.getTime();
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    @Override
    public String toString() {
        return date.toString();
    }
}
