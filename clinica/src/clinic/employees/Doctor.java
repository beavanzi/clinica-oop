/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinic.employees;
import clinic.Global;
import clinic.dao.MedicalRecordDAO;
import clinic.dao.PatientDAO;
import clinic.dao.interfaces.InterfaceMedicalRecordDAO;
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
public class Doctor implements InterfaceMedicalRecordDAO, InterfacePatientDAO, InterfaceDoctorDAO, InterfacePatientRecordDAO, InterfaceAditionalInfoDAO{
    private String name;
    private String doctorDoc;
    private String id;
    private MedicalRecordDAO daoMedRec;
    private PatientDAO daoPat;
    private DoctorDAO daoDoc;
    private AditionalInfoDAO daoAdInfo;
    private PatientRecordDAO daoPatRec;

    public Doctor() {
        this.daoPat = Global.daoPat;
        this.daoDoc = Global.daoDoc; 
        this.daoMedRec = Global.daoMedRec;
        this.daoAdInfo = Global.daoAdInfo;
    }

    public Doctor(String name, String doctorDoc, String id) {
        this.name = name;
        this.doctorDoc = doctorDoc;
        this.id = id;
        this.daoMedRec = Global.daoMedRec;
        this.daoPat = Global.daoPat;
        this.daoDoc = Global.daoDoc;
        this.daoAdInfo = Global.daoAdInfo;
                
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
    public void createAditionalInfo(String badHabit, String allergy, String surgery, Patient patient){
        this.daoAdInfo.createAditionalInfo(badHabit, allergy, surgery, patient);  
    }
    
    @Override    
    public void deletePatient(String searchName){
       this.daoPat.deletePatient(searchName);
    }
    
    @Override
    public void createPatient(String name, String docNumber, String birthDate, String address, String phone, String email, String healthInsurance){
        this.daoPat.createPatient(name, docNumber, birthDate, address, phone, email, healthInsurance);
    }
    
    @Override
    public void updatePatient(String searchName, String name, String docNumber, String birthDate, String address, String phone, String email, String healthInsurance){
        this.daoPat.updatePatient(searchName, name, docNumber, birthDate, address, phone, email, healthInsurance);
    }
   
    @Override
    public ArrayList<Patient> getAllPatientsWithoutComunications(){
        return this.getAllPatientsWithoutComunications();
    }
    
    @Override
    public void updateAditionalInfo(Integer patientId, String badHabit, String allergy, String surgery) {
        this.daoAdInfo.updateAditionalInfo(patientId, badHabit, allergy, surgery);
    }
    
    @Override
    public void deleteAditionalInfo(Integer patientId) {
       this.daoAdInfo.deleteAditionalInfo(patientId);
    }
    
//    @Override
//    public ArrayList<AditionalInfo> getAllAditionalInfo() {
//        return this.daoAdInfo.getAllAditionalInfo();
//    }

    @Override
    public AditionalInfo getAditionalInfoByPatient(Integer patientId) {
      return this.daoAdInfo.getAditionalInfoByPatient(patientId);
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
    public void createMedicalRecord(String prescription, String attestation, String followUp, Doctor doctor, Patient patient){
        this.daoMedRec.createMedicalRecord(prescription, attestation, followUp, doctor, patient);
    }
    
//    @Override
//    public String getPrescription(MedicalRecord medRec){
//        String prescription = this.daoMedRec.getPrescription(medRec);
// 
//        return prescription;
//    }
//    
//    @Override
//    public String getAttestation(MedicalRecord medRec){
//        String attestation = this.daoMedRec.getAttestation(medRec);
// 
//        return attestation;
//    }
//    
//    @Override
//    public String getFollowUp(MedicalRecord medRec){
//        String followUp = this.daoMedRec.getFollowUp(medRec);
// 
//        return followUp;
//    }
//    
    @Override
    public ArrayList<MedicalRecord> getAllMedicalRecord(){
        return this.daoMedRec.getAllMedicalRecord();
    }
    
    @Override
    public MedicalRecord getMedicalRecord(String patientName){
       return this.daoMedRec.getMedicalRecord(patientName);
    }
    
    @Override
    public void createPatientRecord(String symptoms, String diagnosis, String treatment, Patient patient){
        this.daoPatRec.createPatientRecord(symptoms, diagnosis, treatment, patient);
    }
    
    @Override
    public void updatePatientRecord(String symptoms, String diagnosis, String treatment, Integer patientId){
        this.daoPatRec.updatePatientRecord(symptoms, diagnosis, treatment, patientId);
    }
    
    @Override
    public void deletePatientRecord(Integer patientId){
        this.daoPatRec.deletePatientRecord(patientId);
    }
    
    @Override
    public void createDoctor(String name, String doctorDoc, String id){
        this.daoDoc.createDoctor(name, doctorDoc, id);
    }
     
}
