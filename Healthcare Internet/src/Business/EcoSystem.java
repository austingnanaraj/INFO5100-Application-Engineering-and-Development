/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Doctor.Doctor;
import Business.Drug.Drug;
import Business.Enterprise.DrugEnterprise;
import Business.Enterprise.Enterprise;
import Business.Enterprise.HospitalEnterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Patient.Patient;
import Business.Person.Person;
import Business.Roles.HospitalAdminRole;
import Business.Roles.Role;
import Business.Roles.SystemAdminRole;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.WorkQueue;
import java.util.ArrayList;

/**
 *
 * @author AustinGnanaraj
 */
public class EcoSystem extends Organization {

    private static EcoSystem ecoSystem;
    private ArrayList<Network> networkList;
    private WorkQueue messageDirectory;
    private WorkQueue emergencyRequestDirectory;
    private WorkQueue adverseReportDirectory;
    private WorkQueue drugPrescriptionDirectory;
    private WorkQueue drugRequestToManufacturer;

    public static EcoSystem getInstance() {
        if (ecoSystem == null) {
            ecoSystem = new EcoSystem();
        }
        Network network = ecoSystem.createAndAddNetwork();
        network.setName("a");
//        Network network1 = ecoSystem.createAndAddNetwork();
//        network1.setName("b");

        Enterprise.EnterpriseType type = Enterprise.EnterpriseType.Hospital;
        Enterprise.EnterpriseType type1 = Enterprise.EnterpriseType.Drug;

        Enterprise enterprise = network.getEnterpriseDirectory().createAndAddEnterprise("BB", type);
        Enterprise enterprise2 = network.getEnterpriseDirectory().createAndAddEnterprise("BBB", type1);
       // Enterprise enterprise1 = network.getEnterpriseDirectory().createAndAddEnterprise("CC", type);
        Person person = enterprise.getPersonDirectory().createPerson("hh");
       // Person person1 = enterprise1.getPersonDirectory().createPerson("hhh");
        Person person2 = enterprise2.getPersonDirectory().createPerson("hhh");
        UserAccount account = enterprise.getUserAccountDirectory().createUserAccount("hh", "hh", person, new HospitalAdminRole());
        //UserAccount account1 = enterprise1.getUserAccountDirectory().createUserAccount("hhh", "hhh", person1, new HospitalAdminRole());
        Organization h = enterprise.getOrganizationDirectory().createOrganization(Type.HospitalMangaement);
        Organization d = enterprise.getOrganizationDirectory().createOrganization(Type.DoctorOrganization);
        Organization p = enterprise.getOrganizationDirectory().createOrganization(Type.patientManagerAdmin);
       // Organization h1 = enterprise1.getOrganizationDirectory().createOrganization(Type.HospitalMangaement);
       // Organization d1 = enterprise1.getOrganizationDirectory().createOrganization(Type.DoctorOrganization);
       // Organization p1 = enterprise1.getOrganizationDirectory().createOrganization(Type.patientManagerAdmin);
        Organization drug1 = enterprise2.getOrganizationDirectory().createOrganization(Type.DrugManufacturer);
        h.getUserAccountDirectory().createUserAccount("hm", "hm", h.getPersonDirectory().createPerson("hm"), h.getSupportedRole().get(0));
        p.getUserAccountDirectory().createUserAccount("pp", "pp", p.getPersonDirectory().createPerson("pp"), p.getSupportedRole().get(0));
      //  h1.getUserAccountDirectory().createUserAccount("hm1", "hm1", h1.getPersonDirectory().createPerson("hm1"), h1.getSupportedRole().get(0));
       // p1.getUserAccountDirectory().createUserAccount("pp1", "pp1", p1.getPersonDirectory().createPerson("pp1"), p1.getSupportedRole().get(0));
        drug1.getUserAccountDirectory().createUserAccount("drug1", "drug1", drug1.getPersonDirectory().createPerson("drug1"), drug1.getSupportedRole().get(0));
        Doctor de = ((HospitalEnterprise) enterprise).getDoctorDirectory().createDoctor();
        Drug dr = ((DrugEnterprise) enterprise2).getDrugDirectory().addDrug();
        dr.setDrugComposition("comp");
        dr.setDrugName("Crocin");
        dr.setManufacturingCompany(enterprise2.getName());
        de.setName("dd");
        de.setSsn("11");
        de.setPhoneNumber(1111);
        de.setAddress("as");
        de.setDepartment("as");
        d.getUserAccountDirectory().createUserAccount("dd", "dd", de, d.getSupportedRole().get(0));
        Patient pa = ((HospitalEnterprise) enterprise).getPatientDirectory().createpatient();
        pa.setName("JJ");
        pa.setSsn("111");
        pa.setPhoneNumber(111);
        pa.setAddress("111");

      //  Doctor de1 = ((HospitalEnterprise) enterprise1).getDoctorDirectory().createDoctor();

//        de1.setName("dd1");
//        de1.setSsn("11111");
//        de1.setPhoneNumber(1111);
//        de1.setAddress("as");
//        de1.setDepartment("as");
//        d1.getUserAccountDirectory().createUserAccount("dd1", "dd1", de1, d1.getSupportedRole().get(0));
//        Patient pa1 = ((HospitalEnterprise) enterprise1).getPatientDirectory().createpatient();
//        pa1.setName("JZ");
//        pa1.setSsn("112");
//        pa1.setPhoneNumber(111);
//        pa1.setAddress("111");
        return ecoSystem;

    }

