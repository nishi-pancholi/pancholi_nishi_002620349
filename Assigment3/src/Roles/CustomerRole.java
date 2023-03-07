/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Roles;

import AppSystem.ApplicationSystem;
import Customer.Customer;
import LibrarianArea.Branch;
import LibrarianArea.Library;
import LibrarianArea.UserAccount;
import UI.CustomerWorkArea.CustomerJFrame;
import java.util.ArrayList;
import javax.swing.JFrame;

/**
 *
 * @author nishipancholi
 */
public class CustomerRole extends Role{
    public CustomerRole() {
    }

    
    @Override
    public JFrame getWorkArea(ApplicationSystem system, UserAccount useraccount) {
        return new CustomerJFrame(system, useraccount);
    }
}
