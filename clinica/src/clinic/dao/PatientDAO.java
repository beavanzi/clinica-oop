/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinic.dao;

import clinic.dao.interfaces.InterfacePatientDAO;
import clinic.external.Patient;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author biaav
 */

public class PatientDAO implements InterfacePatientDAO{
    private EntityManager em;

    public PatientDAO(EntityManager em) {
        this.em = em;
    }
    
    @Override
    public void createPatient(String name, String docNumber, String birthDate, String address, String phone, String email, String healthInsurance) {
        Patient patient = new Patient(name, docNumber, birthDate, address, phone, email, healthInsurance);
        
        em.getTransaction().begin();
        em.persist(patient);
        em.getTransaction().commit(); 
     
    }

    @Override
    public void updatePatient(String searchName, String name, String docNumber, String birthDate, String address, String phone, String email, String healthInsurance) { 
       em.getTransaction().begin();
       
      try {
        Query query = em.createQuery("SELECT pat FROM Patient pat WHERE pat.name = :searchName", Patient.class);
        query.setParameter("searchName", searchName);
        List<Patient> patients = query.getResultList();
        Patient pat = patients.get(0);
        
        pat.setAddress(address);
        pat.setBirthDate(birthDate);
        pat.setDocNumber(docNumber);
        pat.setEmail(email);
        pat.setHealthInsurance(healthInsurance);
        pat.setName(name);
        pat.setPhone(phone); 
      } catch (IndexOutOfBoundsException e) {
           throw new IndexOutOfBoundsException("Paciente não encontrado.");           
      } catch (Throwable e){
           throw e;
      } finally {
         em.getTransaction().commit(); 
      }

    }
    
    //nao usar ainda
    public void updatePatient(Patient pat, String name, String docNumber, String birthDate, String address, String phone, String email, String healthInsurance) { 
       em.getTransaction().begin();
      
        pat.setAddress(address);
        pat.setBirthDate(birthDate);
        pat.setDocNumber(docNumber);
        pat.setEmail(email);
        pat.setHealthInsurance(healthInsurance);
        pat.setName(name);
        pat.setPhone(phone); 
     
       
       em.getTransaction().commit();
    
    }
    
    @Override    
    public void deletePatient(String name){
       em.getTransaction().begin();
           
       try {
        Query query = em.createQuery("SELECT pat FROM Patient pat WHERE pat.name = :name", Patient.class);
        query.setParameter("name", name);
        List<Patient> patients = query.getResultList();
        Patient pat = patients.get(0);
        em.remove(pat);
       } catch (IndexOutOfBoundsException e) {
           throw new IndexOutOfBoundsException("Paciente não encontrado.");           
       } catch (Throwable e){
           throw e;
       } finally {
        em.getTransaction().commit();
       }
       
    }
    
    @Override
    public Patient getPatientByName(String name){
       
       try {
            Query query = em.createQuery("SELECT pat FROM Patient pat WHERE pat.name = :name", Patient.class);
            query.setParameter("name", name);
            List<Patient> patients = query.getResultList();
            Patient pat = patients.get(0);
            return pat;
       } catch (IndexOutOfBoundsException e) {
            throw new IndexOutOfBoundsException("Paciente não encontrado.");           
       }
   
    }

   
    public ArrayList<Patient> getAllPatientsWithComunications() {

        List<Patient> patients = em.createQuery("SELECT pat FROM Patient pat WHERE pat.email <> '' OR pat.phone <> ''", Patient.class).getResultList();

        if (patients.isEmpty()){
            return new ArrayList();
        }

        return new ArrayList(patients);
        
    }

    @Override
    public ArrayList<Patient> getAllPatientsWithoutComunications() {
       
        List<Patient> patients = em.createQuery("SELECT pat FROM Patient pat WHERE pat.email = '' AND pat.phone = ''", Patient.class).getResultList();
        
        if (patients.isEmpty()){
            return new ArrayList();
        }

        return new ArrayList(patients);
    }
    
}
