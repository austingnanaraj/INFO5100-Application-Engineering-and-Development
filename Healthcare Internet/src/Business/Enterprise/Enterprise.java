/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;

/**
 *
 * @author AustinGnanaraj
 */
public abstract class Enterprise extends Organization {

    private EnterpriseType enterpriseType;
    private OrganizationDirectory organizationDirectory;
    private String name;

    public Enterprise(String name, EnterpriseType type) {
        super(name);
        this.enterpriseType = type;
        this.name = name;
        this.organizationDirectory = new OrganizationDirectory();

    }

    public EnterpriseType getEnterpriseType() {
        return enterpriseType;
    }

    public void setEnterpriseType(EnterpriseType enterpriseType) {
        this.enterpriseType = enterpriseType;
    }

    public OrganizationDirectory getOrganizationDirectory() {
        return organizationDirectory;
    }

    public void setOrganizationDirectory(OrganizationDirectory organizationDirectory) {
        this.organizationDirectory = organizationDirectory;
    }

    public enum EnterpriseType {

        Hospital("Hospital Enterprise"),
        Drug("Drug Enterprise"),
        Clinic("Clinic Enterprise"),
        Pharmacy("Pharmacy Enterprise");

        private String value;

        //constructor for enum
        private EnterpriseType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {

            return value;
        }

        public static EnterpriseType getHospital() {
            return Hospital;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
