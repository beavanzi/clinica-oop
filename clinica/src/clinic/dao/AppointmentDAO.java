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
import java.util.ArrayList;

/**
 *
 * @author biaav
 */
public class AppointmentDAO implements InterfaceAppointmentDAO{
    private static ArrayList<Appointment> appointments;

    public AppointmentDAO() {
        this.appointments = new ArrayList();
    } 
    
    @Override
    public Appointment createAppointment(String day, String hour, Doctor doctor, Patient patient, Visit vist) {
        Appointment appt = new Appointment(day,hour,doctor,patient,vist);
        appointments.add(appt);
        
        return appt;
    }

    @Override
    public void updateAppointment(Appointment appt, String day, String hour, Doctor doctor, Patient patient, Visit visit) {
        if (appointments.contains(appt)){
            appt.setDay(day);
            appt.setDoctor(doctor);
            appt.setHour(hour);
            appt.setPatient(patient);
            appt.setVisit(visit);
        }
    }

    @Override
    public void deleteAppointment(Appointment appt) {
        if (appointments.contains(appt)){
            appointments.remove(appt);  
        }
    }

    @Override
    public ArrayList<Appointment> getAllAppointments() {
        return this.appointments;
    }
    

}
