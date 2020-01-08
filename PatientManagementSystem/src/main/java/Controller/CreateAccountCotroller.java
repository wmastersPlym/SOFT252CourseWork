/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.People.Doctor;
import Model.People.Secretary;
import Model.Util.Database;
import Model.Util.Hash;
import View.CreateAccount;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author wmasters
 */
public class CreateAccountCotroller implements ActionListener {
    
    CreateAccount view = new CreateAccount();
    
    public void setView(CreateAccount view) {
        this.view = view;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Controller.CreateAccountCotroller.actionPerformed()");
        if(view.getisDoctor()) {
            Database.addPerson(new Doctor(Database.generateDoctorId(), Hash.hashPassword(view.getPassword()), view.getFirstName(), view.getLastName(), view.getAddress()));
        } else {
            Database.addPerson(new Secretary(Database.generateSecretaryId(), Hash.hashPassword(view.getPassword()), view.getFirstName(), view.getLastName(), view.getAddress()));
        }
        view.dispose();
    }
    
}
