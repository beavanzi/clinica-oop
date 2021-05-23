/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinic.resources;

import clinic.employees.Doctor;
import clinic.external.Patient;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Transient;

/**
 *
 * @author biaav
 */
@Entity
public class Appointment {
    @Id @GeneratedValue(strategy  = GenerationType.AUTO)
    private Integer id;
    private String dateDay;
    private String dateHour;
    @Transient
    private Doctor doctor;
    @OneToOne
    private Patient patient;
    private String visit;

    public Appointment() {
    }

    public Appointment(String day, String hour, Doctor doctor, Patient patient, String visit) {
        this.dateDay = day;
        this.dateHour = hour;
        this.doctor = doctor;
        this.patient = patient;
        this.visit = visit;
    }
    
    public String getDay() {
        return dateDay;
    }

    public void setDay(String day) {
        this.dateDay = day;
    }

    public String getHour() {
        return dateHour;
    }

    public void setHour(String hour) {
        this.dateHour = hour;
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

    public String getVisit() {
        return visit;
    }

    public void setVisit(String visit) {
        this.visit = visit;
    }
    
    
   
}
