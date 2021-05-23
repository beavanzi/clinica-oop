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
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author sarahanduca
 */
public class AditionalInfoDAO implements InterfaceAditionalInfoDAO{
    private EntityManager em;
    
    public AditionalInfoDAO(EntityManager em){
        this.em = em;
    }
    
    @Override
    public void createAditionalInfo(String badHabit, String allergy, String surgery, Patient patient){
        AditionalInfo adInfo = new AditionalInfo(badHabit, allergy, surgery, patient);
        
        em.getTransaction().begin();
        em.persist(adInfo);
        em.getTransaction().commit(); 

    }
    
    @Override
    public void updateAditionalInfo(Integer patientId, String badHabit, String allergy, String surgery) {
        em.getTransaction().begin();
       
        try {
          Query query = em.createQuery("SELECT adInfo FROM AditionalInfo adInfo WHERE adInfo.patient.id = :patientId", AditionalInfo.class);
          query.setParameter("patientId", patientId);

          List<AditionalInfo> adInfos = query.getResultList();
          AditionalInfo adInfo = adInfos.get(0);
          
          
          adInfo.setBadHabit(badHabit);
          adInfo.setAllergy(allergy);
          adInfo.setSurgery(surgery);

        } catch (IndexOutOfBoundsException e) {
          throw new IndexOutOfBoundsException("Informação adicional não encontrada.");           
        } catch (Throwable e){
          throw e;
        } finally {
           em.getTransaction().commit(); 
        }
    }

    @Override
    public void deleteAditionalInfo(Integer patientId) {
        em.getTransaction().begin();
           
       try {
          Query query = em.createQuery("SELECT adInfo FROM AditionalInfo adInfo WHERE adInfo.patient.id = :patientId", AditionalInfo.class);
          query.setParameter("patientId", patientId);

          List<AditionalInfo> adInfos = query.getResultList();
          AditionalInfo adInfo = adInfos.get(0);
          
          em.remove(adInfo);
       } catch (IndexOutOfBoundsException e) {
           throw new IndexOutOfBoundsException("Informação adicional não encontrada.");           
       } catch (Throwable e){
           throw e;
       } finally {
        em.getTransaction().commit();
       }
    }

    @Override
    public AditionalInfo getAditionalInfoByPatient(Integer patientId) {
        em.getTransaction().begin();
       
        try {
          Query query = em.createQuery("SELECT adInfo FROM AditionalInfo adInfo WHERE adInfo.patient.id = :patientId", AditionalInfo.class);
          query.setParameter("patientId", patientId);

          List<AditionalInfo> adInfos = query.getResultList();
          AditionalInfo adInfo = adInfos.get(0);
          
          return adInfo;
        } catch (IndexOutOfBoundsException e) {
          throw new IndexOutOfBoundsException("Informação adicional não encontrada.");           
        } catch (Throwable e){
          throw e;
        } finally {
           em.getTransaction().commit(); 
        }
    
    }

}