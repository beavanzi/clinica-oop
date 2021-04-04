/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinic.dao;
import java.util.ArrayList;
import clinic.employees.Doctor;
import clinic.external.Patient;
import clinic.resources.Attendance;
import clinic.dao.interfaces.InterfaceAttendanceDAO;

/**
 *
 * @author sarahanduca
 */
public class AttendanceDAO implements InterfaceAttendanceDAO{
    private static ArrayList<Attendance> attendances;
    
    public AttendanceDAO(){
        this.attendances = new ArrayList();
    }
    
    @Override
    public Attendance createAttendance(int day, int month, Patient patient, Doctor doctor){
        Attendance att = new Attendance(day, month, patient, doctor);
        attendances.add(att);
        
        return att;
    }
    
    @Override
    public void updateAttendance(Attendance att, int day, int month, Patient patient, Doctor doctor){
        if(attendances.contains(att)){
            att.setDay(day);
            att.setMonth(month);
            att.setPatient(patient);
            att.setDoctor(doctor);
        }
    }
    
    @Override
    public void deleteAttendance(Attendance att){
        if(attendances.contains(att)){
            attendances.remove(att);
        }
    }
    
    @Override 
    public ArrayList<Attendance> getAllAttendances(){
        return this.attendances;
    }
}
