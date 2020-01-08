/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.People;

import Model.Address;

/**
 *
 * @author wmasters
 */
public class TempPerson {
    private String passwordHash;
    private String firstName;
    private String lastName;
    private Address address;

    public TempPerson(String firstName, String lastName, String passwordHash, Address address) {
        this.passwordHash = passwordHash;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
    }

    public String getPasswordHash() {
        return passwordHash;
    }

    public void setPasswordHash(String passwordHash) {
        this.passwordHash = passwordHash;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
    
    
}