    private EcoSystem() {
        super(null);
        networkList = new ArrayList<>();
        messageDirectory = new WorkQueue();
        emergencyRequestDirectory = new WorkQueue();
        adverseReportDirectory = new WorkQueue();
        drugPrescriptionDirectory = new WorkQueue();
        drugRequestToManufacturer = new WorkQueue();
    }

    public ArrayList<Network> getNetworkList() {
        return networkList;
    }

    public Network createAndAddNetwork() {
        Network network = new Network();
        networkList.add(network);
        return network;
    }

    public boolean checkIfUsernameIsUnique(String username) {

        if (!this.getUserAccountDirectory().checkIfUsernameIsUnique(username)) {
            return false;
        }

        for (Network network : networkList) {
        }

        return true;
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList = new ArrayList<>();
        roleList.add(new SystemAdminRole());
        return roleList;
    }

    public WorkQueue getMessageDirectory() {
        return messageDirectory;
    }

    public void setMessageDirectory(WorkQueue messageDirectory) {
        this.messageDirectory = messageDirectory;
    }

    public WorkQueue getEmergencyRequestDirectory() {
        return emergencyRequestDirectory;
    }

    public void setEmergencyRequestDirectory(WorkQueue emergencyRequestDirectory) {
        this.emergencyRequestDirectory = emergencyRequestDirectory;
    }

    public WorkQueue getAdverseReportDirectory() {
        return adverseReportDirectory;
    }

    public void setAdverseReportDirectory(WorkQueue adverseReportDirectory) {
        this.adverseReportDirectory = adverseReportDirectory;
    }

    public static EcoSystem getEcoSystem() {
        return ecoSystem;
    }

    public static void setEcoSystem(EcoSystem ecoSystem) {
        EcoSystem.ecoSystem = ecoSystem;
    }

    public WorkQueue getDrugPrescriptionDirectory() {
        return drugPrescriptionDirectory;
    }

    public void setDrugPrescriptionDirectory(WorkQueue drugPrescriptionDirectory) {
        this.drugPrescriptionDirectory = drugPrescriptionDirectory;
    }

    public WorkQueue getDrugRequestToManufacturer() {
        return drugRequestToManufacturer;
    }

    public void setDrugRequestToManufacturer(WorkQueue drugRequestToManufacturer) {
        this.drugRequestToManufacturer = drugRequestToManufacturer;
    }

}
