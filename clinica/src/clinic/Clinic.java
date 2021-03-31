/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinic;

import clinic.assets.Visit;
import clinic.dao.AppointmentDAO;
import clinic.dao.AppointmentRecordDAO;
import clinic.dao.MessageDAO;
import clinic.employees.Secretary;
import clinic.external.Patient;
import clinic.employees.Doctor;
import clinic.resources.Appointment;

/**
 *
 * @author biaav
 */
public class Clinic {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        Secretary sec1 = new Secretary("Marrie", "001");
        Secretary sec2 = new Secretary("Joanna", "002");

        Doctor doctor = new Doctor("Dr. Daniel", "999.999-99", "001");
       // Patient p1 = dao.createPatient("Cherrie", "123456");
       AppointmentDAO apptDao = new AppointmentDAO();
       AppointmentRecordDAO apptRecDao = new AppointmentRecordDAO();
       
       
       //Criação do paciente
        Patient p1 = sec1.createPatient("Cherrie", "123456", "01/01/2000", "Rua Azul, 10", "111111111", "cherrie@email", "private");
        System.out.println("Paciente 1: " + p1.getName());
        
        //Atualização do paciente
        sec1.updatePatient(p1, "Sage", "654320", "01/01/2000", "Rua Azul, 10", "111111111", "sage@email", "private");
        System.out.println("Paciente 1: " + p1.getName());
                
         //Exclusão do paciente
        sec1.deletePatient(p1);
        System.out.println("Paciente 1: " + p1.getName());
        
        
      
        //Criação do paciente necessário ao agendamento
        Patient p2 = sec1.createPatient("Cherrie", "123456", "01/01/2000", "Rua Azul, 10", "111111111", "cherrie@email", "private");

    
        //Criação do agendamento
        Appointment appt1 = apptDao.createAppointment("03/05/2022", "14h00min", doctor, p2, Visit.REGULAR);
        System.out.println("Agendamento: "+ appt1.getDay() + ' ' + appt1.getHour() + ' ' + appt1.getDoctor().getName() + ' ' + appt1.getPatient().getName() + ' ' + appt1.getVisit());
        
        //Atualização do agendamento
        apptDao.updateAppointment(appt1, "30/05/2022", "18h00min", doctor, p2, Visit.RETURN);
        System.out.println("Agendamento: "+ appt1.getDay() + ' ' + appt1.getHour() + ' ' + appt1.getDoctor().getName() + ' ' + appt1.getPatient().getName() + ' ' + appt1.getVisit());
        
        //Exclusão do agendamento
        apptDao.deleteAppointment(appt1);
        System.out.println("Agendamento: "+ appt1.getDay() + ' ' + appt1.getHour() + ' ' + appt1.getDoctor() + ' ' + appt1.getPatient());

    
        
        //Criação do agendamento necessario a consulta
         Appointment appt2 = apptDao.createAppointment("03/05/2022", "14h00min", doctor, p2, Visit.REGULAR);
        
         //Consulta de relatorio de consulta
         String apptRec = apptRecDao.getAppointment(appt2);
         System.out.println("Relatorio de consulta: " + apptRec);
    
         
 
        MessageDAO msgDao = new MessageDAO();
        
        //Enviando mensagens para paciente
        msgDao.sendMessage(p2, "Você tem uma consulta agendada. " + apptRec);
    }
    
}