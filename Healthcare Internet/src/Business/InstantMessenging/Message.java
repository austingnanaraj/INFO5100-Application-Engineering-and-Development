/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.InstantMessenging;

import Business.WorkQueue.WorkRequest;

/**
 *
 * @author AustinGnanaraj
 */
public class Message extends WorkRequest {

    String message;
    

    @Override
    public String toString() {
        return super.getMessage();
    }

}
