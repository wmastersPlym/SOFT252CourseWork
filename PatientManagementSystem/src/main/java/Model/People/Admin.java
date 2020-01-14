/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.People;

import Model.Address;
import Model.Util.Database;

/**
 *
 * @author wmasters
 */
public class Admin extends Person {

    
    public Admin(String id, String passwordHash, String firstName, String lastName, Address address) {
        super(id, passwordHash, firstName, lastName, address);
    }
    
    
    public void removeAccount(String id) {
        Database.removePerson(id);
    }
    
}