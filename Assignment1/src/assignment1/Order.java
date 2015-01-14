/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package assignment1;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author c0644881
 */
public class Order {
    private String customerId;
    private String customerName;
    private Date timeReceived;
    private Date timeProcessed;
    private Date timeFulfilled;
    private List<Purchase> listOfPurchases = new ArrayList<>();
    private String notes;
    
    public Order(String customerId, String customerName) {
        this.customerId = customerId;
        this.customerName = customerName;
    }
}
