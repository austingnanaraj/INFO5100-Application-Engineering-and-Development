/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Person.Person;
import Business.Roles.SystemAdminRole;
import Business.UserAccount.UserAccount;

/**
 *
 * @author AustinGnanaraj
 */
public class ConfigureSystem {

    public static EcoSystem configure() {

        EcoSystem system = EcoSystem.getInstance();

        Person pers = system.getPersonDirectory().createPerson("Austin");
        system.getUserAccountDirectory().createUserAccount("sysadmin", "sysadmin", pers, new SystemAdminRole());

        return system;
    }

}
