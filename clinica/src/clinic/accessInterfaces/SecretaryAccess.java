/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinic.accessInterfaces;


import clinic.employees.Doctor;
import clinic.employees.Secretary;
import clinic.external.Patient;
import java.util.Scanner;

/**
 *
 * @author biaav
 */
public class SecretaryAccess implements AccessInterface {
    private Secretary sec;

    public SecretaryAccess() {
        this.sec = new Secretary();
    }
    
    @Override
    public void listAllOperations() {
        System.out.println("------SECRETÁRIA------");
        System.out.println("1. Criar Paciente");
        System.out.println("2. Atualizar Paciente");
        System.out.println("3. Remover Paciente");
        System.out.println("4. Listar todos os pacientes");
        System.out.println("6. Encontrar paciente pelo nome");
        System.out.println("7. Agendar Consulta");
        System.out.println("8. Atualizar Consulta");
        System.out.println("9. Cancelar Consulta");
        System.out.println("10. Listar todas as consultas");
        System.out.println("11. Gerar relatorio de consulta");
        System.out.print("> "); 
    }

    @Override
    public void mapping(int operation) {
       Scanner scan = new Scanner(System.in);
       String patName;
       String docNumber;
       String birthDate;
       String address;
       String phone;
       String email;
       String healthInsurance;
       String searchName;
       String day;
       String hour;
       String visit;
       String docName; 
       Patient patient;
       Doctor doctor;
        
        switch (operation) {
            case 1:
                System.out.println("<--Criação de Paciente-->");
                
                System.out.println("Informe: \nNome:");
                patName = scan.nextLine();
                System.out.print("Numero de documento: ");
                docNumber = scan.nextLine();
                System.out.print("Data de nascimento: ");
                birthDate = scan.nextLine();
                System.out.print("Endereço (rua, numero, cidade - uf): ");
                address = scan.nextLine();
                System.out.print("Telefone: ");
                phone = scan.nextLine();
                System.out.print("Email: ");
                email = scan.nextLine();
                System.out.print("Convênio: ");
                healthInsurance = scan.nextLine();
                
                sec.createPatient(patName, docNumber, birthDate, address, phone, email, healthInsurance);
                
                break;
            case 2:
                System.out.println("<--Atualização de Paciente-->");
                System.out.print("Digite o nome do paciente: > ");
                searchName = scan.nextLine();
                patient = sec.getPatientByName(searchName);
                
                if (patient != null){
                    System.out.print("\nNome: ");
                    patName = scan.nextLine();
                    System.out.print("Numero de documento: ");
                    docNumber = scan.nextLine();
                    System.out.print("Data de nascimento: ");
                    birthDate = scan.nextLine();
                    System.out.print("Endereço (rua, numero, cidade - uf): ");
                    address = scan.nextLine();
                    System.out.print("Telefone: ");
                    phone = scan.nextLine();
                    System.out.print("Email: ");
                    email = scan.nextLine();
                    System.out.print("Convênio: ");
                healthInsurance = scan.nextLine();
                
                sec.updatePatient(patient, patName, docNumber, birthDate, address, phone, email, healthInsurance);
                } else {
                    System.out.println("Paciente não encontrado");
                }
                break;
            case 3:
                System.out.println("<--Remoção de Paciente-->");
                System.out.print("Digite o nome do paciente: > ");
                searchName = scan.nextLine();
                patient = sec.getPatientByName(searchName);
                
                if (patient != null){
                    sec.deletePatient(patient);
                } else {
                    System.out.println("Paciente não encontrado");
                }
                break;
            case 4:
                
                break;
            case 5:
                System.out.println("Operação 5 secretária");
                break;
            case 6:
                System.out.println("Operação 6 secretária");
                break;
            case 7:
               System.out.println("<--Criação de Agendamento-->");
                
                System.out.println("Informe: \nDia:");
                day = scan.nextLine();
                System.out.print("Horário: ");
                hour = scan.nextLine();
                System.out.print("Nome doutor: ");
                docName = scan.nextLine();
                System.out.print("Nome paciente: ");
                patName = scan.nextLine();
                System.out.print("Tipo de visita: (Regular, Return)");
                visit = scan.nextLine();
                
                Visit vis = visit.toUpperCase();
                patient = sec.getPatientByName(patName);
                doctor = sec.getDoctorByName(docName);

                sec.createAppointment(day, hour, doctor, patient, visit.toUpperCase());
                
                break;
            case 8:
                System.out.println("Operação 8 secretária");
                break;
            case 9:
                System.out.println("Operação 9 secretária");
                break;              
            default:
                System.out.println("Saindo...");
                break;
        }
    }
    
}
