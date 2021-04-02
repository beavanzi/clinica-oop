/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinic;


import clinic.accessInterfaces.AccessInterface;
import clinic.accessInterfaces.DoctorAccess;
import clinic.accessInterfaces.SecretaryAccess;
import clinic.employees.Secretary;
import clinic.employees.Doctor;
import java.util.Scanner;

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
        
        
        Scanner scan = new Scanner(System.in);
        int opt;

        do {
            System.out.println("------CLINICA SANTA MONICA------\n");
            System.out.println("\nSelecione seu tipo de acesso:\n");
            System.out.println("Secretário.");
            System.out.println("Médico\n");
            System.out.print("> ");
            opt = scan.nextInt();
        } while (opt != 1 && opt != 2);
        
        
        AccessInterface accInterface = null;
        
        switch(opt){
            case 1:
                accInterface = new SecretaryAccess();
                break;
            case 2:
                accInterface = new DoctorAccess();
                break;
            default:
                System.out.println("\n\nSaindo...");
                System.exit(0);
                break;        
        }
       
        
        do {
            accInterface.listAllOperations();
            opt = scan.nextInt();
            accInterface.mapping(opt);
        } while (opt != 0);
    }
    
}