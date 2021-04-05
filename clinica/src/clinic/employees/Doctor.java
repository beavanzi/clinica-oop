/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinic.employees;
import clinic.dao.AttendanceDAO;
import clinic.dao.MedicalRecordDAO;
import clinic.dao.PatientDAO;
import clinic.dao.interfaces.InterfaceMedicalRecordDAO;
import clinic.dao.interfaces.InterfaceAttendanceDAO;
import clinic.dao.interfaces.InterfacePatientDAO;
import clinic.dao.interfaces.InterfaceDoctorDAO;
import clinic.dao.interfaces.InterfaceAditionalInfoDAO;
import clinic.dao.interfaces.InterfacePatientRecordDAO;
import clinic.dao.PatientRecordDAO;
import clinic.dao.AditionalInfoDAO;
import clinic.external.Patient;
import clinic.resources.Attendance;
import clinic.resources.MedicalRecord;
import clinic.dao.DoctorDAO;
import clinic.resources.AditionalInfo;
import clinic.resources.PatientRecord;
import java.util.ArrayList;

/**
 *
 * @author biaav
 */
public class Doctor implements InterfaceMedicalRecordDAO, InterfaceAttendanceDAO, InterfacePatientDAO, InterfaceDoctorDAO, InterfacePatientRecordDAO, InterfaceAditionalInfoDAO{
    private String name;
    private String doctorDoc;
    private String id;
    private AttendanceDAO daoAtt;
    private MedicalRecordDAO daoMedRec;
    private PatientDAO daoPat;
    private DoctorDAO daoDoc;
    private AditionalInfoDAO daoAdInfo;
    private PatientRecordDAO daoPatRec;

    public Doctor() {
    }

    public Doctor(String name, String doctorDoc, String id) {
        this.name = name;
        this.doctorDoc = doctorDoc;
        this.id = id;
        this.daoMedRec = new MedicalRecordDAO();
        this.daoAtt = new AttendanceDAO();
        this.daoPat = new PatientDAO();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDoctorDoc() {
        return doctorDoc;
    }

    public void setDoctorDoc(String doctorDoc) {
        this.doctorDoc = doctorDoc;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
    @Override
    public AditionalInfo createAditionalInfo(String badHabit, String allergy, String surgery, Patient patient){
        AditionalInfo adInfo = this.daoAdInfo.createAditionalInfo(badHabit, allergy, surgery, patient);
        
        return adInfo;
    }
    
    @Override    
    public void deletePatient(Patient patient){
       this.daoPat.deletePatient(patient);
    }
    
    @Override
    public void createPatient(String name, String docNumber, String birthDate, String address, String phone, String email, String healthInsurance){
        this.daoPat.createPatient(name, docNumber, birthDate, address, phone, email, healthInsurance);
    }
    
    @Override
    public void updatePatient(Patient patient, String name, String docNumber, String birthDate, String address, String phone, String email, String healthInsurance){
        this.daoPat.updatePatient(patient, name, docNumber, birthDate, address, phone, email, healthInsurance);
    }
    
    @Override
    public ArrayList<Patient> getAllPatients(){
        return this.daoPat.getAllPatients();
    }
    @Override
    public ArrayList<Patient> getAllPatientsWithoutComunications(){
        return this.getAllPatientsWithoutComunications();
    }
    
    @Override
    public void updateAditionalInfo(AditionalInfo adInfo, String badHabit, String allergy, String surgery) {
        this.daoAdInfo.updateAditionalInfo(adInfo, badHabit, allergy, surgery);
    }
    
    @Override
    public void deleteAditionalInfo(AditionalInfo adInfo) {
       this.daoAdInfo.deleteAditionalInfo(adInfo);
    }
    
    @Override
    public ArrayList<AditionalInfo> getAllAditionalInfo() {
        return this.daoAdInfo.getAllAditionalInfo();
    }

    @Override
    public AditionalInfo getAdidionalInfoByPatient(String patientName) {
      return this.daoAdInfo.getAdidionalInfoByPatient(patientName);
    }
    
    @Override
    public Patient getPatientByName(String searchParam){
        return this.daoPat.getPatientByName(searchParam);
    }
    
    @Override
    public Doctor getDoctorByName(String searchParam){
        return this.daoDoc.getDoctorByName(searchParam);
    }
    
    @Override
    public Attendance getAttendanceByDay(String searchParam){
        return this.daoAtt.getAttendanceByDay(searchParam);
    }
    
    @Override
    public Attendance createAttendance(int day, int month, Patient patient, Doctor doctor) {
       Attendance attendance = this.daoAtt.createAttendance(day, month, patient, doctor);
       return attendance;
    }

    @Override
    public void updateAttendance(Attendance attendance, int day, int month, Patient patient, Doctor doctor) {
        this.daoAtt.updateAttendance(attendance, day, month, patient, doctor);
    }

    @Override
    public void deleteAttendance(Attendance attendance) {
        this.daoAtt.deleteAttendance(attendance);
    }
    
    @Override
    public ArrayList<Attendance> getAllAttendances() {
        return this.daoAtt.getAllAttendances();
    }
    
    @Override
    public MedicalRecord createMedicalRecord(String prescription, String attestation, String followUp, Doctor doctor, Patient patient){
        MedicalRecord medRec = this.daoMedRec.createMedicalRecord(prescription, attestation, followUp, doctor, patient);
        return medRec;
    }
    
    @Override
    public String getPrescription(MedicalRecord medRec){
        String prescription = this.daoMedRec.getPrescription(medRec);
 
        return prescription;
    }
    
    @Override
    public String getAttestation(MedicalRecord medRec){
        String attestation = this.daoMedRec.getAttestation(medRec);
 
        return attestation;
    }
    
    @Override
    public String getFollowUp(MedicalRecord medRec){
        String followUp = this.daoMedRec.getFollowUp(medRec);
 
        return followUp;
    }
    
    @Override
    public ArrayList<MedicalRecord> getAllMedicalRecord(){
        return this.daoMedRec.getAllMedicalRecord();
    }
    
    @Override
    public MedicalRecord getMedicalRecord(String patientName){
       return this.daoMedRec.getMedicalRecord(patientName);
    }
    
    @Override
    public PatientRecord createPatientRecord(String symptoms, String diagnosis, String treatment, Patient patient){
        return this.daoPatRec.createPatientRecord(symptoms, diagnosis, treatment, patient);
    }
    
    @Override
    public void updatePatientRecord(PatientRecord patRec, String symptoms, String diagnosis, String treatment){
        this.daoPatRec.updatePatientRecord(patRec, symptoms, diagnosis, treatment);
    }
    
    @Override
    public void deletePatientRecord(PatientRecord patRec){
        this.daoPatRec.deletePatientRecord(patRec);
    }
    
    @Override
    public ArrayList<PatientRecord> getAllPatientRecord(){
       return this.daoPatRec.getAllPatientRecord();
    }
    
    @Override
    public PatientRecord getPatientRecord(String patientName){
        return this.daoPatRec.getPatientRecord(patientName);
    }
    
    @Override
    public void createDoctor(String name, String doctorDoc, String id){
        this.daoDoc.createDoctor(name, doctorDoc, id);
    }
     
}
