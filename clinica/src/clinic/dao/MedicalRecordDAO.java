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
import java.util.ArrayList;

/**
 *
 * @author biaav
 */
public class MedicalRecordDAO implements InterfaceMedicalRecordDAO {
     private static ArrayList<MedicalRecord> medicalRecord;

    public MedicalRecordDAO() {
        this.medicalRecord = new ArrayList();
    } 
    @Override
    public MedicalRecord createMedicalRecord(String prescription, String attestation, String followUp, Doctor doctor, Patient patient){
        MedicalRecord medRec = new MedicalRecord(prescription, attestation, followUp, doctor, patient);
        medicalRecord.add(medRec);
        return medRec;
    }
 

    @Override
    public String getPrescription(MedicalRecord medRec){
           if (medicalRecord.contains(medRec)){
              String pat =  medRec.getPatient().getName();
              String doc =  medRec.getDoctor().getName();
              String pres = medRec.getPrescription();
              String prescription = "Paciente: " + pat + ", " +" Doutor: " + doc + ", Prescrição: " + pres;
              return prescription;
        }
       
        
        return null;
    }
    @Override
    public String getAttestation(MedicalRecord medRec){
        if (medicalRecord.contains(medRec)){
              String pat =  medRec.getPatient().getName();
              String doc =  medRec.getDoctor().getName();
              String att = medRec.getAttestation();
              String attestation = "Paciente: " + pat + ", " +" Doutor: " + doc + ", Atestado: " + att;
              return attestation;
        }
       
        
        return null;
    }
    @Override
    public String getFollowUp(MedicalRecord medRec){
         if (medicalRecord.contains(medRec)){
              String pat =  medRec.getPatient().getName();
              String doc =  medRec.getDoctor().getName();
              String fUp = medRec.getAttestation();
              String followUp = "Paciente: " + pat + ", " +" Doutor: " + doc + ", Atestado: " + fUp;
              return followUp;
        }
       
        
        return null;
    }
    
    @Override
    public ArrayList<MedicalRecord> getAllMedicalRecord() {
        return this.medicalRecord;
    }

    @Override
    public MedicalRecord getMedicalRecord(String patientName) {
       for (int i = 0; i <= medicalRecord.size(); i++) {
        MedicalRecord medRec = medicalRecord.get(i);
        
        if (patientName.equals(medRec.getPatient())){
            return medRec;
        }
      
      
      }
       
      return null;
    
    }
            
}
