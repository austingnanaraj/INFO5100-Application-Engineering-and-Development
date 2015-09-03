/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Patient;

import java.util.ArrayList;

/**
 *
 * @author AustinGnanaraj
 */
public class PatientDirectory {
    
    private ArrayList<Patient> patientDirectory;
    
    public PatientDirectory(){
        patientDirectory = new ArrayList<>();
    }

    public ArrayList<Patient> getPatientDirectory() {
        return patientDirectory;
    }

    public void setPatientDirectory(ArrayList<Patient> patientDirectory) {
        this.patientDirectory = patientDirectory;
    }
    
    public Patient createpatient(){
        Patient p = new Patient();
       patientDirectory.add(p);
       return p;
    }
    
    public void deletePatient(Patient p){
        patientDirectory.remove(p);
        
    }
}
