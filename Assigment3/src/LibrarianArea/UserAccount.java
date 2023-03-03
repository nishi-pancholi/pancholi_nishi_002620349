/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LibrarianArea;

import AppSystem.ApplicationSystem;
import Roles.AdminRole;
import Roles.BranchManagerRole;
import Roles.CustomerRole;
import Roles.LibrarianRole;
import javax.swing.JFrame;

/**
 *
 * @author nishipancholi
 */
public class UserAccount {
    private static int count = 0;
    private String accountId;
    private String username;
    private String password;

    // assume roles are defined as manager, delivery agent, customer
    private String role;

    public UserAccount() {
        this.accountId = "ACC" + count++;
        this.username = username;
        this.password = password;
        this.role = role;
    }

    public UserAccount(String username, String password, String role) {
        this.accountId = role + count++;
        this.username = username;
        this.password = password;
        this.role = role;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        UserAccount.count = count;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
    

    public JFrame getWorkArea(String role, ApplicationSystem system, UserAccount useraccount) {
        // the abstract class way
        if (role.equals("sysadmin")) {
            return new AdminRole().getWorkArea(system, useraccount);
        }
        if (role.equals("customer")) {
             return new CustomerRole().getWorkArea(system, useraccount);
        }
        if (role.equals("librarian")) {
             return new LibrarianRole().getWorkArea(system, useraccount);
        }
        if (role.equals("branch manager")) {
             return new BranchManagerRole().getWorkArea(system, useraccount);
        }
        return null;
    }
    
    @Override
    public String toString() {
       return this.accountId;
    }
}
