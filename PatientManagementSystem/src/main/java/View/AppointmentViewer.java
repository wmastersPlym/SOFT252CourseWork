/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.Appointment;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

/**
 *
 * @author wmasters
 */
public class AppointmentViewer extends javax.swing.JFrame {

    /**
     * Creates new form AppointmentViewer
     */
    public AppointmentViewer() {
        initComponents();
        pnlAppointments.setLayout(new GridLayout(8, 1));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblAppointmentViewer = new javax.swing.JLabel();
        pnlAppointments = new javax.swing.JPanel();
        lblDoctorId = new javax.swing.JLabel();
        lblDoctorIdResult = new javax.swing.JLabel();
        lblPatientId = new javax.swing.JLabel();
        lblPatientIdResult = new javax.swing.JLabel();
        lblDateTime = new javax.swing.JLabel();
        lblDateTimeResult = new javax.swing.JLabel();
        lblNotes = new javax.swing.JLabel();
        lblNotesResult = new javax.swing.JLabel();
        btnClose = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblAppointmentViewer.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblAppointmentViewer.setText("Appointment Viewer");

        javax.swing.GroupLayout pnlAppointmentsLayout = new javax.swing.GroupLayout(pnlAppointments);
        pnlAppointments.setLayout(pnlAppointmentsLayout);
        pnlAppointmentsLayout.setHorizontalGroup(
            pnlAppointmentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        pnlAppointmentsLayout.setVerticalGroup(
            pnlAppointmentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 327, Short.MAX_VALUE)
        );

        lblDoctorId.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblDoctorId.setText("Docter Id");

        lblDoctorIdResult.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblDoctorIdResult.setText("None");

        lblPatientId.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblPatientId.setText("Patient Id");

        lblPatientIdResult.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblPatientIdResult.setText("None");

        lblDateTime.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblDateTime.setText("Date time");

        lblDateTimeResult.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblDateTimeResult.setText("None");

        lblNotes.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblNotes.setText("Notes");

        lblNotesResult.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblNotesResult.setText("None");

        btnClose.setText("Close");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(pnlAppointments, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblAppointmentViewer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblDoctorId)
                                .addGap(30, 30, 30)
                                .addComponent(lblDoctorIdResult))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblPatientId)
                                .addGap(30, 30, 30)
                                .addComponent(lblPatientIdResult))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lblNotes)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblNotesResult))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lblDateTime)
                                    .addGap(30, 30, 30)
                                    .addComponent(lblDateTimeResult))))
                        .addContainerGap(198, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnClose)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblAppointmentViewer)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pnlAppointments, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 13, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblDoctorId)
                            .addComponent(lblDoctorIdResult))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPatientId)
                            .addComponent(lblPatientIdResult))
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblDateTime)
                            .addComponent(lblDateTimeResult))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNotes)
                            .addComponent(lblNotesResult))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnClose)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AppointmentViewer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AppointmentViewer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AppointmentViewer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AppointmentViewer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AppointmentViewer().setVisible(true);
            }
        });
    }
    
    public void buildAppoinmentViewer(Appointment[] appointments) {
        for(int i=0; i<appointments.length; i++) {
            JButton newBtn = new JButton("Appointment" + i);
            System.out.println(newBtn.getText());
            //newBtn.set
            pnlAppointments.add(newBtn);
        }
    }
    
    public void setAppointmentDetails(Appointment a) {
        lblDoctorIdResult.setText(a.getDoctorId());
        lblPatientIdResult.setText(a.getPatientId());
        lblDateTimeResult.setText(a.getDateTime());
        lblNotesResult.setText(a.getNotes());
    }
    
    public void addButtonHandlerStrategy(ActionListener strategy){
        for(int i=0; i < pnlAppointments.getComponentCount(); i++) {
            ((JButton)pnlAppointments.getComponent(i)).addActionListener(strategy);
        }
        btnClose.addActionListener(strategy);
    } 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClose;
    private javax.swing.JLabel lblAppointmentViewer;
    private javax.swing.JLabel lblDateTime;
    private javax.swing.JLabel lblDateTimeResult;
    private javax.swing.JLabel lblDoctorId;
    private javax.swing.JLabel lblDoctorIdResult;
    private javax.swing.JLabel lblNotes;
    private javax.swing.JLabel lblNotesResult;
    private javax.swing.JLabel lblPatientId;
    private javax.swing.JLabel lblPatientIdResult;
    private javax.swing.JPanel pnlAppointments;
    // End of variables declaration//GEN-END:variables
}
