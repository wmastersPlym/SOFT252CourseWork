/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.People.TempPerson;
import Model.Util.PatientAccountRequests;
import View.TempPersonViewer;
import java.awt.event.ActionEvent;

/**
 *
 * @author wmasters
 */
public class SecretaryController extends UserController {

    @Override
    public void init() {
        view.setUserDetails(user.getId(), user.getFirstName(),user.getLastName(),user.getAddress());
        view.buildSecretaryControls();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals("Approve Patient Accounts")) {
            TempPerson personToReview = PatientAccountRequests.getInstance().getAccountToReview();
            if(personToReview == null) {
                view.displayMessage("No patient accounts to review", "No accounts");
            } else {
                
                TempPersonViewer view = new TempPersonViewer();
                
                TempPersonReviewerController controller = new TempPersonReviewerController();
                controller.setView(view);
                controller.setperson(personToReview);
                
                view.addButtonHandlerStrategy(controller);
                view.setValues(personToReview);
                view.setVisible(true);
                
            }
        }
    }
    
}
