/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinic.external;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author biaav
 */

@Entity
public class Patient {
    @Id @GeneratedValue(strategy  = GenerationType.AUTO)
    private Integer id; 
    @Column (name="name", length=100, nullable=false, unique=true)
    private String name;
    @Column (name="docnumber", length=17, nullable=false, unique=true)
    private String docNumber;
    @Column (name="birthdate", length=11, nullable=false, unique=false)
    private String birthDate;
    @Column (name="address", length=100, nullable=false, unique=false)
    private String address;
    private String phone;
    private String email;
    @Column (name="healthinsurance", length=100, nullable=false, unique=false)
    private String healthInsurance;
    
    
    public Patient() {
    }

    public Patient(String name, String docNumber, String birthDate, String address, String phone, String email, String healthInsurance) {
        this.name = name;
        this.docNumber = docNumber;
        this.birthDate = birthDate;
        this.address = address;
        this.phone = phone;
        this.email = email;
        this.healthInsurance = healthInsurance;
    }
    
    public Integer getId(){
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDocNumber() {
        return docNumber;
    }

    public void setDocNumber(String docNumber) {
        this.docNumber = docNumber;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getHealthInsurance() {
        return healthInsurance;
    }

    public void setHealthInsurance(String healthInsurance) {
        this.healthInsurance = healthInsurance;
    }
    
}
