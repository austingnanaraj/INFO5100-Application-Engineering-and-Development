/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.VitalSign;

import java.util.Date;

/**
 *
 * @author AustinGnanaraj
 */
public class VitalSign {

    private float respiratoryRate;
    private float heartRate;
    private float systolicBloodPressure;
    private float weight;
    String testDate;

    public float getRespiratoryRate() {
        return respiratoryRate;
    }

    public void setRespiratoryRate(float respiratoryRate) {
        this.respiratoryRate = respiratoryRate;
    }

    public float getHeartRate() {
        return heartRate;
    }

    public void setHeartRate(float heartRate) {
        this.heartRate = heartRate;
    }

    public float getSystolicBloodPressure() {
        return systolicBloodPressure;
    }

    public void setSystolicBloodPressure(float systolicBloodPressure) {
        this.systolicBloodPressure = systolicBloodPressure;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public String getTestDate() {
        return testDate;
    }

    public void setTestDate(String testDate) {
        this.testDate = testDate;
    }

    @Override
    public String toString() {
        return testDate;
    }

}
