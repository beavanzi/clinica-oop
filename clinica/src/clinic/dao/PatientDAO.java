/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinic.dao;

import clinic.dao.interfaces.InterfacePatientDAO;
import clinic.external.Patient;

/**
 *
 * @author biaav
 */
public class PatientDAO implements InterfacePatientDAO{

    @Override
    public Patient createPatient(String name, String docNumber, String birthDate, String address, String phone, String email, String healthInsurance) {
        Patient patient = new Patient(name, docNumber, birthDate, address, phone, email, healthInsurance);
        return patient;
    }

    @Override
    public void updatePatient(Patient patient, String name, String docNumber, String birthDate, String address, String phone, String email, String healthInsurance) {
        patient.setAddress(address);
        patient.setBirthDate(birthDate);
        patient.setDocNumber(docNumber);
        patient.setEmail(email);
        patient.setHealthInsurance(healthInsurance);
        patient.setName(name);
        patient.setPhone(phone);
    }
    
    @Override    
    public void deletePatient(Patient patient){
        patient.setAddress(null);
        patient.setBirthDate(null);
        patient.setDocNumber(null);
        patient.setEmail(null);
        patient.setHealthInsurance(null);
        patient.setName(null);
        patient.setPhone(null);
    }
}
