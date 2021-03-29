/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinic.resources;

import clinic.assets.Visit;
import clinic.employees.Doctor;
import clinic.external.Patient;

/**
 *
 * @author biaav
 */
public class Appointment {
    private String day;
    private String hour;
    private Doctor doctor;
    private Patient patient;
    private Visit visit;

    public Appointment() {
    }

    public Appointment(String day, String hour, Doctor doctor, Patient patient, Visit visit) {
        this.day = day;
        this.hour = hour;
        this.doctor = doctor;
        this.patient = patient;
        this.visit = visit;
    }
    
    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getHour() {
        return hour;
    }

    public void setHour(String hour) {
        this.hour = hour;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public Visit getVisit() {
        return visit;
    }

    public void setVisit(Visit visit) {
        this.visit = visit;
    }
    
    
   
}
