/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Util;

import Model.Address;
import Model.People.TempPerson;

/**
 *
 * @author wmasters
 */
public class PatientAccountRequests {
    
    private static PatientAccountRequests instance = null;
    private static TempPerson[] accountsToView;
    
    public static PatientAccountRequests getInstance() {
        if(instance == null) {
            instance = new PatientAccountRequests();
        }
        instance.update();
        return instance;
    }
    
    public void update() {
        accountsToView = Database.getAllTempPeople();
    }
    
    public TempPerson getAccountToReview() {
        if(accountsToView.length >0) {
            return accountsToView[0];
        } else {
            return null;
        }
        
    }
    
    public void addNewRequest(TempPerson person) {
        Database.addTempPerson(person);
        instance.update();
    }
    
    public TempPerson[] getAllAccountsToReview() {
        return accountsToView;
    }
    
}
