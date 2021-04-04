/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinic.employees;

import clinic.assets.Visit;
import clinic.dao.AppointmentDAO;
import clinic.dao.AppointmentRecordDAO;
import clinic.dao.PatientDAO;
import clinic.dao.interfaces.InterfaceAppointmentDAO;
import clinic.dao.interfaces.InterfaceAppointmentRecordDAO;
import clinic.dao.interfaces.InterfacePatientDAO;
import clinic.external.Patient;
import clinic.resources.Appointment;
import java.util.ArrayList;


/**
 *
 * @author biaav
 */
public class Secretary implements InterfacePatientDAO, InterfaceAppointmentDAO, InterfaceAppointmentRecordDAO {
    private String secName;
    private String secId;
    private AppointmentDAO daoAppt;
    private PatientDAO daoPat;
    private AppointmentRecordDAO daoApptRec;
  
    public Secretary() {
    }

    public Secretary(String secName, String secId) {
        this.secName = secName;
        this.secId = secId;
        this.daoPat = new PatientDAO();
        this.daoAppt = new AppointmentDAO();
        this.daoApptRec = new AppointmentRecordDAO();
    }

    public String getSecName() {
        return secName;
    }

    public void setSecName(String secName) {
        this.secName = secName;
    }

    public String getSecId() {
        return secId;
    }

    public void setSecId(String secId) {
        this.secId = secId;
    }

    @Override
    public void createPatient(String name, String docNumber, String birthDate, String address, String phone, String email, String healthInsurance) {
       this.daoPat.createPatient(name, docNumber, birthDate, address, phone, email, healthInsurance);
    }

    @Override
    public void updatePatient(Patient patient, String name, String docNumber, String birthDate, String address, String phone, String email, String healthInsurance) {
        this.daoPat.updatePatient(patient, name, docNumber, birthDate, address, phone, email, healthInsurance);
    }

    @Override
    public void deletePatient(Patient patient) {
        this.daoPat.deletePatient(patient);
    }
    
    @Override
    public ArrayList<Patient> getAllPatients() {
        return this.daoPat.getAllPatients();
    }
    
    @Override
    public Patient getPatientByName(String searchParam){
        return this.daoPat.getPatientByName(searchParam);
    }

    @Override
    public Appointment createAppointment(String day, String hour, Doctor doctor, Patient patient, Visit vist) {
        Appointment appt = this.daoAppt.createAppointment(day, hour, doctor, patient, vist);
        return appt;
    }

    @Override
    public void updateAppointment(Appointment appt, String day, String hour, Doctor doctor, Patient patient, Visit visit) {
        this.daoAppt.updateAppointment(appt, day, hour, doctor, patient, visit);
    }

    @Override
    public void deleteAppointment(Appointment appt) {
        this.daoAppt.deleteAppointment(appt);
    }

    @Override
    public String getAppointment(Appointment appointment) {
        String apptRec = this.daoApptRec.getAppointment(appointment);
        return apptRec;
    }

    @Override
    public ArrayList<Appointment> getAllAppointments() {
        return this.daoAppt.getAllAppointments();

    }
    
    
}
