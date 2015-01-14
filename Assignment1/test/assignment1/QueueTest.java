/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package assignment1;

import java.util.Date;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

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
    public void testWhenNewOrderArrivesEitherCustomerIDorCustomerNameAndListOfPurchases() {
        Queue Queue = new Queue();
      
       
        
        
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    public void testWhenOrderIsAvailabele() {
        long expected;
        long result;
        Date saved; 
        Queue queue = new Queue();
        Order order = new Order("C123456","Seatles limited");
        order.addPurchase(new Purchase("P001", 50));
        queue.add(order);
        saved = order.getTimeReceived();
        expected = saved.getTime();
        Order order = new Order("C123457","Btles limited");
        order.addPurchase(new Purchase("P011", 150));
        queue.add(order);
        Order proc = queue.element();
        result = proc.getTimeReceived().getTime();
        assertEquals(expected, result);
    public void testWhenOrderDoesNotHaveTimeReceived () {
        
        Queue queue = new Queue();
        Order order = new Order("", "");
        order.addOrder(new order("P0001", 50));
        orderQueue.add(order);
        String expResult = "Error neither customer ID nor customer name exists";
        String result = order.addOrder(CustomerId,CustomerName);
        assertEquals(expResult, result);
      
        
        
    }
    
    
    public void testWhenOrderIsNotAvailabele(){
        Order expected = null;
        Queue queue = new Queue();
        Order order = new Order();
        Order proc = queue.element();
        assertEquals(expected, proc);
        
    }
            
    
   
    

    
}
