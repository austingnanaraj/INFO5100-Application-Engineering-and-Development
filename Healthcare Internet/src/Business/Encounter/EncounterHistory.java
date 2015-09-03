/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Encounter;

import java.util.ArrayList;

/**
 *
 * @author AustinGnanaraj
 */
public class EncounterHistory {

    private ArrayList<Encounter> encounterHistory;

    public EncounterHistory() {
        encounterHistory = new ArrayList<>();

    }

    public ArrayList<Encounter> getEncounterHistory() {
        return encounterHistory;
    }

    public void setEncounterHistory(ArrayList<Encounter> encounterHistory) {
        this.encounterHistory = encounterHistory;
    }

    public Encounter addEncounter() {
        Encounter en = new Encounter();
        encounterHistory.add(en);
        return en;
    }

    public Encounter addToEncounterHistory(Encounter e) {
        e = new Encounter();
        encounterHistory.add(e);
        return e;
    }

    public void deleteEncounter(Encounter en) {
        this.encounterHistory.remove(en);
    }

}
