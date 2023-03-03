/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Customer;

import Persons.Person;
import Services.RentalRequest;
import Services.RentalRequestDirectory;
import java.util.ArrayList;

/**
 *
 * @author nishipancholi
 */
public class Customer extends Person{
    private int requestsTotal;
    private RentalRequestDirectory rentalRequestDirectory;
    
    public Customer() {
        super();
        this.rentalRequestDirectory = new RentalRequestDirectory();
    }
   
    
    public int getRequestTotal() {
        return requestsTotal;
    }

    public void setRequestTotal(int requestsTotal) {
        this.requestsTotal = requestsTotal;
    }

    public int getRequestsTotal() {
        return requestsTotal;
    }

    public void setRequestsTotal(int requestsTotal) {
        this.requestsTotal = requestsTotal;
    }

    public RentalRequestDirectory getRentalRequestDirectory() {
        return rentalRequestDirectory;
    }

    public void setRentalRequestDirectory(RentalRequestDirectory rentalRequestDirectory) {
        this.rentalRequestDirectory = rentalRequestDirectory;
    }

    public void addRequestForCustomer(RentalRequest request,float price,String status,int duration, String materialType) {
        this.rentalRequestDirectory.createRequest(this,price,status,duration,materialType);
    }
}
