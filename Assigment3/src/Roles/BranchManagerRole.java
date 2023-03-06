/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Roles;

import AppSystem.ApplicationSystem;
import LibrarianArea.Branch;
import LibrarianArea.Employee;
import LibrarianArea.Library;
import LibrarianArea.UserAccount;
import UI.BranchManagerWorkArea.BranchManagerJFrame;
import java.util.ArrayList;
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
        Library lib= new Library();
        ArrayList<Branch> branchList = system.getBranchList();
        for(Branch branch: branchList){
            ArrayList<Employee> empList=branch.getLibrary().getEmployeeDirectory().getEmployeeList();
            for(Employee emp: empList){
                System.out.println(useraccount.getUsername());
                System.out.println(emp.getUserName());
                if(useraccount.getUsername().equals(emp.getUserName())){        
                  lib=branch.getLibrary();
                }
            }
        }
        return new BranchManagerJFrame(system, useraccount,lib);
    }
}
