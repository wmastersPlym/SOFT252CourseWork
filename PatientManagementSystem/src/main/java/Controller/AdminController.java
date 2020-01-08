/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.CreateAccount;
import java.awt.event.ActionEvent;

/**
 *
 * @author wmasters
 */
public class AdminController extends UserController {

    @Override
    public void init() {
        view.setUserDetails(user.getId(), user.getFirstName(),user.getLastName(),user.getAddress());
        view.buildAdminControls();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals("Add Doctor/Secretary")) {
            
            CreateAccount createAccount = new CreateAccount();
            
            CreateAccountCotroller controller = new CreateAccountCotroller();
            controller.setView(createAccount);
            
            createAccount.addButtonHandlerStrategy(controller);
            
            createAccount.setVisible(true);
        } else if(e.getActionCommand().equals("Create Account")) {
            System.out.println("Create a account");
            
        }
        
    }
    
}
