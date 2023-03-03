/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services;

import Customer.Customer;

/**
 *
 * @author nishipancholi
 */
public class RentalRequest {
    Customer customer;
    private static int count = 0;
    String requestId;
    float price;
    String status;
    int duration;
    String materialType;
    
    public RentalRequest() {
        this.customer = new Customer();
        this.status = "Created";
        this.count++;
        
        this.requestId = "RequestNo"+this.count;
    }
    
    public RentalRequest(Customer customer) {
        this.customer = customer;
        this.status = "Created";
        this.count++;
        
        this.requestId = "RequestNo"+this.count;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }


    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        RentalRequest.count = count;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getMaterialType() {
        return materialType;
    }

    public void setMaterialType(String materialType) {
        this.materialType = materialType;
    }
 
    @Override
    public String toString() {
       return this.requestId;
    }
}
