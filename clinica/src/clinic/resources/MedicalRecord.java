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
public class MedicalRecord {
    
    private String prescription;
    private String attestation;
    private String followUp;
    private Doctor doctor;
    private Patient patient;

    
    public MedicalRecord() {
    }

    public MedicalRecord(String prescription, String attestation, String followUp, Doctor doctor, Patient patient) {
        this.prescription = prescription;
        this.attestation = attestation;
        this.followUp = followUp;
        this.doctor = doctor;
        this.patient = patient;
    }
    public String getAttestation() {
        return attestation;
    }

    public String getFollowUp() {
        return followUp;
    }

    public String getPrescription() {
        return prescription;
    }
    
    public void setPrescription(String prescription) {
        this.prescription = prescription;
    }

    public void setAttestation(String attestation) {
        this.attestation = attestation;
    }

    public void setFollowUp(String followUp) {
        this.followUp = followUp;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

  
    
    
}