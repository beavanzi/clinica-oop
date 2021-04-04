/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinic.dao;

import clinic.dao.interfaces.InterfaceAppointmentRecordDAO;
import clinic.resources.Appointment;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author biaav
 */
public class AppointmentRecordDAO implements InterfaceAppointmentRecordDAO {

    @Override
    public ArrayList<Appointment> getNextDayAppointments(ArrayList<Appointment> appts) {
      // LocalDate date = LocalDate.now();
       Date dt = new Date();
       LocalDate.from(dt.toInstant()).plusDays(1); 
       appts.stream().filter(appt -> appt.getDay().equals(dt.toString()) );
 
        
//       String pat = appt.getPatient().getName();
//       String doc = appt.getDoctor().getName();
//       String day = appt.getDay();
//       String hour = appt.getHour();
//       String visit = appt.getVisit();
//       String appointment = pat + ' ' + doc + ' ' + day + ' ' + hour + ' ' + visit;
       
       return appts;
    }

    
}
