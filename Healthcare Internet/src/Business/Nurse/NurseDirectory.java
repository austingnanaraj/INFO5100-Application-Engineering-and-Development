/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Nurse;

import java.util.ArrayList;

/**
 *
 * @author AustinGnanaraj
 */
public class NurseDirectory {

    private ArrayList<Nurse> nurseDirectory;

    public NurseDirectory() {
        nurseDirectory = new ArrayList<>();
    }

    public ArrayList<Nurse> getNurseDirectory() {
        return nurseDirectory;
    }

    public void setNurseDirectory(ArrayList<Nurse> nurseDirectory) {
        this.nurseDirectory = nurseDirectory;
    }

    public void removeNurse(Nurse n) {
        nurseDirectory.remove(n);
    }

    public Nurse createNurse() {
        Nurse nurse = new Nurse();
        nurseDirectory.add(nurse);
        return nurse;
    }
}
