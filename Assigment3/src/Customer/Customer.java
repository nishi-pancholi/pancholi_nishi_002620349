/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Customer;

import LibrarianArea.Branch;
import Materials.Material;
import Persons.Person;
import Services.RentalRequest;
import Services.RentalRequestDirectory;

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

    public void addRequestForCustomer(RentalRequest request) {
        this.rentalRequestDirectory.createRequest(this,request.getMaterial(),request.getStatus(),request.getDuration(),request.getMaterialType(),request.getLib());
    }
}
