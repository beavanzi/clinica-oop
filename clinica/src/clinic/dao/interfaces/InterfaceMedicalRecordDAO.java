/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinic.dao.interfaces;
import clinic.resources.MedicalRecord;
import clinic.employees.Doctor;
import clinic.external.Patient;
import java.util.ArrayList;
/**
 *
 * @author sarahanduca
 */
public interface InterfaceMedicalRecordDAO {
    void createMedicalRecord(String prescription, String attestation, String followUp, Doctor doctor, Patient patient);
    ArrayList<MedicalRecord> getAllMedicalRecord();
    MedicalRecord getMedicalRecord(String patientName);
}
