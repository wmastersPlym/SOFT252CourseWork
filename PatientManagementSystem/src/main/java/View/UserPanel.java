/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.Address;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 *
 * @author wmasters
 */
public class UserPanel extends javax.swing.JFrame {

    /**
     * Creates new form UserPanel
     */
    public UserPanel() {
        initComponents();
        pnlControls.setLayout(new GridLayout(8, 1));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lblUserDetails = new javax.swing.JLabel();
        lblFirstName = new javax.swing.JLabel();
        lblFirstNameResult = new javax.swing.JLabel();
        lblLastName = new javax.swing.JLabel();
        lblLastNameResult = new javax.swing.JLabel();
        lblHouseNo = new javax.swing.JLabel();
        lblStreetName = new javax.swing.JLabel();
        lblTown = new javax.swing.JLabel();
        lblPostCode = new javax.swing.JLabel();
        lblHouseNoResult = new javax.swing.JLabel();
        lblStreetNameResult = new javax.swing.JLabel();
        lblTownResult = new javax.swing.JLabel();
        lblPostCodeResult = new javax.swing.JLabel();
        lblId = new javax.swing.JLabel();
        lblIdResult = new javax.swing.JLabel();
        pnlControls = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setText("User Panel");

        lblUserDetails.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblUserDetails.setText("User details");

        lblFirstName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblFirstName.setText("First name");

        lblFirstNameResult.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblFirstNameResult.setText("Empty");

        lblLastName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblLastName.setText("Last name");

        lblLastNameResult.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblLastNameResult.setText("Empty");

        lblHouseNo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblHouseNo.setText("House number");

        lblStreetName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblStreetName.setText("Street name");

        lblTown.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblTown.setText("Town");

        lblPostCode.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblPostCode.setText("Post code");

        lblHouseNoResult.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblHouseNoResult.setText("Empty");

        lblStreetNameResult.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblStreetNameResult.setText("Empty");

        lblTownResult.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblTownResult.setText("Empty");

        lblPostCodeResult.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblPostCodeResult.setText("Empty");

        lblId.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblId.setText("Id");

        lblIdResult.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblIdResult.setText("Empty");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblUserDetails)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblHouseNo)
                            .addComponent(lblStreetName)
                            .addComponent(lblTown)
                            .addComponent(lblPostCode))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblPostCodeResult)
                            .addComponent(lblTownResult)
                            .addComponent(lblStreetNameResult)
                            .addComponent(lblHouseNoResult)))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addComponent(lblId)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblIdResult))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblFirstName)
                                .addComponent(lblLastName))
                            .addGap(43, 43, 43)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(lblFirstNameResult)
                                .addComponent(lblLastNameResult)))))
                .addContainerGap(390, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblUserDetails)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFirstName)
                    .addComponent(lblFirstNameResult))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLastName)
                    .addComponent(lblLastNameResult))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblId)
                    .addComponent(lblIdResult))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHouseNo)
                    .addComponent(lblHouseNoResult))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblStreetName)
                    .addComponent(lblStreetNameResult))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTown)
                    .addComponent(lblTownResult))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPostCode)
                    .addComponent(lblPostCodeResult))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlControls.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout pnlControlsLayout = new javax.swing.GroupLayout(pnlControls);
        pnlControls.setLayout(pnlControlsLayout);
        pnlControlsLayout.setHorizontalGroup(
            pnlControlsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        pnlControlsLayout.setVerticalGroup(
            pnlControlsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 350, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlControls, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pnlControls, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 9, Short.MAX_VALUE)))
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
            java.util.logging.Logger.getLogger(UserPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserPanel().setVisible(true);
            }
        });
    }
    
    public void setUserDetails(String id, String firstname, String lastName, Address address) {
        lblIdResult.setText(id);
        lblFirstNameResult.setText(firstname);
        lblLastNameResult.setText(lastName);
        lblHouseNoResult.setText(address.getHouseNumberName());
        lblStreetNameResult.setText(address.getStreetName());
        lblTownResult.setText(address.getTown());
        lblPostCodeResult.setText(address.getPostcode());
        
    }
    
    public void buildAdminControls() {
        javax.swing.JButton addDoctorSecretary = new javax.swing.JButton("Add Doctor/Secretary");
        pnlControls.add(addDoctorSecretary);
    }
    
    public void buildSecretaryControls() {
        javax.swing.JButton approvePatientAccounts = new javax.swing.JButton("Approve Patient Accounts");
        pnlControls.add(approvePatientAccounts);
        
    }
    
    public void buildDoctorControls() {
        javax.swing.JButton viewAppointments = new javax.swing.JButton("View Appointments");
        pnlControls.add(viewAppointments);
        javax.swing.JButton makeAppointments = new javax.swing.JButton("Make Appointments");
        pnlControls.add(makeAppointments);
        javax.swing.JButton addMedicine = new javax.swing.JButton("Add new Medicine");
        pnlControls.add(addMedicine);
        
    }
    public void buildPatientControls() {
        javax.swing.JButton rateDoctor = new javax.swing.JButton("Rate doctor");
        pnlControls.add(rateDoctor);
        javax.swing.JButton viewAppointments = new javax.swing.JButton("View Appointments");
        pnlControls.add(viewAppointments);
        
    }
    
    public void addButtonHandlerStrategy(ActionListener strategy){
        for(int i=0; i < pnlControls.getComponentCount(); i++) {
            ((JButton)pnlControls.getComponent(i)).addActionListener(strategy);
        }
    }
    
    public void displayMessage(String msg, String msgTitle) {
        JOptionPane.showMessageDialog(null, msg, msgTitle, JOptionPane.INFORMATION_MESSAGE);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblFirstName;
    private javax.swing.JLabel lblFirstNameResult;
    private javax.swing.JLabel lblHouseNo;
    private javax.swing.JLabel lblHouseNoResult;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblIdResult;
    private javax.swing.JLabel lblLastName;
    private javax.swing.JLabel lblLastNameResult;
    private javax.swing.JLabel lblPostCode;
    private javax.swing.JLabel lblPostCodeResult;
    private javax.swing.JLabel lblStreetName;
    private javax.swing.JLabel lblStreetNameResult;
    private javax.swing.JLabel lblTown;
    private javax.swing.JLabel lblTownResult;
    private javax.swing.JLabel lblUserDetails;
    private javax.swing.JPanel pnlControls;
    // End of variables declaration//GEN-END:variables
}
