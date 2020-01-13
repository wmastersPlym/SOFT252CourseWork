/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;


import Model.People.*;
import Model.Util.Hash;
import Model.Util.Database;
import Controller.LoginController;
import View.Login;
/**
 *
 * @author wmasters
 */
public class Main {
    
    public static void main(String[] args) {
        
        System.out.println(Hash.hashPassword("password"));
        
        
        
        Login view = new Login();
        
        LoginController controller = new LoginController();
        controller.setView(view);
        
        view.addButtonHandlerStrategy(controller);
        view.setVisible(true);
        

        
        
        
        
    }  
}
