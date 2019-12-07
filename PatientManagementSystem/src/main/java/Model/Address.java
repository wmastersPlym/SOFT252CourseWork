/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author wmasters
 */
public class Address {
    private String houseNumberName;
    private String streetName;
    private String town;
    private String postcode;

    public Address(String houseNumberName, String streetName, String town, String postcode) {
        this.houseNumberName = houseNumberName;
        this.streetName = streetName;
        this.town = town;
        this.postcode = postcode;
    }

    public String getHouseNumberName() {
        return houseNumberName;
    }

    public void setHouseNumberName(String houseNumberName) {
        this.houseNumberName = houseNumberName;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }
    
    
}
