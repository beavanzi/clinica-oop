/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinic.dao.interfaces;

import clinic.external.Patient;
import clinic.resources.PatientRecord;
import java.util.ArrayList;

/**
 *
 * @author sarahanduca
 */
public interface InterfacePatientRecordDAO {
    
   
    public void createPatientRecord(String symptoms, String diagnosis, String treatment, Patient patient);
    public void updatePatientRecord(String symptoms, String diagnosis, String treatment, Integer patientId);
    public void deletePatientRecord(Integer patientId) ;
//    public ArrayList<PatientRecord> getAllPatientRecord();
//    public PatientRecord getPatientRecord(String patientName);
}
