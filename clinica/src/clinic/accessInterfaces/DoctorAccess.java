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
        System.out.println("10. Gerar relatorio de médico");
        System.out.println("11. Consultar Receita");
        System.out.println("12. Consultar Atestado");
        System.out.println("13. Consultar Acompanhamento");
        System.out.println("14. Criar atendimento");
        System.out.println("15. Atualizar atendimento");
        System.out.println("16. Deletar atendimento");
        System.out.println("17. Listar atendimentos");
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
            case 10:
                System.out.println("Operação 10 médico");
                break; 
            case 11:
                System.out.println("Operação 11 médico");
                break; 
            case 12:
                System.out.println("Operação 12 médico");
                break;
            case 13:
                System.out.println("Operação 13 médico");
                break; 
            case 14:
                System.out.println("Operação 14 médico");
                break; 
            case 15:
                System.out.println("Operação 15 médico");
                break; 
            case 16:
                System.out.println("Operação 16 médico");
                break; 
            case 17:
                System.out.println("Operação 17 médico");
                break; 
            default:
                System.out.println("Saindo...");
                break;
        }
    }
}
