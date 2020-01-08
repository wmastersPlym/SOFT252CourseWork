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
    
    public static PatientAccountRequests getInstance() {
        if(instance == null) {
            instance = new PatientAccountRequests();
        }
        return instance;
    }
    
    public static void addNewRequest(TempPerson person) {
        
    }
    
}
