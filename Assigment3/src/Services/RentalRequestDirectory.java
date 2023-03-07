/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services;

import Customer.Customer;
import LibrarianArea.Library;
import Materials.Material;
import java.util.ArrayList;

/**
 *
 * @author nishipancholi
 */
public class RentalRequestDirectory {
    ArrayList<RentalRequest> requestlist;
    
    public RentalRequestDirectory() {
        this.requestlist = new ArrayList<RentalRequest>();
    }

    public ArrayList<RentalRequest> getRequestlist() {
        return requestlist;
    }

    public void setRequestlist(ArrayList<RentalRequest> requestlist) {
        this.requestlist = requestlist;
    }

    // create a new order
    public RentalRequest createRequest(Customer customer,Material m,String status,String duration, String materialType,Library lib) {
        RentalRequest req = new RentalRequest(customer);
        req.setMaterial(m);
        req.setStatus(status);
        req.setMaterialType(materialType);
        req.setDuration(duration);
        req.setLib(lib);
        
        this.requestlist.add(req);
        return req;
    }
    
    public RentalRequest requestForBook(Customer customer) {
        RentalRequest request = new RentalRequest();
        request.setCustomer(customer);
        
        this.requestlist.add(request);
        return request;
    }

}
