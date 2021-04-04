/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinic.dao.interfaces;
import clinic.resources.MedicalRecord;
import clinic.employees.Doctor;
import clinic.external.Patient;
/**
 *
 * @author sarahanduca
 */
public interface InterfaceMedicalRecordDAO {
    MedicalRecord createMedicalRecord(String prescription, String attestation, String followUp, Doctor doctor, Patient patient);
    String getPrescription(MedicalRecord medRec);
    String getAttestation(MedicalRecord medRec);
    String getFollowUp(MedicalRecord medRec);
    
   // char getAttendance(MedicalRecord medRec);
    
    //void deleteMedicalRecord(MedicalRecord medRec);
}
