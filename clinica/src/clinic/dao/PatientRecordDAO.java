/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinic.dao;
import java.util.ArrayList;
import clinic.external.Patient;
import clinic.resources.PatientRecord;
import clinic.dao.interfaces.InterfacePatientRecordDAO;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author sarahanduca
 */
public class PatientRecordDAO implements InterfacePatientRecordDAO{
    private EntityManager em;
    
    public PatientRecordDAO(EntityManager em){
        this.em = em;
    }
    
    @Override
    public void createPatientRecord(String symptoms, String diagnosis, String treatment, Patient patient){
        PatientRecord patRec = new PatientRecord(symptoms, diagnosis, treatment, patient);
        
        em.getTransaction().begin();
        em.persist(patRec);
        em.getTransaction().commit(); 
    }
    
   
    @Override
    public void updatePatientRecord(String symptoms, String diagnosis, String treatment, Integer patientId) {
        
        em.getTransaction().begin();
       
        try {
          Query query = em.createQuery("SELECT patRec FROM PatientRecord patRec WHERE patRec.patient.id = :patientId", PatientRecord.class);
          query.setParameter("patientId", patientId);

          List<PatientRecord> patRecs = query.getResultList();
          PatientRecord patRec = patRecs.get(0);
          
          patRec.setSymtoms(symptoms);
          patRec.setDiadnosis(diagnosis);
          patRec.setTreatment(treatment);


        } catch (IndexOutOfBoundsException e) {
          throw new IndexOutOfBoundsException("Informação adicional não encontrada.");           
        } catch (Throwable e){
          throw e;
        } finally {
           em.getTransaction().commit(); 
        }
    }

    @Override
    public void deletePatientRecord(Integer patientId) {
        em.getTransaction().begin();
       
        try {
          Query query = em.createQuery("SELECT patRec FROM PatientRecord patRec WHERE patRec.patient.id = :patientId", PatientRecord.class);
          query.setParameter("patientId", patientId);

          List<PatientRecord> patRecs = query.getResultList();
          PatientRecord patRec = patRecs.get(0);
          
          em.remove(patRec);
        } catch (IndexOutOfBoundsException e) {
          throw new IndexOutOfBoundsException("Informação adicional não encontrada.");           
        } catch (Throwable e){
          throw e;
        } finally {
           em.getTransaction().commit(); 
        }
    }

}