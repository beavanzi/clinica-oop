/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinic.dao.interfaces;

import clinic.employees.Doctor;

/**
 *
 * @author biaav
 */
public interface InterfaceDoctorDAO {
     void createDoctor(String name, String doctorDoc, String id);
     Doctor getDoctorByName(String searchParam);
}
