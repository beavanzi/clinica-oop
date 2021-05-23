/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinic.resources;
import clinic.external.Patient;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

/**
 *
 * @author sarahanduca
 */

@Entity
public class AditionalInfo {
    @Id @GeneratedValue(strategy  = GenerationType.AUTO)
    private Integer id; 
    private String badHabit;
    private String allergy;
    private String surgery;
    @OneToOne
    private Patient patient;

    public AditionalInfo(String badHabit, String allergy, String surgery, Patient patient) {
        this.badHabit = badHabit;
        this.allergy = allergy;
        this.surgery = surgery;
        this.patient = patient;
    }

    public String getBadHabit() {
        return badHabit;
    }

    public String getAllergy() {
        return allergy;
    }

    public String getSurgery() {
        return surgery;
    }

    public void setBadHabit(String badHabit) {
        this.badHabit = badHabit;
    }

    public void setAllergy(String allergy) {
        this.allergy = allergy;
    }

    public void setSurgery(String surgery) {
        this.surgery = surgery;
    }

    public String getPatient() {
        return patient.getName();
    }
    
    
    
}
