/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinic.dao;

import clinic.dao.interfaces.InterfaceMessageDAO;
import clinic.resources.Appointment;
import java.util.ArrayList;


/**
 *
 * @author biaav
 */
public class MessageDAO implements InterfaceMessageDAO {

    @Override
    public void sendMessage(ArrayList<Appointment> appointments) {
        if (appointments.size() > 0) {
          for(int i = 0; i < appointments.size(); i++){
              Appointment appt = appointments.get(i);
              
              if (!appt.getPatient().getEmail().isEmpty()){
                  System.out.println("Enviando email para " + appt.getPatient().getEmail() + ", paciente " + appt.getPatient().getName() + ". Ele/a tem consulta amanhã.");
              }
              
              if (!appt.getPatient().getPhone().isEmpty()){
                  System.out.println("Enviando SMS para " + appt.getPatient().getPhone() + ", paciente " + appt.getPatient().getName() + ". Ele/a tem consulta amanhã.");
              }
          } 
       }  
    }
    
}
