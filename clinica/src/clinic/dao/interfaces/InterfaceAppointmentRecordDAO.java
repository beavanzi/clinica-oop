/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinic.dao.interfaces;

import clinic.resources.Appointment;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author biaav
 */
public interface InterfaceAppointmentRecordDAO {
    List<Appointment> getNextDayAppointments(List<Appointment> appts);
}