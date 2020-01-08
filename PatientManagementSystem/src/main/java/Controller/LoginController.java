/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.People.Person;
import Model.Util.Hash;
import View.Login;
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
        if(attemptLogin(view.getLogInCredentialsUsername(), view.getLogInCredentialsPassword())) {
            UserPanel view = new UserPanel();
        } else {
            System.out.println("Login no \n" + view.getLogInCredentialsUsername() + "," + Hash.hashPassword(view.getLogInCredentialsPassword()));
        }
    }
    
}
