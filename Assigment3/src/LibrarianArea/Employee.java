/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LibrarianArea;

import Persons.Person;
import Services.RentalRequest;
import java.util.ArrayList;

/**
 *
 * @author nishipancholi
 */
public class Employee extends Person{
    float experience;
    String designation;
    
    public Employee(){
            super();
    }

    public float getExperience() {
        return experience;
    }

    public void setExperience(float experience) {
        this.experience = experience;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }
    
}
