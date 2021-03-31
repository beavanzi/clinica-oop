/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinic.dao.interfaces;

import clinic.external.Patient;


/**
 *
 * @author biaav
 */
public interface InterfaceMessageDAO {
    void sendMessage(Patient pat, String message);
}
