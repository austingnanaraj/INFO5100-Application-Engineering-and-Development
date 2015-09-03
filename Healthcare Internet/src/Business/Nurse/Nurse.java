/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Nurse;

import Business.Person.Person;

/**
 *
 * @author AustinGnanaraj
 */
public class Nurse extends Person{
    private String department;
    private String hospitalEmployed;
    //private EncounterHistory enquiryDirectory;

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getHospitalEmployed() {
        return hospitalEmployed;
    }

    public void setHospitalEmployed(String hospitalEmployed) {
        this.hospitalEmployed = hospitalEmployed;
    }
    
    
}
