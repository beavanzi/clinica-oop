/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinic.employees;

/**
 *
 * @author biaav
 */
public class Doctor {
    private String name;
    private String doctorDoc;
    private String id;

    public Doctor() {
    }

    public Doctor(String name, String doctorDoc, String id) {
        this.name = name;
        this.doctorDoc = doctorDoc;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDoctorDoc() {
        return doctorDoc;
    }

    public void setDoctorDoc(String doctorDoc) {
        this.doctorDoc = doctorDoc;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
   
    
}
