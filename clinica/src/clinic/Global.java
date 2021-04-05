/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinic;

import clinic.dao.AppointmentDAO;
import clinic.dao.DoctorDAO;
import clinic.dao.PatientDAO;

/**
 *
 * @author biaav
 */
public class Global {
    public static DoctorDAO daoDoc = new DoctorDAO();
    public static PatientDAO daoPat = new PatientDAO();
    public static AppointmentDAO daoAppt = new AppointmentDAO();
}
