/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinic.dao.interfaces;

import clinic.employees.Doctor;
import clinic.external.Patient;
import clinic.resources.Appointment;
import java.util.ArrayList;

/**
 *
 * @author biaav
 */
public interface InterfaceAppointmentDAO {
    Appointment createAppointment(String day, String hour, Doctor doctor, Patient patient, String vist);
    void updateAppointment(Appointment appt, String day, String hour, Doctor doctor, Patient patient, String visit);
    void deleteAppointment(Appointment appt);
    ArrayList<Appointment> getAllAppointments();
    Appointment getAppointmentByDay(String day);
    ArrayList<Appointment> getAppointmentsByPatients(ArrayList<Patient> patients);
}
