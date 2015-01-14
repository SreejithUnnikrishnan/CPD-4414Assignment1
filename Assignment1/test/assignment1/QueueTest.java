/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package assignment1;

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
    public void testWhenNeitherCustomerIdNorCustomerNameExists () {
        
        Queue queue = new Queue();
        Order order = new Order("", "");
        order.addOrder(new order("P0001", 50));
        orderQueue.add(order);
        String expResult = "Error neither customer ID nor customer name exists";
        String result = order.addOrder(CustomerId,CustomerName);
        assertEquals(expResult, result);
      
        
        
    }
    
    
    
}
