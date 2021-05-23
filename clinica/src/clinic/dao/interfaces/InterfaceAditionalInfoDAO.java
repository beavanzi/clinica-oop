/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinic.dao.interfaces;

import clinic.resources.AditionalInfo;
import clinic.external.Patient;
import java.util.ArrayList;

/**
 *
 * @author sarahanduca
 */
public interface InterfaceAditionalInfoDAO {
    void createAditionalInfo(String badHabit, String allergy, String surgery, Patient patient);
    void updateAditionalInfo(Integer patientId, String badHabit, String allergy, String surgery);
    void deleteAditionalInfo(Integer patientId);
   // ArrayList<AditionalInfo> getAllAditionalInfo();
    AditionalInfo getAditionalInfoByPatient(Integer patientId);
    
}
