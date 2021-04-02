/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinic.accessInterfaces;

/**
 *
 * @author biaav
 */
public class DoctorAccess implements AccessInterface {
    
    @Override
    public void listAllOperations() {
        System.out.println("------MÉDICO------");
        System.out.println("1. Criar Paciente");
        System.out.println("2. Atualizar Paciente");
        System.out.println("3. Remover Paciente");
        System.out.println("4. Listar todos os pacientes");
        System.out.println("5. Agendar Consulta");
        System.out.println("6. Atualizar Consulta");
        System.out.println("7. Cancelar Consulta");
        System.out.println("8. Listar todas as consultas");
        System.out.println("9. Gerar relatorio de consulta");
        System.out.print("> "); 
    }

    @Override
    public void mapping(int operation) {
        switch (operation) {
            case 1:
                System.out.println("Operação 1 médico");
                break;
            case 2:
                System.out.println("Operação 2 médico");
                break;
            case 3:
                System.out.println("Operação 3 médico");
                break;
            case 4:
                System.out.println("Operação 4 médico");
                break;
            case 5:
                System.out.println("Operação 5 médico");
                break;
            case 6:
                System.out.println("Operação 6 médico");
                break;
            case 7:
                System.out.println("Operação 7 médico");
                break;
            case 8:
                System.out.println("Operação 8 médico");
                break;
            case 9:
                System.out.println("Operação 9 médico");
                break;              
            default:
                System.out.println("Saindo...");
                break;
        }
    }
}
