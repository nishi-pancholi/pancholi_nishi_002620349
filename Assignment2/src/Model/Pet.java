/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author nishipancholi
 */
public class Pet {
    String  petName;
    int petAge;
    String petType;
    String petGender;
    String petBreed;
    ArrayList<Vaccine> vaccineList;
    
    public Pet(){
        this.vaccineList = new ArrayList<Vaccine>();
    }

    public String getPetName() {
        return petName;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }

    public int getPetAge() {
        return petAge;
    }

    public void setPetAge(int petAge) {
        this.petAge = petAge;
    }

    public String getPetType() {
        return petType;
    }

    public void setPetType(String petType) {
        this.petType = petType;
    }

    public String getPetGender() {
        return petGender;
    }

    public void setPetGender(String petGender) {
        this.petGender = petGender;
    }

    public String getPetBreed() {
        return petBreed;
    }

    public void setPetBreed(String petBreed) {
        this.petBreed = petBreed;
    }

    public ArrayList<Vaccine> getVaccineList() {
           return vaccineList;   
    }

    public void setVaccineList(ArrayList<Vaccine> vaccineList) {
        this.vaccineList = vaccineList;
    }
    
    public Vaccine createVaccine(String vaccineName,boolean courseCompleted){
        Vaccine vaccine= new Vaccine();
        vaccine.setVaccineName(vaccineName);
        vaccine.setCourseCompleted(courseCompleted);
        this.vaccineList.add(vaccine);        
        return vaccine;
    }
    
    @Override
    public String toString(){
        return this.petName;
    }
    
}
