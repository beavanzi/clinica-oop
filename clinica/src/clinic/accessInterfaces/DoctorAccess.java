/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinic.accessInterfaces;
import clinic.employees.Doctor;
import clinic.external.Patient;
import clinic.resources.Attendance;
import clinic.resources.MedicalRecord;
import clinic.resources.AditionalInfo;
import clinic.resources.PatientRecord;
import java.util.ArrayList;
import java.util.Scanner;


/**
 *
 * @author biaav
 */
public class DoctorAccess implements AccessInterface {
     private Doctor doc;

    public DoctorAccess() {
        this.doc = new Doctor();
    }
    
    @Override
    public void listAllOperations() {
        System.out.println("------MÉDICO------");
        System.out.println("1. Criar Dado Adicional de Paciente");
        System.out.println("2. Atualizar Dado Adicional de Paciente");
        System.out.println("3. Remover Dado Adicional de Paciente");
        System.out.println("4. Listar todos os pacientes");
        System.out.println("5. Criar prontuário");
        System.out.println("6. Atualizar prontuário");
        System.out.println("7. Remover prontuário");
        System.out.println("8. Gerar relatorio de médico");
        System.out.println("9. Consultar Receita");
        System.out.println("10. Consultar Atestado");
        System.out.println("11. Consultar Acompanhamento");
        System.out.println("12. Criar Atendimento");
        System.out.println("13. Atualizar Atendimento");
        System.out.println("14. Deletar Atendimento");
        System.out.println("15. Listar Atendimentos");
        System.out.print("> "); 
    }

