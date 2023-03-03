/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AppSystem;

import LibrarianArea.UserDirectory;
import LibrarianArea.UserAccount;
import Customer.CustomerDirectory;
import Genres.GenreDirectory;
import LibrarianArea.Branch;
import Services.RentalRequestDirectory;
import java.util.ArrayList;

/**
 *
 * @author nishipancholi
 */
public class ApplicationSystem {
    private CustomerDirectory customerDirectory;
    private ArrayList<Branch> branchList;
    private UserDirectory userAccountDirectory;
    
    public ApplicationSystem() {
        this.branchList=new ArrayList<Branch>();
        this.customerDirectory=new CustomerDirectory();
        this.userAccountDirectory=new UserDirectory();
        
        UserAccount user = this.userAccountDirectory.createUserAccount("admin", "admin", "sysadmin");
    }
    
    public static ApplicationSystem getApplicationSystemInstance() {
        
        return new ApplicationSystem();
    }

    public CustomerDirectory getCustomerDirectory() {
        return customerDirectory;
    }

    public void setCustomerDirectory(CustomerDirectory customerDirectory) {
        this.customerDirectory = customerDirectory;
    }

    public ArrayList<Branch> getBranchList() {
        return branchList;
    }

    public void setBranchList(ArrayList<Branch> branchList) {
        this.branchList = branchList;
    }

    public UserDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public void setUserAccountDirectory(UserDirectory userAccountDirectory) {
        this.userAccountDirectory = userAccountDirectory;
    }
    
    public Branch createBranch(String name) {
        Branch b = new Branch();
        b.setBranchName(name);
        
        this.branchList.add(b);
        return b;
    }
    
    public void removeBranch(String name) {
        for(Branch b: this.branchList){
            String branchName= b.getBranchName();
            if(name==branchName){
                this.branchList.remove(b);
                break;
            }
        }
    }
}
