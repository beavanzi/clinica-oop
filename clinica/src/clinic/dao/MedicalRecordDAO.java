/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinic.dao;
import clinic.resources.MedicalRecord;
import clinic.dao.interfaces.InterfaceMedicalRecordDAO;
import clinic.employees.Doctor;
import clinic.external.Patient;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author biaav
 */
public class MedicalRecordDAO implements InterfaceMedicalRecordDAO {
     private static ArrayList<MedicalRecord> medicalRecord;
     private EntityManager em;

    public MedicalRecordDAO(EntityManager em) {
        this.em = em;
    } 
    
    @Override
    public void createMedicalRecord(String prescription, String attestation, String followUp, Doctor doctor, Patient patient){
        MedicalRecord medRec = new MedicalRecord(prescription, attestation, followUp, doctor, patient);
       
        em.getTransaction().begin();
        em.persist(medRec);
        em.getTransaction().commit(); 
    }

    @Override
    public MedicalRecord getMedicalRecord(String patientName) {
       for (int i = 0; i <= medicalRecord.size(); i++) {
        MedicalRecord medRec = medicalRecord.get(i);
        
        if (patientName.equals(medRec.getPatient())){
            return medRec;
        }
      }
       
      return null;
    
    }

    @Override
    public ArrayList<MedicalRecord> getAllMedicalRecord() {
          Query query = em.createQuery("SELECT medRec FROM MedicalRecord medRec", MedicalRecord.class);
          List<MedicalRecord> medRecs = query.getResultList();
      
          return new ArrayList<MedicalRecord>(medRecs);    
        
    }
            
}
