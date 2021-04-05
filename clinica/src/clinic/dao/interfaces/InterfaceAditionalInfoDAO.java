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
    AditionalInfo createAditionalInfo(String badHabit, String allergy, String surgery, Patient patient);
    void updateAditionalInfo(AditionalInfo adInfo, String badHabit, String allergy, String surgery);
    void deleteAditionalInfo(AditionalInfo adInfo);
    ArrayList<AditionalInfo> getAllAditionalInfo();
    AditionalInfo getAdidionalInfoByPatient(String patientName);
    
}
