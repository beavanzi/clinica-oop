/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinic.resources;
import clinic.employees.Doctor;
import clinic.external.Patient;

/**
 *
 * @author sarahanduca
 */
public class Attendance {
    private int day;
    private int month;
    private Patient patient;
    private Doctor doctor;

    public Attendance(int day, int month, Patient patient, Doctor doctor) {
        this.day = day;
        this.month = month;
        this.patient = patient;
        this.doctor = doctor;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    
    public String getPatient() {
        
        return patient.getName();
    }

    public String getDoctor() {
        return doctor.getName();
    }
    
    
}
