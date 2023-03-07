/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services;

import Customer.Customer;
import LibrarianArea.Library;
import Materials.Material;

/**
 *
 * @author nishipancholi
 */
public class RentalRequest {
    private Customer customer;
    private static int count = 0;
    String requestId;
    float price;
    String status;
    String duration;
    String materialType;
    private Material material;
    private Library lib;
    
    public RentalRequest() {
        this.customer = new Customer();
        this.material= new Material();
        this.lib= new Library();
        this.status = "Created";
        this.count++;
        this.price= 0;
        
        this.requestId = "RequestNo"+this.count;
    }
    
    public RentalRequest(Customer customer) {
        this.customer = customer;
        this.status = "Created";
        this.material= new Material();
        this.lib= new Library();
        this.count++;
        this.price= 0;
        
        this.requestId = "RequestNo"+this.count;
    }

    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
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

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getMaterialType() {
        return materialType;
    }

    public void setMaterialType(String materialType) {
        this.materialType = materialType;
    }

    public Library getLib() {
        return lib;
    }

    public void setLib(Library lib) {
        this.lib = lib;
    }
 
    @Override
    public String toString() {
       return this.requestId;
    }
}
