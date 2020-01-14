/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Address;
import Model.People.Patient;
import Model.People.TempPerson;
import Model.Util.Database;
import View.TempPersonViewer;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author wmasters
 */
public class TempPersonReviewerController implements ActionListener{
    private TempPerson person;
    private TempPersonViewer view;
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals("Approve")) {
            System.out.println("Approve");
            
            // Add new person
            String newId = Database.generatePatientId();
            Database.addPerson(new Patient(newId, person.getPasswordHash(), view.getFirstName(), view.getLastName(), new Address(view.getHouseNo(), view.getStreet(), view.getTown(), view.getPostcode()), view.getSex(), view.getAge()));
            Database.popTempPerson();
            view.displayMessage("Id for " + person.getFirstName() + ": " + newId, "new Id + " + newId);
            view.dispose();
        } else if(e.getActionCommand().equals("Delete")){
            System.out.println("Delete");
            Database.popTempPerson();
            view.dispose();
        }
    }
    
    public void setView(TempPersonViewer view) {
        this.view = view;
    }
    public void setperson(TempPerson person) {
        this.person = person;
    }
    
}
