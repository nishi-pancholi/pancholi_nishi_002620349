/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.Date;

/**
 *
 * @author nishipancholi
 */
public class Applicant {
    
    int applicationId;
    String ownerFirstName;
    String ownerLastName;
    Date applicationDate;
    private Pet petDetails;
    private PlanDetail insPlan;

    public Applicant(){
        this.petDetails= new Pet();
    }
    public int getApplicationId() {
        return applicationId;
    }

    public void setApplicationId(int applicationId) {
        this.applicationId = applicationId;
    }

    public String getOwnerFirstName() {
        return ownerFirstName;
    }

    public void setOwnerFirstName(String ownerFirstName) {
        this.ownerFirstName = ownerFirstName;
    }

    public String getOwnerLastName() {
        return ownerLastName;
    }

    public void setOwnerLastName(String ownerLastName) {
        this.ownerLastName = ownerLastName;
    }

    public Date getApplicationDate() {
        return applicationDate;
    }

    public void setApplicationDate(Date applicationDate) {
        this.applicationDate = applicationDate;
    }

    public Pet getPetDetails() {
        return petDetails;
    }

    public void setPetDetails(Pet petDetails) {
        this.petDetails = petDetails;
    }

    public PlanDetail getInsPlan() {
        return insPlan;
    }

    public void setInsPlan(PlanDetail insPlan) {
        this.insPlan = insPlan;
    }
     
    public Pet createPet(String petName,int petAge,String petType,String petGender,String petBreed){
        Pet pet=new Pet();
        pet.setPetName(petName);
        pet.setPetBreed(petBreed);
        pet.setPetGender(petGender);
        pet.setPetType(petType);
        pet.setPetAge(petAge);
        this.setPetDetails(pet);
         
        return pet;
    }

    
    @Override
    public String toString(){
        return String.valueOf(this.applicationId);
    } 
    
}
