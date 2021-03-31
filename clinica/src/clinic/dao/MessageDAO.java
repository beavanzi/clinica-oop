/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinic.dao;

import clinic.dao.interfaces.InterfaceMessageDAO;
import clinic.external.Patient;


/**
 *
 * @author biaav
 */
public class MessageDAO implements InterfaceMessageDAO {

    @Override
    public void sendMessage(Patient pat, String message) {
        String subjectEmail = pat.getEmail();
        String subjectPhone = pat.getPhone();
        String msg = message;

        
        if (!subjectEmail.isEmpty()){
            System.out.println("Enviando e-mail para " + subjectEmail + " com assunto: " + msg);
        }
        
        if (!subjectPhone.isEmpty()){
            System.out.println("Enviando SMS para " + subjectPhone + " com assunto: " + msg);
        }
        
    }
    
}
