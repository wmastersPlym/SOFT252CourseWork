/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.People.Person;
import Model.Util.Hash;
import View.UserPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author wmasters
 */
public abstract class UserController implements ActionListener{
    
    UserPanel view = null;
    Person user = null;
    
    public abstract void init() ;
        //view.setUserDetails(user.getId(), user.getFirstName(),user.getLastName(),user.getAddress());
    
    public void setView(UserPanel view) {
        this.view = view;
    }
    
    public void setPerson(Person user) {
        this.user = user;
    }
    
}
