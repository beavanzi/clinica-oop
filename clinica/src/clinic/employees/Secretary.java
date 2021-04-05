/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinic.employees;

import clinic.Clinic;
import clinic.Global;
import clinic.dao.AppointmentDAO;
import clinic.dao.AppointmentRecordDAO;
import clinic.dao.DoctorDAO;
import clinic.dao.PatientDAO;
import clinic.dao.interfaces.InterfaceAppointmentDAO;
import clinic.dao.interfaces.InterfacePatientDAO;
import clinic.external.Patient;
import clinic.resources.Appointment;
import java.util.ArrayList;


/**
 *
 * @author biaav
 */
public class Secretary implements InterfacePatientDAO, InterfaceAppointmentDAO {
    private String secName;
    private String secId;
    private AppointmentDAO daoAppt;
    private PatientDAO daoPat;
    private AppointmentRecordDAO daoApptRec;
    private DoctorDAO daoDoc;


    public Secretary() {
        this.secName = secName;
        this.secId = secId;
        this.daoPat = new PatientDAO();
        this.daoAppt = new AppointmentDAO();
        this.daoApptRec = new AppointmentRecordDAO();
        this.daoDoc = Global.daoDoc;
    }
    
      public Secretary(DoctorDAO daoDoc) {
        this.secName = secName;
        this.secId = secId;
        this.daoPat = new PatientDAO();
        this.daoAppt = new AppointmentDAO();
        this.daoApptRec = new AppointmentRecordDAO();
        this.daoDoc = Global.daoDoc;
    }

    public Secretary(String secName, String secId) {
        this.secName = secName;
        this.secId = secId;
        this.daoPat = new PatientDAO();
        this.daoAppt = new AppointmentDAO();
        this.daoApptRec = new AppointmentRecordDAO();
        this.daoDoc = new DoctorDAO();
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
    public Appointment createAppointment(String day, String hour, Doctor doctor, Patient patient, String visit) {
        Appointment appt = this.daoAppt.createAppointment(day, hour, doctor, patient, visit);
        return appt;
    }

    @Override
    public void updateAppointment(Appointment appt, String day, String hour, Doctor doctor, Patient patient, String visit) {
        this.daoAppt.updateAppointment(appt, day, hour, doctor, patient, visit);
    }

    @Override
    public void deleteAppointment(Appointment appt) {
        this.daoAppt.deleteAppointment(appt);
    }

    @Override
    public ArrayList<Appointment> getAllAppointments() {
        return this.daoAppt.getAllAppointments();

    }
    
    public Doctor getDoctorByName(String searchParam){
        return this.daoDoc.getDoctorByName(searchParam);
    }
    
    public ArrayList<Doctor> getAllDoctors(){
        return this.daoDoc.getAllDoctors();
    }

    @Override
    public Appointment getAppointmentByDay(String searchParam) {
        return this.daoAppt.getAppointmentByDay(searchParam);
    }

    @Override
    public ArrayList<Patient> getAllPatientsWithoutComunications() {
        return this.daoPat.getAllPatientsWithoutComunications();
    }
    
    @Override
    public ArrayList<Appointment> getAppointmentsByPatients(ArrayList<Patient> patients) {
        return this.daoAppt.getAppointmentsByPatients(patients);
    }

    public ArrayList<Appointment> getNextDayAppointments() {
        ArrayList<Patient> pats = this.getAllPatientsWithoutComunications();
        ArrayList<Appointment> apps = this.getAppointmentsByPatients(pats);
        ArrayList<Appointment> apptsNextDay = this.daoApptRec.getNextDayAppointments(apps);   
        return apptsNextDay;
    }
    
    
    
    
}
