/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.People;

import Model.Address;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author wmasters
 */
public class TempPersonTest {
    
    public static TempPerson myTemp;
    
    public TempPersonTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @Before
    public void setUp() {
        myTemp = new TempPerson("TestFN", "TestLN", "TestPassword", new Address("TestHouseNumber", "TestStreetName", "TestTown", "TestPostCode"), "TestSex", 999);
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testGetPasswordHash() {
        assertEquals(myTemp.getPasswordHash(), "TestPassword");
    }

    @Test
    public void testSetPasswordHash() {
        myTemp.setPasswordHash("newTestPassword");
        assertEquals(myTemp.getPasswordHash(), "newTestPassword");
    }

    @Test
    public void testGetFirstName() {
        assertEquals(myTemp.getFirstName(), "TestFN");
    }

    @Test
    public void testSetFirstName() {
        myTemp.setFirstName("newTestFN");
        assertEquals(myTemp.getFirstName(), "newTestFN");
    }

    @Test
    public void testGetLastName() {
        assertEquals(myTemp.getLastName(), "TestLN");
    }

    @Test
    public void testSetLastName() {
        myTemp.setLastName("newTestLN");
        assertEquals(myTemp.getLastName(), "newTestLN");
    }

    @Test
    public void testGetAddress() {
        assertEquals(myTemp.getAddress().getPostcode(), "TestPostCode");
    }

    @Test
    public void testSetAddress() {
        myTemp.setAddress(new Address("newTestHouseNumber", "newTestStreetName", "newTestTown", "newTestPostCode"));
        assertEquals(myTemp.getAddress().getPostcode(), "newTestPostCode");
    }

    @Test
    public void testGetSex() {
        assertEquals(myTemp.getSex(), "TestSex");
    }

    @Test
    public void testSetSex() {
        myTemp.setSex("newTestSex");
        assertEquals(myTemp.getSex(), "newTestSex");
    }

    @Test
    public void testGetAge() {
        assertEquals(myTemp.getAge(), 999);
    }

    @Test
    public void testSetAge() {
        myTemp.setAge(1);
        assertEquals(myTemp.getSex(), 1);
    }
    
}
