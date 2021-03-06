/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinic.dao.interfaces;

import clinic.external.Patient;
import java.util.ArrayList;

/**
 *
 * @author biaav
 */
public interface InterfacePatientDAO {
    void createPatient(String name, String docNumber, String birthDate, String address, String phone, String email, String healthInsurance);
    void updatePatient(String searchName, String name, String docNumber, String birthDate, String address, String phone, String email, String healthInsurance);
    void deletePatient(String name);
    Patient getPatientByName(String searchName);
    ArrayList<Patient> getAllPatientsWithoutComunications();
}
