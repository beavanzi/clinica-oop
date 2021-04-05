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
    public Appointment createAppointment(String day, String hour, Doctor doctor, Patient patient, String visit) {
        Appointment appt = new Appointment(day,hour,doctor,patient,visit);
        appointments.add(appt);
        
        return appt;
    }

    @Override
    public void updateAppointment(Appointment appt, String day, String hour, Doctor doctor, Patient patient, String visit) {
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

    @Override
    public Appointment getAppointmentByDay(String searchParam) {
       if (appointments.size() > 0){
            for (int i = 0; i < appointments.size(); i++) {
            Appointment appt = appointments.get(i);

            if (searchParam.equals(appt.getDay())) 
                return appt;
           }
       }
       
      return null;
    }

    @Override
    public ArrayList<Appointment> getAppointmentsByPatients(ArrayList<Patient> patients) {
        ArrayList<Appointment> newAppts = new ArrayList();
        
        if (appointments.size() > 0 && patients != null){
            for (int i = 0; i < appointments.size(); i++) {
            Appointment appt = appointments.get(i);
                         
                for (int j = 0; j < patients.size(); j++) {
                    Patient pat = patients.get(j);

                    if (pat == appt.getPatient()){
                       newAppts.add(appt);
                    }
                }
           }
        }
        
        return newAppts;    
    }
    
    
    
    
    

}
