/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Util;

import Model.Address;
import Model.People.TempPerson;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.IOException;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author wmasters
 */
public class PatientAccountRequestsTest {
    
    public PatientAccountRequestsTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testGetInstance() {
        assertTrue(PatientAccountRequests.getInstance() instanceof PatientAccountRequests);
    }

    @Test
    public void testUpdate() {
        PatientAccountRequests.getInstance().update();
        
    }

    @Test
    public void testGetAccountToReview() {
        assertTrue(PatientAccountRequests.getInstance().getAccountToReview() instanceof TempPerson || PatientAccountRequests.getInstance().getAccountToReview() == null);
    }

    @Test
    public void testAddNewRequest() { // will add a test acount to the file 
        int numberOfAccountsToReview = PatientAccountRequests.getInstance().getAllAccountsToReview().length;
        PatientAccountRequests.getInstance().addNewRequest(new TempPerson("TestPerson Please Delete", "TestPerson Please Delete", "TestPerson Please Delete", new Address("TestPerson Please Delete", "TestPerson Please Delete", "TestPerson Please Delete", "TestPerson Please Delete"), "TestPerson Please Delete", 999));
        int numberOfAccountsToReviewAfterAdd = PatientAccountRequests.getInstance().getAllAccountsToReview().length;
        assertTrue(numberOfAccountsToReview == numberOfAccountsToReviewAfterAdd-1);
    }
    
    @Test
    public void testGetAllAccountsToReview() {
        assertTrue(PatientAccountRequests.getInstance().getAllAccountsToReview() instanceof TempPerson[] || PatientAccountRequests.getInstance().getAllAccountsToReview() == null);
    }
    
}
