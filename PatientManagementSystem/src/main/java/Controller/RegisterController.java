/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Address;
import Model.People.TempPerson;
import Model.Util.PatientAccountRequests;
import View.Register;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author wmasters
 */
public class RegisterController implements ActionListener{
    Register view = null;
    
    public void setView(Register view) {
        this.view = view;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        // Getting the required details
        String firstName = view.getFirstname();
        String lastName = view.getLastname();
        String password = view.getPassword();
        Address address = view.getAddress();
        
        // Creates and sends the request to the patient account request class
        TempPerson request = new TempPerson(firstName, lastName, password, address);
        PatientAccountRequests.getInstance().addNewRequest(request);
        
        view.dispose();
    }
}
