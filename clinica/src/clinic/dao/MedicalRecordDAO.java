/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinic.dao;
import clinic.resources.MedicalRecord;
import clinic.dao.interfaces.InterfaceMedicalRecordDAO;
import clinic.employees.Doctor;
import clinic.external.Patient;

/**
 *
 * @author biaav
 */
public class MedicalRecordDAO implements InterfaceMedicalRecordDAO {
    
    @Override
    public MedicalRecord createMedicalRecord(String prescription, String attestation, String followUp, Doctor doctor, Patient patient){
        MedicalRecord medRec = new MedicalRecord(prescription, attestation, followUp, doctor, patient);
        return medRec;
    }

    @Override
    public String getPrescription(MedicalRecord medRec){
        String pat = medRec.getPatient().getName();
        String doc = medRec.getDoctor().getName();
        String pres = medRec.getPrescription();
        String prescription = "Paciente: " + pat + ", " +" Doutor: " + doc + ", Prescrição: " + pres;
        
        return prescription;
    }
    @Override
    public String getAttestation(MedicalRecord medRec){
        String pat = medRec.getPatient().getName();
        String doc = medRec.getDoctor().getName();
        String attest = medRec.getAttestation();
        String attestation = "Paciente: " + pat + ", " +" Doutor: " + doc + ", Atestado: " + attest;
        
        return attestation;
    }
    @Override
    public String getFollowUp(MedicalRecord medRec){
        String pat = medRec.getPatient().getName();
        String doc = medRec.getDoctor().getName();
        String fUp = medRec.getFollowUp();
        String followUp = "Paciente: " + pat + ", " +" Doutor: " + doc + ", Acompanhamento: " + fUp;
        
        return followUp;
    }
            
}
