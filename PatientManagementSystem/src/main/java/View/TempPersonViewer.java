/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.People.TempPerson;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author wmasters
 */
public class TempPersonViewer extends javax.swing.JFrame {

    /**
     * Creates new form TempPersonViewer
     */
    public TempPersonViewer() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblFirstName = new javax.swing.JLabel();
        lblLastName = new javax.swing.JLabel();
        txtFirstname = new javax.swing.JTextField();
        txtLastname = new javax.swing.JTextField();
        lblHouseNo = new javax.swing.JLabel();
        txtHouseNo = new javax.swing.JTextField();
        txtStreetName = new javax.swing.JTextField();
        lblStreetName = new javax.swing.JLabel();
        lblTown = new javax.swing.JLabel();
        txtTown = new javax.swing.JTextField();
        txtPostCode = new javax.swing.JTextField();
        lblPostCode = new javax.swing.JLabel();
        lblAccountReview = new javax.swing.JLabel();
        btnApprove = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        lblSex = new javax.swing.JLabel();
        txtSex = new javax.swing.JTextField();
        lblAge = new javax.swing.JLabel();
        txtAge = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblFirstName.setText("First name");

        lblLastName.setText("Last name");

        txtFirstname.setText("jTextField1");

        txtLastname.setText("jTextField1");

        lblHouseNo.setText("House number");

        txtHouseNo.setText("jTextField1");

        txtStreetName.setText("jTextField1");

        lblStreetName.setText("Street name");

        lblTown.setText("Town");

        txtTown.setText("jTextField1");

        txtPostCode.setText("jTextField1");

        lblPostCode.setText("Post code");

        lblAccountReview.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblAccountReview.setText("Patient Account Review");

        btnApprove.setText("Approve");

        btnDelete.setText("Delete");

        lblSex.setText("Sex");

        txtSex.setText("jTextField1");

        lblAge.setText("Age");

        txtAge.setText("jTextField1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnApprove, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(lblAccountReview)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblFirstName)
                                    .addComponent(lblLastName))
                                .addGap(34, 34, 34)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtFirstname)
                                    .addComponent(txtLastname)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblHouseNo)
                                    .addComponent(lblStreetName)
                                    .addComponent(lblTown)
                                    .addComponent(lblPostCode))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtHouseNo)
                                    .addComponent(txtStreetName)
                                    .addComponent(txtTown)
                                    .addComponent(txtPostCode)
                                    .addComponent(txtSex)
                                    .addComponent(txtAge)))))
                    .addComponent(lblSex)
                    .addComponent(lblAge))
                .addContainerGap(167, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblAccountReview)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFirstName)
                    .addComponent(txtFirstname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLastName)
                    .addComponent(txtLastname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHouseNo)
                    .addComponent(txtHouseNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblStreetName)
                    .addComponent(txtStreetName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTown)
                    .addComponent(txtTown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPostCode)
                    .addComponent(txtPostCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSex)
                    .addComponent(txtSex, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAge)
                    .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnApprove, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28))
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
            java.util.logging.Logger.getLogger(TempPersonViewer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TempPersonViewer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TempPersonViewer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TempPersonViewer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TempPersonViewer().setVisible(true);
            }
        });
    }
    
    public void setValues(TempPerson person) {  
       txtFirstname.setText(person.getFirstName());
       txtLastname.setText(person.getLastName());
       txtHouseNo.setText(person.getAddress().getHouseNumberName());
       txtStreetName.setText(person.getAddress().getStreetName());
       txtTown.setText(person.getAddress().getTown());
       txtPostCode.setText(person.getAddress().getPostcode());
       txtSex.setText(person.getSex());
       txtAge.setText(Integer.toString(person.getAge()));
    }
    
    
    
    public void addButtonHandlerStrategy(ActionListener strategy){
        btnApprove.addActionListener(strategy);
        btnDelete.addActionListener(strategy);
    }
    
    public void displayMessage(String msg, String msgTitle) {
        JOptionPane.showMessageDialog(null, msg, msgTitle, JOptionPane.INFORMATION_MESSAGE);
    }
    
    public String getFirstName() {
        return txtFirstname.getText();
    }
    public String getLastName() {
        return txtLastname.getText();
    }
    public String getHouseNo() {
        return txtHouseNo.getText();
    }
    public String getStreet() {
        return txtStreetName.getText();
    }
    public String getTown() {
        return txtTown.getText();
    }
    public String getPostcode() {
        return txtPostCode.getText();
    }
    public String getSex() {
        return txtSex.getText();
    }
    public int getAge() {
        return Integer.parseInt(txtAge.getText());
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnApprove;
    private javax.swing.JButton btnDelete;
    private javax.swing.JLabel lblAccountReview;
    private javax.swing.JLabel lblAge;
    private javax.swing.JLabel lblFirstName;
    private javax.swing.JLabel lblHouseNo;
    private javax.swing.JLabel lblLastName;
    private javax.swing.JLabel lblPostCode;
    private javax.swing.JLabel lblSex;
    private javax.swing.JLabel lblStreetName;
    private javax.swing.JLabel lblTown;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtFirstname;
    private javax.swing.JTextField txtHouseNo;
    private javax.swing.JTextField txtLastname;
    private javax.swing.JTextField txtPostCode;
    private javax.swing.JTextField txtSex;
    private javax.swing.JTextField txtStreetName;
    private javax.swing.JTextField txtTown;
    // End of variables declaration//GEN-END:variables
}
