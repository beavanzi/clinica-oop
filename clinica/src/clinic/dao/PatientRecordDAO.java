/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinic.dao;
import java.util.ArrayList;
import clinic.external.Patient;
import clinic.resources.PatientRecord;
import clinic.dao.interfaces.InterfacePatientRecordDAO;

/**
 *
 * @author sarahanduca
 */
public class PatientRecordDAO implements InterfacePatientRecordDAO{
    private static ArrayList<PatientRecord> patientRecords;
    
    public PatientRecordDAO(){
        this.patientRecords = new ArrayList();
    }
    
    @Override
    public PatientRecord createPatientRecord(String symptoms, String diagnosis, String treatment, Patient patient){
        PatientRecord patRec = new PatientRecord(symptoms, diagnosis, treatment, patient);
        patientRecords.add(patRec);
        
        return patRec;
    }
    
   
    @Override
    public void updatePatientRecord(PatientRecord patRec, String symptoms, String diagnosis, String treatment) {
        if (patientRecords.contains(patRec)){
            patRec.setSymtoms(symptoms);
            patRec.setDiadnosis(diagnosis);
            patRec.setTreatment(treatment);
        }
    }

    @Override
    public void deletePatientRecord(PatientRecord patRec) {
        if (patientRecords.contains(patRec)){
            patientRecords.remove(patRec); 
        }
    }

    @Override
    public ArrayList<PatientRecord> getAllPatientRecord() {
        return this.patientRecords;
    }

    @Override
    public PatientRecord getPatientRecord(String patientName) {
       for (int i = 0; i <= patientRecords.size(); i++) {
        PatientRecord patRec = patientRecords.get(i);
        
        if (patientName.equals(patRec.getPatient())){
            return patRec;
        }
      
      
      }
       
      return null;
    
    }

}