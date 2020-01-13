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

    public Person(String id, String passwordHash, String firstName, String lastName, Address address) {
        this.id = id;
        this.passwordHash = passwordHash;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    @Override
    public String toString() {
        return "Person{" + "id=" + id + ", passwordHash=" + passwordHash + ", firstName=" + firstName + ", lastName=" + lastName + ", address=" + address + '}';
    }

    
    
    
    
    public boolean login(String inputPassword) {
        if(passwordHash.equals(Hash.hashPassword(inputPassword))) {
            return true;
        }
        return false;
    }
    
    
}
