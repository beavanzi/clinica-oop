/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinic.dao;

import clinic.dao.interfaces.InterfaceAppointmentDAO;
import clinic.employees.Doctor;
import clinic.external.Patient;
import clinic.resources.Appointment;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author biaav
 */
public class AppointmentDAO implements InterfaceAppointmentDAO{
    private EntityManager em;

    public AppointmentDAO(EntityManager em) {
        this.em = em;
    } 
    
    @Override
    public void createAppointment(String day, String hour, Doctor doctor, Patient patient, String visit) {
        Appointment appt = new Appointment(day,hour,doctor,patient,visit);
        
        em.getTransaction().begin();
        em.persist(appt);
        em.getTransaction().commit(); 
    }
   
    @Override
    public void updateAppointment(Integer patientId, String day, String hour, Doctor doctor, Patient patient, String visit) {
        em.getTransaction().begin();
       
      try {
        Query query = em.createQuery("SELECT appt FROM Appointment appt WHERE appt.patient.id = :patientId", Appointment.class);
        query.setParameter("patientId", patientId);
        
        List<Appointment> appts = query.getResultList();
        Appointment appt = appts.get(0);
        
        
        
        appt.setDay(day);
        appt.setDoctor(doctor);
        appt.setHour(hour);
        appt.setPatient(patient);
        appt.setVisit(visit);
        
      } catch (IndexOutOfBoundsException e) {
        throw new IndexOutOfBoundsException("Agendamento não encontrado.");           
      } catch (Throwable e){
        throw e;
      } finally {
         em.getTransaction().commit(); 
      }
            
    }

    @Override
    public void deleteAppointment(Integer patientId) {
        em.getTransaction().begin();
       
       try {
        Query query = em.createQuery("SELECT appt FROM Appointment appt WHERE appt.patient.id = :patientId", Appointment.class);
        query.setParameter("patientId", patientId);
        
        List<Appointment> appts = query.getResultList();
        Appointment appt = appts.get(0);
        
        em.remove(appt);
       } catch (IndexOutOfBoundsException e) {
           throw new IndexOutOfBoundsException("Agendamento não encontrado.");           
       } catch (Throwable e){
           throw e;
       } finally {
        em.getTransaction().commit();
       }

    }
    

    @Override
    public Appointment getAppointmentByPatientName(String name) {
        em.getTransaction().begin();
       
       try {
        Query query = em.createQuery("SELECT pat FROM Patient pat WHERE pat.name = :name", Patient.class);
        query.setParameter("name", name);
        
        List<Appointment> appts = query.getResultList();
        Appointment appt = appts.get(0);
        
        return appt;
       } catch (IndexOutOfBoundsException e) {
           throw new IndexOutOfBoundsException("Agendamento não encontrado.");           
       } catch (Throwable e){
           throw e;
       } finally {
        em.getTransaction().commit();
       }
    }

//    @Override
//    public ArrayList<Appointment> getAllAppointments() {
//        return this.appointments;
//    }

//    @Override
//    public Appointment getAppointmentByDay(String searchParam) {
//       if (appointments.size() > 0){
//            for (int i = 0; i < appointments.size(); i++) {
//            Appointment appt = appointments.get(i);
//
//            if (searchParam.equals(appt.getDay())) 
//                return appt;
//           }
//       }
//       
//      return null;
//    }


    @Override
    public List<Appointment> getAppointmentsByPatients(List<Patient> patients) {
        List<Appointment> newAppts = new ArrayList(); 
        
        if (!patients.isEmpty()) {
          for (int i = 0; i < patients.size(); i++){
            Query query = em.createQuery("SELECT appt FROM Appointment appt WHERE appt.patient.name = :name", Appointment.class);
            query.setParameter("name", patients.get(i).getName());

            List<Appointment> appts = query.getResultList();
            Appointment appt = appts.get(0);
            
            newAppts.add(appt);
          }
        }
        
        
//        if (appointments.size() > 0 && patients != null){
//            for (int i = 0; i < appointments.size(); i++) {
//            Appointment appt = appointments.get(i);
//                         
//                for (int j = 0; j < patients.size(); j++) {
//                    Patient pat = patients.get(j);
//
//                    if (pat == appt.getPatient()){
//                       newAppts.add(appt);
//                    }
//                }
//           }
//        }
        
        return newAppts;    
    }
    
    
    
    
    

}
