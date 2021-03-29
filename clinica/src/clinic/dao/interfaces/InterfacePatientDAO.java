/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinic.dao.interfaces;

import clinic.external.Patient;

/**
 *
 * @author biaav
 */
public interface InterfacePatientDAO {
    Patient createPatient(String name, String docNumber, String birthDate, String address, String phone, String email, String healthInsurance);
    void updatePatient(Patient patient, String name, String docNumber, String birthDate, String address, String phone, String email, String healthInsurance);
    void deletePatient(Patient patient);
}
