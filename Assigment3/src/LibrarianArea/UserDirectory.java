/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LibrarianArea;

import LibrarianArea.UserAccount;
import java.util.ArrayList;
import Roles.Role;

/**
 *
 * @author nishipancholi
 */
public class UserDirectory {
    ArrayList<UserAccount> useraccountlist;

    public ArrayList<UserAccount> getUseraccountlist() {
        return useraccountlist;
    }

    public void setUseraccountlist(ArrayList<UserAccount> useraccountlist) {
        this.useraccountlist = useraccountlist;
    }
    
    public UserDirectory() {
        this.useraccountlist = new ArrayList<UserAccount>();
    }
    
     public String[] getAllRoles() {
       return Role.getRoles();
    }
     
    public UserAccount createUserAccount(String username, String password, String role) {
        UserAccount user = new UserAccount(username, password, role);
        
        useraccountlist.add(user);
        return user;
    }
    
    public UserAccount findById(String id) {
        for(UserAccount u: this.useraccountlist) {
            if(u.getAccountId().equals(id)) {
                return u;
            }
        }
        
        return null;
    }
    
    public UserAccount findByUserName(String name) {
        for(UserAccount u: this.useraccountlist) {
            if(u.getUsername().equals(name)) {
                return u;
            }
        }
        
        return null;
    }
    
    public void removeUser(UserAccount u){
        this.useraccountlist.remove(u);
    }
    
    public UserAccount getUserAccount(String username, String password, String role) {
        for(UserAccount u: this.useraccountlist) {
            if(u.getUsername().equals(username) && u.getPassword().equals(password) && u.getRole().equals(role)) {
                return u;
            }
        }
        
        return null;
    }
    
    public Boolean accountExists(String username, String password, String role) {
        for(UserAccount u: this.useraccountlist) {
            if(u.getUsername().equals(username) && u.getPassword().equals(password) && u.getRole().equals(role)) {
                return true;
            }
        }
        
        return false;
    }
}
