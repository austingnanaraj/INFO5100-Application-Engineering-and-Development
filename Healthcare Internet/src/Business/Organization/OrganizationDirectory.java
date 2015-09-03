/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Organization.Organization.Type;
import java.util.ArrayList;

/**
 *
 * @author AustinGnanaraj
 */
public class OrganizationDirectory {

    private ArrayList<Organization> organizationDirectory;

    public OrganizationDirectory() {
        organizationDirectory = new ArrayList<>();
    }

    public ArrayList<Organization> getOrganizationDirectory() {
        return organizationDirectory;
    }

    public void setOrganizationDirectory(ArrayList<Organization> organizationDirectory) {
        this.organizationDirectory = organizationDirectory;
    }

    public Organization createOrganization(Type type) {
        Organization organization = null;
        if (type.getValue().equals(Organization.Type.Nurse.getValue())) {
            organization = new NurseOrganization();
            organizationDirectory.add(organization);
        }
        if (type.getValue().equals(Organization.Type.HospitalMangaement.getValue())) {
            organization = new HospitalOrganization();
            organizationDirectory.add(organization);
        } else if (type.getValue().equals(Organization.Type.DrugManufacturer.getValue())) {
            organization = new DrugManufacturerOrganization();
            organizationDirectory.add(organization);
        } else if (type.getValue().equals(Organization.Type.patient.getValue())) {
            organization = new PatientOrganization();
            organizationDirectory.add(organization);
        } else if (type.getValue().equals(Organization.Type.DoctorOrganization.getValue())) {
            organization = new DoctorOrganization();
            organizationDirectory.add(organization);
        } else if (type.getValue().equals(Organization.Type.pharmacy.getValue())) {
            organization = new PharamacyOrganization();
            organizationDirectory.add(organization);
        } else if (type.getValue().equals(Organization.Type.patientManagerAdmin.getValue())) {
            organization = new PatientAdminOrganization();
            organizationDirectory.add(organization);
        } else if (type.getValue().equals(Organization.Type.ClinicManagement.getValue())) {
            organization = new ClinicOrganization();
            organizationDirectory.add(organization);
        }
        return organization;
    }
}
