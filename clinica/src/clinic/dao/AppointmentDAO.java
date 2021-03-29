/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinic.dao;

import clinic.assets.Visit;
import clinic.dao.interfaces.InterfaceAppointmentDAO;
import clinic.employees.Doctor;
import clinic.external.Patient;
import clinic.resources.Appointment;

/**
 *
 * @author biaav
 */
public class AppointmentDAO implements InterfaceAppointmentDAO{

    @Override
    public Appointment createAppointment(String day, String hour, Doctor doctor, Patient patient, Visit vist) {
        Appointment appt = new Appointment();
        return appt;
    }

    @Override
    public void updateAppointment(Appointment appt, String day, String hour, Doctor doctor, Patient patient, Visit visit) {
        appt.setDay(day);
        appt.setDoctor(doctor);
        appt.setHour(hour);
        appt.setPatient(patient);
        appt.setVisit(visit);
    }

    @Override
    public void deleteAppointment(Appointment appt) {
        appt.setDay(null);
        appt.setDoctor(null);
        appt.setHour(null);
        appt.setPatient(null);
        appt.setVisit(null);

    }

}
