/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.PatientsLikeMe;

import Business.WorkQueue.WorkRequest;

/**
 *
 * @author AustinGnanaraj
 */
public class Review extends WorkRequest {

    @Override
    public String toString() {
        return super.getMessage();
    }

}
