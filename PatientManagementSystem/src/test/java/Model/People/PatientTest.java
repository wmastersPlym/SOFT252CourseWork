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
public class PatientTest {
    
    private static Patient myPatient;
    
    public PatientTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        myPatient = new Patient("p4321", "TEST", "TestFN", "TestLN", new Address("TestHouseNumber", "TestStreetName", "TestTown", "TestPostCode"), "TestSex", 999);
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    
    

    @Test
    public void testGetSex() {
        assertEquals(myPatient.getSex(), "TestSex");
    }

    @Test
    public void testSetSex() {
        myPatient.setSex("TestSex2");
        assertEquals(myPatient.getSex(), "TestSex2");
    }

    @Test
    public void testGetAge() {
        assertEquals(myPatient.getAge(), 999);
    }

    @Test
    public void testSetAge() {
        myPatient.setAge(0);
        assertEquals(myPatient.getAge(), 0);
    }
    
}
