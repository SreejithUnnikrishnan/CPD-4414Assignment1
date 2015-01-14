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
 * @author c067711
 */
public class Order {

    private String customerId;
    private String customerName;
    private Date timeReceived;
    private Date timeFullfilled;
    private List<Purchase> listOfPrurchases = new ArrayList<>();
    private String notes;

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public Date getTimeReceived() {
        return timeReceived;
    }

    public void setTimeReceived(Date timeReceived) {
        this.timeReceived = timeReceived;
    }

    public Date getTimeFullfilled() {
        return timeFullfilled;
    }

    public void setTimeFullfilled(Date timeFullfilled) {
        this.timeFullfilled = timeFullfilled;
    }

    public List<Purchase> getListOfPrurchases() {
        return listOfPrurchases;
    }

    public void setListOfPrurchases(List<Purchase> listOfPrurchases) {
        this.listOfPrurchases = listOfPrurchases;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }
    
    
}
