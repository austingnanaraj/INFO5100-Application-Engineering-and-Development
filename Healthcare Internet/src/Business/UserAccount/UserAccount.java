/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.UserAccount;

import Business.Person.Person;
import Business.Roles.Role;
import Business.WorkQueue.WorkQueue;

/**
 *
 * @author AustinGnanaraj
 */
public class UserAccount {

    private String username;
    private String password;
    private Person person;
    private WorkQueue workQueue;
    private Role role;
    private String ssn;
    private WorkQueue messageDirectory;

    public UserAccount() {
        workQueue = new WorkQueue();
        messageDirectory = new WorkQueue();

    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return username;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public WorkQueue getMessageDirectory() {
        return messageDirectory;
    }

    public void setMessageDirectory(WorkQueue messageDirectory) {
        this.messageDirectory = messageDirectory;
    }

}
