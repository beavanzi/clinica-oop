/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinic.view.docPages;
import clinic.employees.Doctor;
import clinic.external.Patient;
import clinic.resources.PatientRecord;
import javax.swing.JOptionPane;

/**
 *
 * @author sarahanduca
 */
public class UpdatePatientRecordPage extends javax.swing.JInternalFrame {
    private Doctor doc;
    private Integer id;
    /**
     * Creates new form UpdatePatientRecordPage
     */
    public UpdatePatientRecordPage(Integer id) {
        initComponents();
        this.doc = new Doctor();
        this.id = id;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        symptomsInput = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        diagnosisInput = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        treatmentInput = new javax.swing.JTextField();
        saveButton = new javax.swing.JButton();

        setClosable(true);
        setTitle("Atualizar Prontuário");

        jLabel1.setText("Sintoma");

        symptomsInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                symptomsInputActionPerformed(evt);
            }
        });

        jLabel2.setText("Diagnóstico");

        jLabel3.setText("Prescrição para Tratamento");

        saveButton.setBackground(new java.awt.Color(60, 103, 15));
        saveButton.setText("Salvar");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(363, 363, 363)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(298, 298, 298)
                        .addComponent(jLabel3))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(142, 142, 142)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(diagnosisInput)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(symptomsInput, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(0, 0, Short.MAX_VALUE))
                                .addComponent(treatmentInput)))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(354, 354, 354)
                            .addComponent(jLabel2)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(360, 360, 360)
                        .addComponent(saveButton)))
                .addContainerGap(156, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(symptomsInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(diagnosisInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(treatmentInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(saveButton)
                .addGap(14, 14, 14))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void symptomsInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_symptomsInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_symptomsInputActionPerformed

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        // save content
        String treatment = treatmentInput.getText();
        String symptoms = symptomsInput.getText();
        String diagnosis = diagnosisInput.getText();
        
        doc.updatePatientRecord(symptoms, diagnosis, treatment, this.id);
        JOptionPane.showMessageDialog(rootPane, "Prontuário Atualizado com Sucesso\n\n"
                + treatment + "\n" + symptoms + "\n" + diagnosis);
        
    }//GEN-LAST:event_saveButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField diagnosisInput;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton saveButton;
    private javax.swing.JTextField symptomsInput;
    private javax.swing.JTextField treatmentInput;
    // End of variables declaration//GEN-END:variables
}
