/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Organization;

import Business.Person.PersonDirectory;
import Business.Roles.Role;
import Business.UserAccount.UserAccountDirectory;
import Business.WorkQueue.WorkQueue;
import java.util.ArrayList;

/**
 *
 * @author AustinGnanaraj
 */
public abstract class Organization {
    private String organizationName;
   private UserAccountDirectory userAccountDirectory;
   private WorkQueue workqueue;
   private int organizationID;
   private static int counter;
   private PersonDirectory personDirectory;
      
   public enum Type{
       
        HospitalAdmin("Hospital Admin Organization"), 
        HospitalMangaement("Hospital Management Organization"), 
        Nurse("Nurse Organization"),
        DrugManufacturer("Drug manufacturer"),
        DoctorOrganization("Doctor Organization"),
        patientManagerAdmin("Patient Organization Admin"),
        ClinicManagement("Clinic Management"),
        patient("Patient Organization"),
        pharmacy("Pharmacy organization");
        
        private String value;
        private Type(String value) {
            this.value = value;
        }
        public String getValue() {
            return value;
        }
    }
   
   public Organization (String name){
       this.organizationName = name;
       userAccountDirectory = new UserAccountDirectory();
        workqueue = new WorkQueue();
       organizationID = counter;
       personDirectory = new PersonDirectory();
       ++counter;
       
   }

   
    public String getOrganizationName() {
        return organizationName;
    }

    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
    }

    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public void setUserAccountDirectory(UserAccountDirectory userAccountDirectory) {
        this.userAccountDirectory = userAccountDirectory;
    }

    
  
    public WorkQueue getWorkqueue() {
        return workqueue;
    }

    public void setWorkqueue(WorkQueue workqueue) {
        this.workqueue = workqueue;
    }

    public int getOrganizationID() {
        return organizationID;
    }

    public void setOrganizationID(int organizationID) {
        this.organizationID = organizationID;
    }

    public PersonDirectory getPersonDirectory() {
        return personDirectory;
    }

    public void setPersonDirectory(PersonDirectory personDirectory) {
        this.personDirectory = personDirectory;
    }
    
    

    @Override
    public String toString() {
        return organizationName;
    }
   
    public abstract ArrayList<Role> getSupportedRole();
    
      
    
   
}
