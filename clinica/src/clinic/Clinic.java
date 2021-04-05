/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinic;


import clinic.accessInterfaces.AccessInterface;
import clinic.accessInterfaces.DoctorAccess;
import clinic.accessInterfaces.SecretaryAccess;
import clinic.services.Messenger;
import java.util.Scanner;

/**
 *
 * @author biaav
 */
public class Clinic {

    /**
     * @param args the command line arguments
     */
    public static int initialOptions() {
        
        Scanner scan = new Scanner(System.in);
        int opt;
        
        do {
            System.out.println("------CLINICA SANTA MONICA------\n");
            System.out.println("\nSelecione uma opção:\n");
            System.out.println("[1] - Acessar sistema Secretário");
            System.out.println("[2] - Acessar sistema Médico");
            System.out.println("[3] - Enviar Mensagens de Agendamentos");
            System.out.println("[100] - Sair\n");

            
            System.out.print("> ");
            opt = scan.nextInt();
        } while (opt != 1 && opt != 2 && opt !=3 && opt!=100);
        
        return opt;   
    }
    
    public static void main(String[] args) {
        
        
        Global.daoDoc.createDoctor("Daniel", "999.999-99", "001");
        Global.daoDoc.createDoctor("Manoel", "999.888-77", "002");
        Global.daoPat.createPatient("Cherrie", "1111", "111", "111", "444-444", "", "particular");
        Global.daoPat.createPatient("Emillie", "1111", "111", "111", "", "email@email", "particular");
        Global.daoPat.createPatient("Marrie", "1111", "111", "111", "", "", "particular");
        
        Global.daoPat.getAllPatientsWithComunications();
        Global.daoPat.getAllPatientsWithoutComunications();
        
        Scanner scan = new Scanner(System.in);
        Messenger messenger = new Messenger();
        AccessInterface accInterface = null;
        int option = initialOptions();
        
        switch(option){
            case 1:
                accInterface = new SecretaryAccess();
                break;
            case 2:
                accInterface = new DoctorAccess();
                break;
            case 3:
                messenger.sendMessage();
                break;
            case 100:
                System.out.println("\n\nSaindo...");
                System.exit(0);
                break; 
            default:
                System.out.println("\n\nSaindo...");
                System.exit(0);
                break;        
        }
        
        while (option != 100) {
            accInterface.listAllOperations();
            option = scan.nextInt();
            accInterface.mapping(option);
            if (option == 0) {
                option = initialOptions();
                switch(option){
                    case 1:
                        accInterface = new SecretaryAccess();
                        break;
                    case 2:
                        accInterface = new DoctorAccess();
                        break;
                    case 3:
                        messenger.sendMessage();
                        break;
                    case 100:
                        System.out.println("\n\nSaindo...");
                        System.exit(0);
                        break; 
                    default:
                        System.out.println("\n\nSaindo...");
                        System.exit(0);
                        break;        
                }
            }            
        }
        
        
    }
    
}