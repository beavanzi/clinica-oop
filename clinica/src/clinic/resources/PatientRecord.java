/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinic.resources;
import clinic.external.Patient;
/**
 *
 * @author sarahanduca
 */
public class PatientRecord {
    private String symtoms;
    private String diadnosis;
    private String treatment;
    private Patient patient;

    public PatientRecord(String symtoms, String diadnosis, String treatment, Patient patient) {
        this.symtoms = symtoms;
        this.diadnosis = diadnosis;
        this.treatment = treatment;
        this.patient = patient;
    }

    public String getSymtoms() {
        return symtoms;
    }

    public String getDiadnosis() {
        return diadnosis;
    }

    public String getTreatment() {
        return treatment;
    }

    public String getPatient() {
        return patient.getName();
    }

    public void setSymtoms(String symtoms) {
        this.symtoms = symtoms;
    }

    public void setDiadnosis(String diadnosis) {
        this.diadnosis = diadnosis;
    }

    public void setTreatment(String treatment) {
        this.treatment = treatment;
    }
    
    
}
