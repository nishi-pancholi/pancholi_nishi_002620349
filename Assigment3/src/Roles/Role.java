/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Roles;

import AppSystem.ApplicationSystem;
import LibrarianArea.UserAccount;
import javax.swing.JFrame;

/**
 *
 * @author nishipancholi
 */
public abstract class Role {
    
    static String[] roles = {"sysadmin", "customer", "librarian", "branch manager" };

    public static String[] getRoles() {
        return roles;
    }
    
    
    public abstract JFrame getWorkArea(ApplicationSystem system, UserAccount useraccount);
}
