/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Util.Database;
import Model.People.Person;
import Model.Util.Hash;
import View.Login;
import View.Register;
import View.UserPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author wmasters
 */
public class LoginController implements ActionListener{
    
    private Login view = null;
    
    public void setView(Login view) {
        this.view = view;
    }
    
    public Boolean attemptLogin(String username, String password) {
        Person person = Database.getPerson(username);
        if(person != null) {
            if(Hash.hashPassword(password).equals(person.getPasswordHash())) {
                return true;
            }
        } else {
            System.out.println("person null");
        }
        return false;
        
    }
    
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        //System.out.println(e.getActionCommand());
        if(e.getActionCommand().equals("Submit")) {
            System.out.println("login");
            if(attemptLogin(view.getLogInCredentialsUsername(), view.getLogInCredentialsPassword())) {
                Person person = Database.getPerson(view.getLogInCredentialsUsername());
                UserPanel view = new UserPanel();
                UserController controller = new UserController();
            
                controller.setView(view);
                controller.setPerson(person);
            
                view.setVisible(true);
            
                this.view.setVisible(false);
            
            } else {
                //System.out.println("Login no \n" + view.getLogInCredentialsUsername() + "," + Hash.hashPassword(view.getLogInCredentialsPassword()));
                view.setErrorMessage("Invalid Credentials");
            }
        } else if(e.getActionCommand().equals("Register")) {
            System.out.println("Register");
            
            Register view = new Register();
            RegisterController controller = new RegisterController();
            
            controller.setView(view);
            view.addButtonHandlerStrategy(controller);
            
            view.setVisible(true);
            
        }
        
    }
    
}
