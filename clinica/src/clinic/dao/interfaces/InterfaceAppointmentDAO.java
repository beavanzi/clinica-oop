/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinic.dao.interfaces;

import clinic.employees.Doctor;
import clinic.external.Patient;
import clinic.resources.Appointment;
import java.util.List;

/**
 *
 * @author biaav
 */
public interface InterfaceAppointmentDAO {
    void createAppointment(String day, String hour, Doctor doctor, Patient patient, String vist);
    void updateAppointment(Integer id, String day, String hour, Doctor doctor, Patient patient, String visit);
    void deleteAppointment(Integer id);
   // ArrayList<Appointment> getAllAppointments();
   // Appointment getAppointmentByDay(String day);
    Appointment getAppointmentByPatientName(String searchName);
    List<Appointment> getAppointmentsByPatients(List<Patient> patients);
}


