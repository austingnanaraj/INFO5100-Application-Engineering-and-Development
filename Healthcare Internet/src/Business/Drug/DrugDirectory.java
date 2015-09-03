/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Drug;

import java.util.ArrayList;

/**
 *
 * @author AustinGnanaraj
 */
public class DrugDirectory {
    private ArrayList<Drug> drugDirectory;
    
    public DrugDirectory(){
        drugDirectory = new ArrayList<>();
        
    }

    public ArrayList<Drug> getDrugDirectory() {
        return drugDirectory;
    }

    public void setDrugDirectory(ArrayList<Drug> drugDirectory) {
        this.drugDirectory = drugDirectory;
    }
    
   public Drug addDrug(){
       Drug d = new Drug();
       drugDirectory.add(d);
       return d;
       
   } 
   
   
   public void deleteDrug(Drug d){
       drugDirectory.remove(d);
   }
}
