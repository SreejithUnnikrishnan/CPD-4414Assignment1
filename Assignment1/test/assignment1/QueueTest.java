/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package assignment1;

import java.util.Date;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author c0644881
 */
public class QueueTest {
    
    public QueueTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testSomeMethod() {
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
    public void testWhenOrderDoesnotHaveTimeReceived() {
        Queue orderQueue = new Queue();
        String expResult = "Sorry! There is no Recieved Time.";
        String result = orderQueue.fulfillOrder(customerID, timeRecieved, timeProcessed);
        assertEquals(expResult, result);
        
       
    }
    
    public void testWhenThereAreNoOrders() {
        Order ord = new Order();
        String expResult = "";
        String result = ord..fulfillOrder(customerID, purchase);
        assertEquals(expResult, result);
        
       
    }
    
    
    
}
