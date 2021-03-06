/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinic.view;

import clinic.Global;
import clinic.view.docPages.UpdateMedicalRecord;
import clinic.view.docPages.UpdateAditionalPatientDataPage;
import clinic.view.docPages.UpdatePatientRecordPage;
import clinic.view.secPages.UpdateAppointmentPage;
import clinic.view.secPages.UpdatePatientPage;
import clinic.view.secPages.CreatePatientPage;
import clinic.view.secPages.CreateAppointmentPage;
import clinic.view.docPages.CreatePatientRecordPage;
import clinic.view.docPages.CreateAditionalPatientDataPage;
import clinic.view.docPages.CreateMedicalRecordPage;
import clinic.external.Patient;
import clinic.employees.Doctor;
import clinic.employees.Secretary;
import clinic.resources.PatientRecord;
import clinic.resources.AditionalInfo;
import clinic.resources.Appointment;
import clinic.resources.MedicalRecord;
import clinic.view.secPages.GenerateNextDayReports;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.util.List;

/**
 *
 * @author sarahanduca
 */
public class MainPage extends javax.swing.JFrame {
    private Doctor doc;
    private Secretary sec;
    private PatientRecord patRec;
    /**
     * Creates new form MainPage
     */
    public MainPage() {
        initComponents();
        this.doc = new Doctor();
        this.sec = new Secretary();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        relatorioAgendamentosMenu = new javax.swing.JMenu();
        criarPacienteEscolhaMenu = new javax.swing.JMenuItem();
        atualizarPacienteEscolhaMenu = new javax.swing.JMenuItem();
        removerPacienteEscolhaMenu = new javax.swing.JMenuItem();
        criarAgendamentoEscolhaMenu = new javax.swing.JMenuItem();
        atualizarAgendamentoEscolhaMenu = new javax.swing.JMenuItem();
        relatorioAgendamentoEscolhaMenu = new javax.swing.JMenuItem();
        cancelarAgendamentoEscolhaMenu = new javax.swing.JMenuItem();
        medicoMenu = new javax.swing.JMenu();
        criarDadoAdicionalEscolhaMenu = new javax.swing.JMenuItem();
        atualizarDadoAdicionalEscolhaMenu = new javax.swing.JMenuItem();
        removerDadoAdcicionalEscolhaMenu = new javax.swing.JMenuItem();
        criarRelatorioMedicoEscolhaMenu = new javax.swing.JMenuItem();
        listarRelatoriosMedicosEscolhaMenu = new javax.swing.JMenuItem();
        criarPronturarioEscolhaMenu = new javax.swing.JMenuItem();
        atualizarProntuarioEscolhaMenu = new javax.swing.JMenuItem();
        removerProntuarioEscolhaMenu = new javax.swing.JMenuItem();
        agendamentoMenu = new javax.swing.JMenu();
        enviarSMSEmail = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 975, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 504, Short.MAX_VALUE)
        );

        relatorioAgendamentosMenu.setText("Secret??rio");

        criarPacienteEscolhaMenu.setText("Criar Paciente");
        criarPacienteEscolhaMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                criarPacienteEscolhaMenuActionPerformed(evt);
            }
        });
        relatorioAgendamentosMenu.add(criarPacienteEscolhaMenu);

        atualizarPacienteEscolhaMenu.setText("Atualizar Paciente");
        atualizarPacienteEscolhaMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atualizarPacienteEscolhaMenuActionPerformed(evt);
            }
        });
        relatorioAgendamentosMenu.add(atualizarPacienteEscolhaMenu);

        removerPacienteEscolhaMenu.setText("Remover Paciente");
        removerPacienteEscolhaMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removerPacienteEscolhaMenuActionPerformed(evt);
            }
        });
        relatorioAgendamentosMenu.add(removerPacienteEscolhaMenu);

        criarAgendamentoEscolhaMenu.setText("Criar Agendamento");
        criarAgendamentoEscolhaMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                criarAgendamentoEscolhaMenuActionPerformed(evt);
            }
        });
        relatorioAgendamentosMenu.add(criarAgendamentoEscolhaMenu);

        atualizarAgendamentoEscolhaMenu.setText("Atualizar Agendamento");
        atualizarAgendamentoEscolhaMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atualizarAgendamentoEscolhaMenuActionPerformed(evt);
            }
        });
        relatorioAgendamentosMenu.add(atualizarAgendamentoEscolhaMenu);

        relatorioAgendamentoEscolhaMenu.setText("Gerar Relat??rio de Agendamentos");
        relatorioAgendamentoEscolhaMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                relatorioAgendamentoEscolhaMenuActionPerformed(evt);
            }
        });
        relatorioAgendamentosMenu.add(relatorioAgendamentoEscolhaMenu);

        cancelarAgendamentoEscolhaMenu.setText("Cancelar Agendamento");
        cancelarAgendamentoEscolhaMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarAgendamentoEscolhaMenuActionPerformed(evt);
            }
        });
        relatorioAgendamentosMenu.add(cancelarAgendamentoEscolhaMenu);

        jMenuBar1.add(relatorioAgendamentosMenu);

        medicoMenu.setText("M??dico");

        criarDadoAdicionalEscolhaMenu.setText("Criar Dado Adicional Paciente");
        criarDadoAdicionalEscolhaMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                criarDadoAdicionalEscolhaMenuActionPerformed(evt);
            }
        });
        medicoMenu.add(criarDadoAdicionalEscolhaMenu);

        atualizarDadoAdicionalEscolhaMenu.setText("Atualizar Dado Adicional Paciente");
        atualizarDadoAdicionalEscolhaMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atualizarDadoAdicionalEscolhaMenuActionPerformed(evt);
            }
        });
        medicoMenu.add(atualizarDadoAdicionalEscolhaMenu);

        removerDadoAdcicionalEscolhaMenu.setText("Remover Dado Adicional Paciente");
        removerDadoAdcicionalEscolhaMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removerDadoAdcicionalEscolhaMenuActionPerformed(evt);
            }
        });
        medicoMenu.add(removerDadoAdcicionalEscolhaMenu);

        criarRelatorioMedicoEscolhaMenu.setText("Criar Relat??rio M??dico");
        criarRelatorioMedicoEscolhaMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                criarRelatorioMedicoEscolhaMenuActionPerformed(evt);
            }
        });
        medicoMenu.add(criarRelatorioMedicoEscolhaMenu);

        listarRelatoriosMedicosEscolhaMenu.setText("Listar todos os Relat??rios M??dicos");
        listarRelatoriosMedicosEscolhaMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listarRelatoriosMedicosEscolhaMenuActionPerformed(evt);
            }
        });
        medicoMenu.add(listarRelatoriosMedicosEscolhaMenu);

        criarPronturarioEscolhaMenu.setText("Criar Prontu??rio");
        criarPronturarioEscolhaMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                criarPronturarioEscolhaMenuActionPerformed(evt);
            }
        });
        medicoMenu.add(criarPronturarioEscolhaMenu);

        atualizarProntuarioEscolhaMenu.setText("Atualizar Prontu??rio");
        atualizarProntuarioEscolhaMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atualizarProntuarioEscolhaMenuActionPerformed(evt);
            }
        });
        medicoMenu.add(atualizarProntuarioEscolhaMenu);

        removerProntuarioEscolhaMenu.setText("Remover Prontu??rio");
        removerProntuarioEscolhaMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removerProntuarioEscolhaMenuActionPerformed(evt);
            }
        });
        medicoMenu.add(removerProntuarioEscolhaMenu);

        jMenuBar1.add(medicoMenu);

        agendamentoMenu.setText("Mensageria");
        agendamentoMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agendamentoMenuActionPerformed(evt);
            }
        });

        enviarSMSEmail.setText("Enviar SMS e emails");
        enviarSMSEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enviarSMSEmailActionPerformed(evt);
            }
        });
        agendamentoMenu.add(enviarSMSEmail);

        jMenuBar1.add(agendamentoMenu);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void criarPacienteEscolhaMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_criarPacienteEscolhaMenuActionPerformed
        // Criar Paciente
        CreatePatientPage patientPage = new CreatePatientPage();
        jDesktopPane1.add(patientPage);
        patientPage.setVisible(true);
        
    }//GEN-LAST:event_criarPacienteEscolhaMenuActionPerformed

    private void criarDadoAdicionalEscolhaMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_criarDadoAdicionalEscolhaMenuActionPerformed
        // criar dado adicional
        
        String searchName = JOptionPane.showInputDialog(rootPane, "Nome do Paciente para ser encontrado:");
        try {
            Patient pat = sec.getPatientByName(searchName);
            CreateAditionalPatientDataPage createAdPatientData = new CreateAditionalPatientDataPage(pat);
            jDesktopPane1.add(createAdPatientData);
            createAdPatientData.setVisible(true);
        } catch(Throwable e){
            JOptionPane.showMessageDialog(rootPane, "Erro na cria????o. Erro: " + e, "Erro", JOptionPane.ERROR_MESSAGE); 
        }
    }//GEN-LAST:event_criarDadoAdicionalEscolhaMenuActionPerformed

    private void atualizarPacienteEscolhaMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atualizarPacienteEscolhaMenuActionPerformed
        // Atualizar Paciente pelo nome:
        String searchName = JOptionPane.showInputDialog(rootPane, "Nome do Paciente para ser encontrado:");
        
        try {
            sec.getPatientByName(searchName);
            UpdatePatientPage updatePatientPage = new UpdatePatientPage(searchName);
            jDesktopPane1.add(updatePatientPage);
            updatePatientPage.setVisible(true);
        } catch(Throwable e) {
            JOptionPane.showMessageDialog(rootPane, "Erro na atualiza????o. Erro: " + e, "Erro", JOptionPane.ERROR_MESSAGE);
        }
      
    }//GEN-LAST:event_atualizarPacienteEscolhaMenuActionPerformed

    private void removerPacienteEscolhaMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removerPacienteEscolhaMenuActionPerformed
        // Remover Paciente:
        
        String searchName = JOptionPane.showInputDialog(rootPane, "Nome do Paciente para ser encontrado:");
        
        try {
            sec.deletePatient(searchName);
            JOptionPane.showMessageDialog(rootPane, "Paciente Removido com sucesso", "Remo????o", JOptionPane.INFORMATION_MESSAGE);
            this.dispose();
        } catch (Throwable e) {
            JOptionPane.showMessageDialog(rootPane, "Erro na remo????o. Erro: " + e, "Erro", JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_removerPacienteEscolhaMenuActionPerformed

    private void criarAgendamentoEscolhaMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_criarAgendamentoEscolhaMenuActionPerformed
        // criar atendimento
        CreateAppointmentPage appointmentPage = new CreateAppointmentPage();
        jDesktopPane1.add(appointmentPage);
        appointmentPage.setVisible(true);
    }//GEN-LAST:event_criarAgendamentoEscolhaMenuActionPerformed

    private void atualizarAgendamentoEscolhaMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atualizarAgendamentoEscolhaMenuActionPerformed
        // atualizar atendimento
       String searchName = JOptionPane.showInputDialog(rootPane, "Nome do Paciente para ser encontrado:");
       
        try {
            Patient pat = sec.getPatientByName(searchName);
            UpdateAppointmentPage updateAppointment = new UpdateAppointmentPage(pat.getId());
            jDesktopPane1.add(updateAppointment);
            updateAppointment.setVisible(true);
        } catch (Throwable e) {
            JOptionPane.showMessageDialog(rootPane, "Erro na atualiza????o. Erro: " + e, "Erro", JOptionPane.ERROR_MESSAGE);     
        }
        
    }//GEN-LAST:event_atualizarAgendamentoEscolhaMenuActionPerformed

    private void atualizarDadoAdicionalEscolhaMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atualizarDadoAdicionalEscolhaMenuActionPerformed
        // atualizar dado adicional       
        String searchName = JOptionPane.showInputDialog(rootPane, "Nome do Paciente para ser encontrado:");
       
        try {

            Patient pat = sec.getPatientByName(searchName);
           // AditionalInfo adInfo = doc.getAditionalInfoByPatient(pat.getId());
            UpdateAditionalPatientDataPage updateAditionalDataPage = new UpdateAditionalPatientDataPage(pat.getId());
            jDesktopPane1.add(updateAditionalDataPage);
            updateAditionalDataPage.setVisible(true);
        } catch (Throwable e) {
            JOptionPane.showMessageDialog(rootPane, "Erro na atualiza????o. Erro: " + e, "Erro", JOptionPane.ERROR_MESSAGE);     
        }
    }//GEN-LAST:event_atualizarDadoAdicionalEscolhaMenuActionPerformed

    private void removerDadoAdcicionalEscolhaMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removerDadoAdcicionalEscolhaMenuActionPerformed
        // remover dado adicional

        String searchName = JOptionPane.showInputDialog(rootPane, "Nome do Paciente para ser encontrado:");
        
        try {
            Patient pat = sec.getPatientByName(searchName);
            doc.deleteAditionalInfo(pat.getId());
            JOptionPane.showMessageDialog(rootPane, "Dado Adicional Removido com sucesso", "Remo????o", JOptionPane.INFORMATION_MESSAGE);
            this.dispose();
        } catch (Throwable e) {
            JOptionPane.showMessageDialog(rootPane, "Erro na remo????o. Erro: " + e, "Erro", JOptionPane.ERROR_MESSAGE);
        }
        
        
    }//GEN-LAST:event_removerDadoAdcicionalEscolhaMenuActionPerformed

    private void criarRelatorioMedicoEscolhaMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_criarRelatorioMedicoEscolhaMenuActionPerformed
        // relat??rio m??dico
        String searchName = JOptionPane.showInputDialog(rootPane, "Nome do Paciente para ser encontrado:");
        try {
            Patient pat = sec.getPatientByName(searchName);
            CreateMedicalRecordPage createMedicalRecord = new CreateMedicalRecordPage(pat);
            jDesktopPane1.add(createMedicalRecord);
            createMedicalRecord.setVisible(true); 
        } catch (Throwable e){
            JOptionPane.showMessageDialog(rootPane, "Erro na cria????o. Erro: " + e, "Erro", JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_criarRelatorioMedicoEscolhaMenuActionPerformed

    private void listarRelatoriosMedicosEscolhaMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listarRelatoriosMedicosEscolhaMenuActionPerformed
        // listar relat??rios m??dicos
        try {
            ArrayList<MedicalRecord> mRecs = doc.getAllMedicalRecord();
            //exemplo:
            //GenerateNextDayReports generateNextDayReps = new GenerateNextDayReports(appts);
            //jDesktopPane1.add(generateNextDayReps);
            //generateNextDayReps.setVisible(true);       
        } catch (Throwable e){
            JOptionPane.showMessageDialog(rootPane, "Erro na gera????o de relat??rio. Erro: " + e, "Erro", JOptionPane.ERROR_MESSAGE);   
        }
    }//GEN-LAST:event_listarRelatoriosMedicosEscolhaMenuActionPerformed

    private void atualizarProntuarioEscolhaMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atualizarProntuarioEscolhaMenuActionPerformed
        //atualizar prontu??rio
        String searchName = JOptionPane.showInputDialog(rootPane, "Nome do Paciente para ser encontrado:");
        try {
            Patient pat = sec.getPatientByName(searchName);
            UpdatePatientRecordPage updatePatientRecord = new UpdatePatientRecordPage(pat.getId());
            jDesktopPane1.add(updatePatientRecord);
            updatePatientRecord.setVisible(true);
        } catch (Throwable e) {
            JOptionPane.showMessageDialog(rootPane, "Erro na atualiza????o. Erro: " + e, "Erro", JOptionPane.ERROR_MESSAGE);     
        }
    }//GEN-LAST:event_atualizarProntuarioEscolhaMenuActionPerformed

    private void criarPronturarioEscolhaMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_criarPronturarioEscolhaMenuActionPerformed
        // criar prontu??rio
        String searchName = JOptionPane.showInputDialog(rootPane, "Nome do Paciente para ser encontrado:");
        try {
            Patient pat = doc.getPatientByName(searchName);
            CreatePatientRecordPage createPatientRecord = new CreatePatientRecordPage(pat);
            jDesktopPane1.add(createPatientRecord);
            createPatientRecord.setVisible(true);
        } catch(Throwable e){
           JOptionPane.showMessageDialog(rootPane, "Erro na cria????o. Erro: " + e, "Erro", JOptionPane.ERROR_MESSAGE);

        }
    }//GEN-LAST:event_criarPronturarioEscolhaMenuActionPerformed

    private void removerProntuarioEscolhaMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removerProntuarioEscolhaMenuActionPerformed
        // remover prontu??rio
        String searchName = JOptionPane.showInputDialog(rootPane, "Nome do Paciente para ser encontrado:");
        try {
            Patient pat = sec.getPatientByName(searchName);
            doc.deletePatientRecord(pat.getId());
            JOptionPane.showMessageDialog(rootPane, "Prontu??rio Removido com sucesso", "Remo????o", JOptionPane.INFORMATION_MESSAGE);
            this.dispose();
        } catch (Throwable e) {
            JOptionPane.showMessageDialog(rootPane, "Erro na remo????o. Erro: " + e, "Erro", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_removerProntuarioEscolhaMenuActionPerformed

    private void agendamentoMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agendamentoMenuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_agendamentoMenuActionPerformed

    private void enviarSMSEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enviarSMSEmailActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(rootPane, "Emails e SMS's enviados!");
    }//GEN-LAST:event_enviarSMSEmailActionPerformed

    private void relatorioAgendamentoEscolhaMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_relatorioAgendamentoEscolhaMenuActionPerformed
        // TODO add your handling code here:
        try {
            ArrayList<Appointment> appts = sec.getNextDayAppointments();
            System.out.println(appts);
            GenerateNextDayReports generateNextDayReps = new GenerateNextDayReports(appts);
            jDesktopPane1.add(generateNextDayReps);
            generateNextDayReps.setVisible(true);       
        } catch (Throwable e){
            JOptionPane.showMessageDialog(rootPane, "Erro na gera????o de relat??rio. Erro: " + e, "Erro", JOptionPane.ERROR_MESSAGE);   
        }
      
    }//GEN-LAST:event_relatorioAgendamentoEscolhaMenuActionPerformed

    private void cancelarAgendamentoEscolhaMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarAgendamentoEscolhaMenuActionPerformed
        // TODO add your handling code here:
        
       String searchName = JOptionPane.showInputDialog(rootPane, "Nome do Paciente para ser encontrado:");
        
        try {
            Patient pat = sec.getPatientByName(searchName);
            sec.deleteAppointment(pat.getId());
            JOptionPane.showMessageDialog(rootPane, "Agendamento removido com sucesso", "Remo????o", JOptionPane.INFORMATION_MESSAGE);
            this.dispose();
        } catch (Throwable e) {
            JOptionPane.showMessageDialog(rootPane, "Erro na remo????o. Erro: " + e, "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_cancelarAgendamentoEscolhaMenuActionPerformed

    /**
     * @param args the command line arguments
     */
    
    
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new MainPage().setVisible(true);
//            }
//        });
//    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu agendamentoMenu;
    private javax.swing.JMenuItem atualizarAgendamentoEscolhaMenu;
    private javax.swing.JMenuItem atualizarDadoAdicionalEscolhaMenu;
    private javax.swing.JMenuItem atualizarPacienteEscolhaMenu;
    private javax.swing.JMenuItem atualizarProntuarioEscolhaMenu;
    private javax.swing.JMenuItem cancelarAgendamentoEscolhaMenu;
    private javax.swing.JMenuItem criarAgendamentoEscolhaMenu;
    private javax.swing.JMenuItem criarDadoAdicionalEscolhaMenu;
    private javax.swing.JMenuItem criarPacienteEscolhaMenu;
    private javax.swing.JMenuItem criarPronturarioEscolhaMenu;
    private javax.swing.JMenuItem criarRelatorioMedicoEscolhaMenu;
    private javax.swing.JMenuItem enviarSMSEmail;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem listarRelatoriosMedicosEscolhaMenu;
    private javax.swing.JMenu medicoMenu;
    private javax.swing.JMenuItem relatorioAgendamentoEscolhaMenu;
    private javax.swing.JMenu relatorioAgendamentosMenu;
    private javax.swing.JMenuItem removerDadoAdcicionalEscolhaMenu;
    private javax.swing.JMenuItem removerPacienteEscolhaMenu;
    private javax.swing.JMenuItem removerProntuarioEscolhaMenu;
    // End of variables declaration//GEN-END:variables
}
