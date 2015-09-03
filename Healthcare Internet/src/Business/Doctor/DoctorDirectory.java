/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Doctor;

import java.util.ArrayList;

/**
 *
 * @author AustinGnanaraj
 */
public class DoctorDirectory {
    
    private ArrayList<Doctor> doctorDirectory;

    public DoctorDirectory() {
        doctorDirectory = new ArrayList<>();
    }

    public ArrayList<Doctor> getDoctorDirectory() {
        return doctorDirectory;
    }

    public void setDoctorDirectory(ArrayList<Doctor> doctorDirectory) {
        this.doctorDirectory = doctorDirectory;
    }
     

        
    public Doctor createDoctor(){
        Doctor d = new Doctor();
        //d.setName(name);
        doctorDirectory.add(d);
        return d;
    }

      
       
    public void removePerson (Doctor d){
        doctorDirectory.remove(d);
        
        
    }

    
}
