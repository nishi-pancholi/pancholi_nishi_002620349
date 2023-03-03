/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Roles;

import AppSystem.ApplicationSystem;
import LibrarianArea.UserAccount;
import UI.AdminWorkArea.AdminJFrame;
import javax.swing.JFrame;

/**
 *
 * @author nishipancholi
 */
public class AdminRole extends Role{
    public AdminRole() {
    }

    
    @Override
    public JFrame getWorkArea(ApplicationSystem system, UserAccount useraccount) {
        return new AdminJFrame(system, useraccount);
    }
}
