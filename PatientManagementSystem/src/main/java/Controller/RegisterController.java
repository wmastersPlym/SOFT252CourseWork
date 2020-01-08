/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Address;
import Model.People.Admin;
import Model.People.TempPerson;
import Model.Util.Database;
import Model.Util.Hash;
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
        
        if(view.getAdminAccount()) {
            String newAdminId = Database.generateAdminId();
            Admin newAdmin = new Admin(newAdminId, Hash.hashPassword(password), firstName, lastName, address);
            Database.addPerson(newAdmin);
            view.displayNewId(newAdminId);
        } else {
            String sex = view.getSex();
            int age = view.getAge();
            // Creates and sends the request to the patient account request class
            TempPerson request = new TempPerson(firstName, lastName, Hash.hashPassword(password), address, sex, age);
            PatientAccountRequests.getInstance().addNewRequest(request);
        }
        
        
        
        view.dispose();
    }
}
