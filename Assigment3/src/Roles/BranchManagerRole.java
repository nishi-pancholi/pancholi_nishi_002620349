/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Roles;

import AppSystem.ApplicationSystem;
import LibrarianArea.UserAccount;
import UI.BranchManagerWorkArea.BranchManagerJFrame;
import javax.swing.JFrame;

/**
 *
 * @author nishipancholi
 */
public class BranchManagerRole extends Role{
    public BranchManagerRole() {
    }

    
    @Override
    public JFrame getWorkArea(ApplicationSystem system, UserAccount useraccount) {
        return new BranchManagerJFrame(system, useraccount);
    }
}
