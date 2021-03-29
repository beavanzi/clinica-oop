/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinic.employees;

import clinic.dao.AppointmentDAO;
import clinic.dao.PatientDAO;


/**
 *
 * @author biaav
 */
public class Secretary extends PatientDAO {
    private String secName;
    private String secId;
    private AppointmentDAO dao2;
    private PatientDAO dao1;

    public Secretary() {
    }

    public Secretary(String secName, String secId) {
        this.secName = secName;
        this.secId = secId;
    }

    public String getSecName() {
        return secName;
    }

    public void setSecName(String secName) {
        this.secName = secName;
    }

    public String getSecId() {
        return secId;
    }

    public void setSecId(String secId) {
        this.secId = secId;
    }
    
    
    
    
}
