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
import java.util.List;


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
        this.daoPat = Global.daoPat;
        this.daoAppt = Global.daoAppt;
        this.daoDoc = Global.daoDoc;
        this.daoApptRec = Global.daoApptRec;
    }
    
    public Secretary(String secName, String secId) {
        this.secName = secName;
        this.secId = secId;
        this.daoPat = Global.daoPat;
        this.daoAppt = Global.daoAppt;
        this.daoDoc = Global.daoDoc;
        this.daoApptRec = Global.daoApptRec;
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
    public void updatePatient(String searchName, String name, String docNumber, String birthDate, String address, String phone, String email, String healthInsurance) {
        this.daoPat.updatePatient(searchName, name, docNumber, birthDate, address, phone, email, healthInsurance);
    }

    @Override
    public void deletePatient(String name) {
        this.daoPat.deletePatient(name);
    }
    
    @Override
    public Patient getPatientByName(String searchParam){
        return this.daoPat.getPatientByName(searchParam);
    }

    @Override
    public void createAppointment(String day, String hour, Doctor doctor, Patient patient, String visit) {
        this.daoAppt.createAppointment(day, hour, doctor, patient, visit);
    }

    @Override
    public void updateAppointment(Integer id, String day, String hour, Doctor doctor, Patient patient, String visit) {
        this.daoAppt.updateAppointment(id, day, hour, doctor, patient, visit);
    }

    @Override
    public void deleteAppointment(Integer id) {
        this.daoAppt.deleteAppointment(id);
    }
    
    @Override
    public Appointment getAppointmentByPatientName(String searchParam) {
        return this.daoAppt.getAppointmentByPatientName(searchParam);
    }

//    @Override
//    public ArrayList<Appointment> getAllAppointments() {
//        return this.daoAppt.getAllAppointments();
//
//    }
//
//    @Override
//    public Appointment getAppointmentByDay(String searchParam) {
//        return this.daoAppt.getAppointmentByDay(searchParam);
//    }

    @Override
    public ArrayList<Patient> getAllPatientsWithoutComunications() {
        return this.daoPat.getAllPatientsWithoutComunications();
    }
    
    @Override
    public List<Appointment> getAppointmentsByPatients(List<Patient> patients) {
        return this.daoAppt.getAppointmentsByPatients(patients);
    }

    public ArrayList<Appointment> getNextDayAppointments() {
        List<Patient> pats = this.getAllPatientsWithoutComunications();
        List<Appointment> apps = this.getAppointmentsByPatients(pats);
        ArrayList<Appointment> apptsNextDay = new ArrayList(this.daoApptRec.getNextDayAppointments(apps));
        
        return apptsNextDay;
    }
    
    public Doctor getDoctorByName(String searchParam){
        return this.daoDoc.getDoctorByName(searchParam);
    }
    
    public ArrayList<Doctor> getAllDoctors(){
        return this.daoDoc.getAllDoctors();
    }
    
    
}
