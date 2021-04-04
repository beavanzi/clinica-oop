/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinic.dao;

import clinic.dao.interfaces.InterfacePatientDAO;
import clinic.external.Patient;
import java.util.ArrayList;

/**
 *
 * @author biaav
 */
public class PatientDAO implements InterfacePatientDAO{
    private static ArrayList<Patient> patients;

    public PatientDAO() {
        this.patients = new ArrayList();
    }

    @Override
    public void createPatient(String name, String docNumber, String birthDate, String address, String phone, String email, String healthInsurance) {
        Patient patient = new Patient(name, docNumber, birthDate, address, phone, email, healthInsurance);
        patients.add(patient);
    }

    @Override
    public void updatePatient(Patient patient, String name, String docNumber, String birthDate, String address, String phone, String email, String healthInsurance) {
        if (patients.contains(patient)) {
            patient.setAddress(address);
            patient.setBirthDate(birthDate);
            patient.setDocNumber(docNumber);
            patient.setEmail(email);
            patient.setHealthInsurance(healthInsurance);
            patient.setName(name);
            patient.setPhone(phone);   
        }
    }
    
    @Override    
    public void deletePatient(Patient patient){
        if (patients.contains(patient)){
            patients.remove(patient);  
        }
    }

    @Override
    public ArrayList<Patient> getAllPatients() {
        return this.patients;
    }
    
    
   public Patient getPatientByName(String searchParam){
      for (int i = 0; i <= patients.size(); i++) {
        Patient pat = patients.get(i);
        
        if (searchParam.equals(pat.getName())) 
            return pat;
       }
      
      return null;
    }
    
}