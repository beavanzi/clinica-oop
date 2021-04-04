/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinic.accessInterfaces;


import clinic.employees.Doctor;
import clinic.employees.Secretary;
import clinic.external.Patient;
import clinic.resources.Appointment;
import java.util.ArrayList;
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
        System.out.println("5. Encontrar paciente pelo nome");
        System.out.println("6. Agendar Consulta");
        System.out.println("7. Atualizar Consulta");
        System.out.println("8. Cancelar Consulta");
        System.out.println("9. Listar todas as consultas");
        System.out.println("10. Gerar relatorio de consulta");
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
       Appointment appt;
        
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
                System.out.println("<--Listar todos os pacientes-->\n");
                
                ArrayList<Patient> patients = sec.getAllPatients();
                patients.forEach(pat -> System.out.println(pat));
                
                break;
            case 5:
                System.out.println("<--Encontrar paciente pelo nome-->");
                System.out.print("Digite o nome do paciente: > ");
                searchName = scan.nextLine();
                patient = sec.getPatientByName(searchName);
                
                if (patient != null){
                    System.out.println(patient.getName() + ' ' + patient.getBirthDate() + ' ' + patient.getDocNumber() + ' ' + patient.getPhone() + ' ' + patient.getEmail() + ' ' + patient.getAddress() + ' ' + patient.getHealthInsurance());
                } else {
                    System.out.println("Paciente não encontrado");
                }
                break;
            case 6:
                System.out.println("<--Criação de Agendamento-->");
                
                System.out.println("Informe: \nDia:");
                day = scan.nextLine();
                System.out.print("Horário: ");
                hour = scan.nextLine();
                System.out.print("Nome doutor: ");
                docName = scan.nextLine();
                System.out.print("Nome paciente: ");
                patName = scan.nextLine();
                System.out.print("Tipo de visita: (Regular, Retorno)");
                visit = scan.nextLine();

                patient = sec.getPatientByName(patName);
                if (patient == null) {
                    System.out.println("Paciente não encontrado");
                    break;
                }
                doctor = sec.getDoctorByName(docName);
                if (doctor == null){
                   System.out.println("Doutor não encontrado");
                   break;
                }

                sec.createAppointment(day, hour, doctor, patient, visit);
                
                break;
            case 7:
                System.out.println("<--Atualização de Agendamento-->");
                System.out.print("Digite o nome do paciente: > ");
                searchName = scan.nextLine();
                appt = sec.getAppointmentByDay(searchName);
                
                if (appt != null){
                    System.out.println("Informe novos dados: \nDia:");
                    day = scan.nextLine();
                    System.out.print("Horário: ");
                    hour = scan.nextLine();
                    System.out.print("Nome doutor: ");
                    docName = scan.nextLine();
                    System.out.print("Nome paciente: ");
                    patName = scan.nextLine();
                    System.out.print("Tipo de visita: (Regular, Retorno)");
                    visit = scan.nextLine();
                    
                    patient = sec.getPatientByName(patName);
                    if (patient == null) {
                        System.out.println("Paciente não encontrado");
                        break;
                    }
                    doctor = sec.getDoctorByName(docName);
                    if (doctor == null){
                       System.out.println("Doutor não encontrado");
                       break;
                    }
                    
                    sec.updateAppointment(appt, day, hour, doctor, patient, visit);
                } else {
                    System.out.println("Agendamento não encontrado");
                }

                break;
            case 8:
                System.out.println("<--Remoção de Agendamento-->");
                System.out.print("Digite o nome do paciente: > ");
                searchName = scan.nextLine();
                appt = sec.getAppointmentByDay(searchName);
                
                if (appt != null){
                   sec.deleteAppointment(appt);
                } else {
                   System.out.println("Agendamento não encontrado");
                }
                break;  
            case 9:
                System.out.println("<--Listar todos os agendamentos-->\n");
                
                ArrayList<Appointment> appts = sec.getAllAppointments();
                appts.forEach(app -> System.out.println(app));
            default:
                System.out.println("Saindo...");
                break;
        }
    }
    
}
