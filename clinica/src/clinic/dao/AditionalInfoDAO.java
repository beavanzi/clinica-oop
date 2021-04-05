/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinic.dao;
import java.util.ArrayList;
import clinic.resources.AditionalInfo;
import clinic.dao.interfaces.InterfaceAditionalInfoDAO;
import clinic.external.Patient;

/**
 *
 * @author sarahanduca
 */
public class AditionalInfoDAO implements InterfaceAditionalInfoDAO{
    private static ArrayList<AditionalInfo> aditionalInfos;
    
    public AditionalInfoDAO(){
        this.aditionalInfos = new ArrayList();
    }
    
    @Override
    public AditionalInfo createAditionalInfo(String badHabit, String allergy, String surgery, Patient patient){
        AditionalInfo adInfo = new AditionalInfo(badHabit, allergy, surgery, patient);
        aditionalInfos.add(adInfo);
        
        return adInfo;
    }
    
   
    @Override
    public void updateAditionalInfo(AditionalInfo adInfo, String badHabit, String allergy, String surgery) {
        if (aditionalInfos.contains(adInfo)){
            adInfo.setBadHabit(badHabit);
            adInfo.setAllergy(allergy);
            adInfo.setSurgery(surgery);
        }
    }

    @Override
    public void deleteAditionalInfo(AditionalInfo adInfo) {
        if (aditionalInfos.contains(adInfo)){
            aditionalInfos.remove(adInfo); 
        }
    }

    @Override
    public ArrayList<AditionalInfo> getAllAditionalInfo() {
        return this.aditionalInfos;
    }

    @Override
    public AditionalInfo getAdidionalInfoByPatient(String patientName) {
       for (int i = 0; i <= aditionalInfos.size(); i++) {
        AditionalInfo adInfo = aditionalInfos.get(i);
        
        if (patientName.equals(adInfo.getPatient())){
            return adInfo;
        }
      
      
      }
       
      return null;
    
    }

}