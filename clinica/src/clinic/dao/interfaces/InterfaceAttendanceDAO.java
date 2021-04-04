/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinic.dao.interfaces;
import java.util.ArrayList;
import clinic.resources.Attendance;
import clinic.employees.Doctor;
import clinic.external.Patient;
/**
 *
 * @author sarahanduca
 */
public interface InterfaceAttendanceDAO {
    Attendance createAttendance(int day, int month, Patient patient, Doctor doctor);
    void updateAttendance(Attendance att, int day, int month, Patient patient, Doctor doctor);
    void deleteAttendance(Attendance att);
    Attendance getAttendanceByDay(String searchParam);
    ArrayList<Attendance> getAllAttendances();
}
