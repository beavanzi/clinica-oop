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
 * @author sarahanduca
 */
@Entity
public class Attendance {
    @Id @GeneratedValue(strategy  = GenerationType.AUTO)
    private Integer id;
    private int dateDay;
    private int dateMonth;
    @OneToOne
    private Patient patient;
    @Transient
    private Doctor doctor;

    public Attendance(int day, int month, Patient patient, Doctor doctor) {
        this.dateDay = day;
        this.dateMonth = month;
        this.patient = patient;
        this.doctor = doctor;
    }

    public int getDay() {
        return dateDay;
    }

    public int getMonth() {
        return dateMonth;
    }

    public void setDay(int day) {
        this.dateDay = day;
    }

    public void setMonth(int month) {
        this.dateMonth = month;
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
