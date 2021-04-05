/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinic.services;

import clinic.Global;
import clinic.dao.AppointmentDAO;
import clinic.dao.MessageDAO;
import clinic.dao.PatientDAO;
import clinic.external.Patient;
import clinic.resources.Appointment;
import java.util.ArrayList;

/**
 *
 * @author biaav
 */
public class Messenger {
    private AppointmentDAO daoAppt;
    private PatientDAO daoPat;
    private MessageDAO daoMes;

    public Messenger() {
        this.daoPat = Global.daoPat;
        this.daoAppt = Global.daoAppt;
        this.daoMes = new MessageDAO();
    }
    
   
    public void sendMessage() {
        ArrayList<Patient> patients = this.daoPat.getAllPatientsWithComunications();
        ArrayList<Appointment> appts = this.daoAppt.getAppointmentsByPatients(patients);
        this.daoMes.sendMessage(appts); 
    }
    
    
}
