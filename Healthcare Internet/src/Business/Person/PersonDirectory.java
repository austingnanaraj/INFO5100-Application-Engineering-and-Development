/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Person;

import java.util.ArrayList;

/**
 *
 * @author AustinGnanaraj
 */
public class PersonDirectory {
     private ArrayList<Person> personDirectory;

    public PersonDirectory() {
        personDirectory = new ArrayList<>();
    }

        
    public Person createPerson(String name){
        Person p = new Person();
        p.setName(name);
        personDirectory.add(p);
        return p;
    }

    public ArrayList<Person> getPersonDirectory() {
        return personDirectory;
    }
    
    
    public void removePerson (Person p){
        personDirectory.remove(p);
        
        
    }
}
