/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinic.dao;

import clinic.dao.interfaces.InterfaceDoctorDAO;
import clinic.employees.Doctor;
import java.util.ArrayList;

/**
 *
 * @author biaav
 */
public class DoctorDAO implements InterfaceDoctorDAO{
    private static ArrayList<Doctor> doctors;

    public DoctorDAO() {
        this.doctors = new ArrayList();
    }

    @Override
    public void createDoctor(String name, String doctorDoc, String id) {
        Doctor doctor = new Doctor();
        doctors.add(doctor);
    }

    @Override
    public Doctor getDoctorByName(String searchParam) {
       for (int i = 0; i <= doctors.size(); i++) {
        Doctor doc = doctors.get(i);
        
        if (searchParam.equals(doc.getName())) 
            return doc;
       }
      
      return null;
    }

}
