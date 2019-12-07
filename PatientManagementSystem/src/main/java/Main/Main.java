/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;


import Model.Util.Hash;
/**
 *
 * @author wmasters
 */
public class Main {
    
    public static void main(String[] args) {
        
        String password = "password1234";
        
        System.out.println(password + " -> " + Hash.hashPassword(password));
        System.out.println(password + " -> " + Hash.hashPassword(password));
        System.out.println("test" + " -> " + Hash.hashPassword("test"));
        System.out.println("test" + " -> " + Hash.hashPassword("test"));
        
    }
    
}
