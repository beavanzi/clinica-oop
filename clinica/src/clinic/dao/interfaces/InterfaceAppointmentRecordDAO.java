/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinic.dao.interfaces;

import clinic.resources.AppointmentRecord;
import clinic.resources.Appointment;


/**
 *
 * @author biaav
 */
public interface InterfaceAppointmentRecordDAO {
    String getAppointment(Appointment appointment);
}