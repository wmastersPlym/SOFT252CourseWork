/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.People;

import Model.Address;
import Model.Util.Hash;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author wmasters
 */
public class PersonTest {
    
    private PersonImpl myPerson;
    
    public PersonTest() {
    }
    
    @Before
    public void setUp() { // the passwordhash is 'password' after being hashed
        myPerson = new PersonImpl("id", "a1e1d17ffcf975dca382c245c562cf45", "firstName", "lastName", new Address("houseNumberName", "streetName", "town", "postcode"));
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testGetId() {
        assertEquals(myPerson.getId(), "id");
    }

    @Test
    public void testSetId() {
        PersonImpl myPersonTest = new PersonImpl("id", "passwordHash", "firstName", "lastName", new Address("houseNumberName", "streetName", "town", "postcode"));
        myPersonTest.setId("New id");
        assertEquals(myPersonTest.getId(), "New id");
    }

    @Test
    public void testGetPasswordHash() {
        assertEquals(myPerson.getPasswordHash(), "a1e1d17ffcf975dca382c245c562cf45");
    }

    @Test
    public void testSetPasswordHash() {
        PersonImpl myPersonTest = new PersonImpl("id", "passwordHash", "firstName", "lastName", new Address("houseNumberName", "streetName", "town", "postcode"));
        myPersonTest.setPasswordHash("New Password Hash");
        assertEquals(myPersonTest.getPasswordHash(), "New Password Hash");
    }

    @Test
    public void testGetFirstName() {
        assertEquals(myPerson.getFirstName(), "firstName");
    }

    @Test
    public void testSetFirstName() {
        PersonImpl myPersonTest = new PersonImpl("id", "passwordHash", "firstName", "lastName", new Address("houseNumberName", "streetName", "town", "postcode"));
        myPersonTest.setFirstName("New First Name");
        assertEquals(myPersonTest.getFirstName(), "New First Name");
    }

    @Test
    public void testGetLastName() {
        assertEquals(myPerson.getLastName(), "lastName");
    }

    @Test
    public void testSetLastName() {
        PersonImpl myPersonTest = new PersonImpl("id", "passwordHash", "firstName", "lastName", new Address("houseNumberName", "streetName", "town", "postcode"));
        myPersonTest.setLastName("New Last Name");
        assertEquals(myPersonTest.getLastName(), "New Last Name"); 
    }

    @Test
    public void testGetAddress() {
        assertEquals(myPerson.getAddress(), new Address("houseNumberName", "streetName", "town", "postcode"));
    }

    @Test
    public void testSetAddress() {
        PersonImpl myPersonTest = new PersonImpl("id", "passwordHash", "firstName", "lastName", new Address("houseNumberName", "streetName", "town", "postcode"));
        myPersonTest.setAddress(new Address("new houseNumberName", "new streetName", "new town", "new postcode"));
        assertEquals(myPersonTest.getAddress(), new Address("new houseNumberName", "new streetName", "new town", "new postcode"));
    }

    @Test
    public void testToString() {
        String expected = "Person{" + "id=" + myPerson.getId() + ", passwordHash=" + myPerson.getPasswordHash()+ ", firstName=" + myPerson.getFirstName()+ ", lastName=" + myPerson.getLastName()+ ", address=" + myPerson.getAddress()+ '}';
        assertEquals(expected, myPerson.toString());
    }

    @Test
    public void testLogin() {
        assertTrue(myPerson.login(Hash.hashPassword("password")));
    }

    
    public class PersonImpl extends Person {

        public PersonImpl(String id, String passwordHash, String firstName, String lastName, Address address) {
            super(id,passwordHash,firstName,lastName, address);
        }
    }
}