    @Override
    public void mapping(int operation) {
       Scanner scan = new Scanner(System.in);
       AditionalInfo adInfo;
       String searchName;
       int day;
       int month;
       String symptoms;
       String diagnosis;
       String treatment;
       String badHabit;
       String surgery;
       String allergy;
       String prescription;
       String attestation;
       String followUp;
       String docName; 
       String patName;
       Patient patient;
       Doctor doctor;
       Attendance att;
       MedicalRecord medRec;
       PatientRecord patRec;
    
        switch (operation) {
            case 1:
                System.out.println("<--Criação do Dado Adicional do Paciente-->");
                
                System.out.println("\nInforme o nome do paciente desejado: ");
                searchName = scan.nextLine();
                patient = doc.getPatientByName(searchName);
                
                if (patient != null){
                    System.out.println("Digite a alergia: ");
                    allergy = scan.nextLine();
                    System.out.println("Digite o mau hábito: ");
                    badHabit = scan.nextLine();
                    System.out.println("Digite a cirurgia: ");
                    surgery = scan.nextLine();
                    
                    doc.createAditionalInfo(badHabit, allergy, surgery, patient);
                }else{
                    System.out.println("Paciente não encontrado.");
                }
           
                break;
            case 2:
                System.out.println("<--Atualização do Dado Adicional do Paciente-->");
                
                System.out.println("\nInforme o nome do paciente desejado: ");
                searchName = scan.nextLine();
                adInfo = doc.getAdidionalInfoByPatient(searchName);
                
                  if (adInfo != null){
                    System.out.println("Digite a alergia: ");
                    allergy = scan.nextLine();
                    System.out.println("Digite o mau hábito: ");
                    badHabit = scan.nextLine();
                    System.out.println("Digite a cirurgia: ");
                    surgery = scan.nextLine();
                    
                    doc.updateAditionalInfo(adInfo, badHabit, allergy, surgery);
                }else{
                    System.out.println("Paciente não encontrado.");
                }
                
                break;
            case 3:
                System.out.println("<--Remoção do Dado Adicional do Paciente-->");
                
                System.out.println("\nInforme o nome do paciente desejado: ");
                searchName = scan.nextLine();
                adInfo = doc.getAdidionalInfoByPatient(searchName);
                  if (adInfo != null){
                      
                    doc.deleteAditionalInfo(adInfo);
                }else{
                    System.out.println("Paciente não encontrado.");
                }
                break;
            case 4:
                 System.out.println("<--Listar todos os pacientes-->\n");
                
                ArrayList<Patient> patients = doc.getAllPatients();
                patients.forEach(pat -> System.out.println(pat));
                
                break;
            case 5:
                 System.out.println("<--Criação Prontuário de Paciente-->");
                
                System.out.println("\nInforme o nome do paciente desejado: ");
                searchName = scan.nextLine();
                patient = doc.getPatientByName(searchName);
                
                if (patient != null){
                    System.out.println("Digite o sintoma: ");
                    symptoms = scan.nextLine();
                    System.out.println("Digite o diagnóstico da doença: ");
                    diagnosis = scan.nextLine();
                    System.out.println("Digite a prescrição de tratamento: ");
                    treatment = scan.nextLine();
                    
                    doc.createPatientRecord(symptoms, diagnosis, treatment, patient);
                }else{
                    System.out.println("Paciente não encontrado.");
                }
           
                break;
            case 6:
                System.out.println("<--Atualização do Prontuário do Paciente-->");
                
                System.out.println("\nInforme o nome do paciente desejado: ");
                searchName = scan.nextLine();
                patRec = doc.getPatientRecord(searchName);
                
                  if (patRec != null){
                    System.out.println("Digite o sintoma: ");
                    symptoms = scan.nextLine();
                    System.out.println("Digite o diagnóstico da doença: ");
                    diagnosis = scan.nextLine();
                    System.out.println("Digite a prescrição de tratamento: ");
                    treatment = scan.nextLine();
                    
                    doc.updatePatientRecord(patRec, symptoms, diagnosis, treatment);
                }else{
                    System.out.println("Paciente não encontrado.");
                }
                break;
            case 7:
                System.out.println("<--Remoção do Prontuário do Paciente-->");
                
                System.out.println("\nInforme o nome do paciente desejado: ");
                searchName = scan.nextLine();
                patRec = doc.getPatientRecord(searchName);
                  if (patRec != null){
                      
                    doc.deletePatientRecord(patRec);
                }else{
                    System.out.println("Paciente não encontrado.");
                }
                break;
            case 8:
                System.out.println("<--Gerar Relatório Médico-->");
                
                System.out.println("Informe: \nReceita Médica:");
                prescription = scan.nextLine();
                System.out.print("Atestado Médico: ");
                attestation = scan.nextLine();
                System.out.print("Acompanhamento Médico: ");
                followUp = scan.nextLine();
                System.out.print("Nome do Paciente: ");
                patName = scan.nextLine();
                System.out.print("Nome do Médico: ");
                docName = scan.nextLine();
               
                patient = doc.getPatientByName(patName);
                 if (patient == null) {
                        System.out.println("Paciente não encontrado");
                        break;
                }
                doctor = doc.getDoctorByName(docName);
                if (doctor == null){
                    System.out.println("Doutor não encontrado");
                    break;
                }
                doc.createMedicalRecord(prescription, attestation, followUp, doctor, patient);
                
                
                break;
            case 9:
            System.out.println("<--Consultar Receita Médica-->");
                
                System.out.println("<--Atualização de Agendamento-->");
                System.out.print("Digite o nome do paciente: > ");
                searchName = scan.nextLine();
                medRec = doc.getMedicalRecord(searchName);
               
                patient = doc.getPatientByName(patName);
                if (patient == null) {
                    System.out.println("Paciente não encontrado");
                    break;
                }
                doctor = doc.getDoctorByName(docName);
                if (doctor == null){
                    System.out.println("Doutor não encontrado");
                    break;
                }
                 
                doc.getPrescription(medRec);
                break;   
            case 10:
                System.out.println("Operação 10 médico");
                break; 
            case 11:
                System.out.println("Operação 11 médico");
                break; 
            case 12:
                System.out.println("<--Criação de Atendimento-->");
                
                System.out.println("Informe: \nDia:");
                day = scan.nextInt();
                System.out.print("Mês: ");
                month = scan.nextInt();
                System.out.print("Nome doutor: ");
                docName = scan.nextLine();
                System.out.print("Nome paciente: ");
                patName = scan.nextLine();

                patient = doc.getPatientByName(patName);
                if (patient == null) {
                    System.out.println("Paciente não encontrado");
                    break;
                }
                doctor = doc.getDoctorByName(docName);
                if (doctor == null){
                   System.out.println("Doutor não encontrado");
                   break;
                }

                doc.createAttendance(day, month, patient, doctor);
                
                break;
            case 13:
                System.out.println("<--Atualização de Atendimento-->");
                System.out.print("Digite o nome do médico: > ");
                searchName = scan.nextLine();
                att = doc.getAttendanceByDay(searchName);
                
                if (att != null){
                    System.out.println("Informe novos dados: \nDia:");
                    day = scan.nextInt();
                    System.out.print("Mês: ");
                    month = scan.nextInt();
                    System.out.print("Nome doutor: ");
                    docName = scan.nextLine();
                    System.out.print("Nome paciente: ");
                    patName = scan.nextLine();
                   
                    patient = doc.getPatientByName(patName);
                    if (patient == null) {
                        System.out.println("Paciente não encontrado");
                        break;
                    }
                    doctor = doc.getDoctorByName(docName);
                    if (doctor == null){
                       System.out.println("Doutor não encontrado");
                       break;
                    }
                    
                    doc.updateAttendance(att, day, month, patient, doctor);
                } else {
                    System.out.println("Agendamento não encontrado");
                }

                
                break; 
            case 14:
                System.out.println("<--Remoção de Atendimento-->");
                System.out.print("Digite o nome do médico: > ");
                searchName = scan.nextLine();
                att = doc.getAttendanceByDay(searchName);
                
                if (att != null){
                   doc.deleteAttendance(att);
                } else {
                   System.out.println("Atendimento não encontrado");
                }
                break; 
            case 15:
                System.out.println("<--Listar todos os Atendimentos-->\n");
                
                ArrayList<Attendance> atts = doc.getAllAttendances();
                atts.forEach(atten -> System.out.println(atten));
                break; 
     
            default:
                System.out.println("Saindo...");
                break;
        }
    }
}
