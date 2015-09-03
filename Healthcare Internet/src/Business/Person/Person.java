/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Person;

import Business.Doctor.Doctor;
import Business.Nurse.Nurse;
import java.util.Date;

/**
 *
 * @author AustinGnanaraj
 */
public class Person {

    private String name;
    private int id;
    private String ssn;
    private long phoneNumber;
    private Date dob;
    private String address;
    private Doctor doctor;
    private Nurse nurse;
    private static int count = 1;

    public int getId() {
        return id;
    }

    public Nurse getNurse() {
        return nurse;
    }

    public Nurse getNewNurse() {
        nurse = new Nurse();
        return nurse;
    }

    public void setNurse(Nurse nurse) {
        this.nurse = nurse;
    }

    public String getName() {
        return name;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public Doctor getNewDoctor() {
        doctor = new Doctor();
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person() {
        id = count;
        count++;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    @Override
    public String toString() {
        return name;
    }

}
