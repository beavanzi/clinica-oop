/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinic.accessInterfaces;

import clinic.employees.Secretary;
import clinic.external.Patient;
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
       String name;
       String docNumber;
       String birthDate;
       String address;
       String phone;
       String email;
       String healthInsurance;
       String searchName;
       Patient patient;
        
        switch (operation) {
            case 1:
                System.out.println("<--Criação de Paciente-->");
                
                System.out.println("Informe: \nNome:");
                name = scan.nextLine();
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
                
                sec.createPatient(name, docNumber, birthDate, address, phone, email, healthInsurance);
                
                break;
            case 2:
                System.out.println("<--Atualização de Paciente-->");
                System.out.print("Digite o nome do paciente: > ");
                searchName = scan.nextLine();
                patient = sec.getPatientByName(searchName);
                
                if (patient != null){
                    System.out.print("\nNome: ");
                    name = scan.nextLine();
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
                
                sec.updatePatient(patient, name, docNumber, birthDate, address, phone, email, healthInsurance);
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
                System.out.println("Operação 7 secretária");
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
