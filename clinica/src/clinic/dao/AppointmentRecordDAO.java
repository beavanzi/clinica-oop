/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinic.dao;

import clinic.assets.Visit;
import clinic.dao.interfaces.InterfaceAppointmentRecordDAO;
import clinic.resources.Appointment;

/**
 *
 * @author biaav
 */
public class AppointmentRecordDAO implements InterfaceAppointmentRecordDAO {

    @Override
    public String getAppointment(Appointment appt) {
       String pat = appt.getPatient().getName();
       String doc = appt.getDoctor().getName();
       String day = appt.getDay();
       String hour = appt.getHour();
       Visit visit = appt.getVisit();
       String appointment = pat + ' ' + doc + ' ' + day + ' ' + hour + ' ' + visit.toString();
       
       return appointment;
    }
    
}
