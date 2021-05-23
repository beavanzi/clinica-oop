/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinic.dao;

import clinic.dao.interfaces.InterfaceAppointmentRecordDAO;
import clinic.resources.Appointment;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Query;

/**
 *
 * @author biaav
 */
public class AppointmentRecordDAO implements InterfaceAppointmentRecordDAO {

    @Override
    public List<Appointment> getNextDayAppointments(List<Appointment> appts) {
        LocalDate date = LocalDate.now().plusDays(1);
        
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String dateFormatted = date.format(formatter);    
       
        if (appts != null){
            appts.stream().filter(appt -> appt.getDay().equals(dateFormatted) );
        }
       
       return appts;
       
       
//       em.getTransaction().begin();
//       
//       LocalDate date = LocalDate.now().plusDays(1);
//       
//       try {
//        Query query = em.createQuery("SELECT appt FROM Appointment appt WHERE appt.dateDay = :date", Appointment.class);
//        query.setParameter("date", date);
//        List<Appointment> appts = query.getResultList();
//        return appts;
//       } catch (Throwable e){
//           throw e;
//       } finally {
//        em.getTransaction().commit();
//       }
 
    }

    
}
