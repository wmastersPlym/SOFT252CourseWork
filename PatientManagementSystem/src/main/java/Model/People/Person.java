/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.People;

import Model.Address;
import Model.Util.Hash;
/**
 *
 * @author wmasters
 */
public abstract class Person {
    private String id;
    private String passwordHash;
    private String firstName;
    private String lastName;
    private Address address;

    public boolean login(String inputPassword) {
        if(passwordHash == Hash.hashPassword(inputPassword)) {
            
        }
        return false;
    }
    
    
}
