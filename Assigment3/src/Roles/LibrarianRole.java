/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Roles;

import AppSystem.ApplicationSystem;
import LibrarianArea.UserAccount;
import UI.LibrarianWorkArea.LibrarianJFrame;
import javax.swing.JFrame;

/**
 *
 * @author nishipancholi
 */
public class LibrarianRole extends Role{
     public LibrarianRole() {
    }

    
    @Override
    public JFrame getWorkArea(ApplicationSystem system, UserAccount useraccount) {
        return new LibrarianJFrame(system, useraccount);
    }
}
