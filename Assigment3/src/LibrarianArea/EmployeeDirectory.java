/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LibrarianArea;

import java.util.ArrayList;

/**
 *
 * @author nishipancholi
 */
public class EmployeeDirectory {
    ArrayList<Employee> employeeList;
    
    public EmployeeDirectory() {
        this.employeeList = new ArrayList<Employee>();
    }

    public ArrayList<Employee> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(ArrayList<Employee> employeeList) {
        this.employeeList = employeeList;
    }
    
    
    public Employee findById(String id) {
        for(Employee c: this.employeeList) {
            if(c.getPersonID().equals(id)) {
                return c;
            }
        }
        
        return null;
    }
    
    public Employee createEmployee(String username,String name, String age, float experience,String designation) {
        Employee emp = new Employee();
        emp.setUserName(username);
        emp.setName(name);
        emp.setAge(age);
        emp.setDesignation(designation);
        emp.setExperience(experience);
        
        this.employeeList.add(emp);
        return emp;
    }
}
