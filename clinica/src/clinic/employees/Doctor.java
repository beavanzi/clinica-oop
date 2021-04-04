/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinic.employees;
import clinic.dao.AttendanceDAO;
import clinic.dao.MedicalRecordDAO;
import clinic.dao.interfaces.InterfaceMedicalRecordDAO;
import clinic.dao.interfaces.InterfaceAttendanceDAO;
import clinic.external.Patient;
import clinic.resources.Attendance;
import clinic.resources.MedicalRecord;
import java.util.ArrayList;

/**
 *
 * @author biaav
 */
public class Doctor implements InterfaceMedicalRecordDAO, InterfaceAttendanceDAO{
    private String name;
    private String doctorDoc;
    private String id;
    private AttendanceDAO daoAtt;
    private MedicalRecordDAO daoMedRec;

    public Doctor() {
    }

    public Doctor(String name, String doctorDoc, String id) {
        this.name = name;
        this.doctorDoc = doctorDoc;
        this.id = id;
        this.daoMedRec = new MedicalRecordDAO();
        this.daoAtt = new AttendanceDAO();
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
   
    
}
