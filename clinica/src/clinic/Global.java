/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinic;

import clinic.dao.AppointmentDAO;
import clinic.dao.DoctorDAO;
import clinic.dao.PatientDAO;
import clinic.dao.MedicalRecordDAO;
import clinic.dao.AditionalInfoDAO;
import clinic.dao.AppointmentRecordDAO;
import clinic.dao.PatientRecordDAO;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author biaav
 */
public class Global {
    public static EntityManagerFactory emf = Persistence.createEntityManagerFactory("clinicaPU");
    public static EntityManager em = emf.createEntityManager();
    public static DoctorDAO daoDoc = new DoctorDAO();
    public static PatientDAO daoPat = new PatientDAO(em);
    public static AppointmentDAO daoAppt = new AppointmentDAO(em);
    public static AppointmentRecordDAO daoApptRec = new AppointmentRecordDAO();
    public static MedicalRecordDAO daoMedRec = new MedicalRecordDAO(em);
    public static AditionalInfoDAO daoAdInfo = new AditionalInfoDAO(em);
}
