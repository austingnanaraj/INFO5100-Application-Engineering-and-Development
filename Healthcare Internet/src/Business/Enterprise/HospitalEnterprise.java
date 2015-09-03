/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Doctor.DoctorDirectory;
import Business.Nurse.NurseDirectory;
import Business.Patient.PatientDirectory;
import Business.Roles.HospitalAdminRole;
import Business.Roles.Role;
import java.util.ArrayList;

/**
 *
 * @author AustinGnanaraj
 */
public class HospitalEnterprise extends Enterprise {

    private PatientDirectory patientDirectory;
    private DoctorDirectory doctorDirectory;
    private NurseDirectory nurseDirectory;

    public HospitalEnterprise(String name) {
        super(name, EnterpriseType.Hospital);
        this.patientDirectory = new PatientDirectory();
        this.doctorDirectory = new DoctorDirectory();
        this.nurseDirectory = new NurseDirectory();
    }

    public PatientDirectory getPatientDirectory() {
        return patientDirectory;
    }

    public void setPatientDirectory(PatientDirectory patientDirectory) {
        this.patientDirectory = patientDirectory;
    }

    public DoctorDirectory getDoctorDirectory() {
        return doctorDirectory;
    }

    public void setDoctorDirectory(DoctorDirectory doctorDirectory) {
        this.doctorDirectory = doctorDirectory;
    }

    public NurseDirectory getNurseDirectory() {
        return nurseDirectory;
    }

    public void setNurseDirectory(NurseDirectory nurseDirectory) {
        this.nurseDirectory = nurseDirectory;
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> r = new ArrayList<>();
        r.add(new HospitalAdminRole());
        return r;

    }
    
}
