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
public class ApplicantDirectory {
    ArrayList<Applicant> applicantList;
    
    public ApplicantDirectory(){
        this.applicantList = new ArrayList<Applicant>();
    }

    public ArrayList<Applicant> getApplicantList() {
        return applicantList;
    }

    public void setApplicantList(ArrayList<Applicant> applicantList) {
        this.applicantList = applicantList;
    }
    
    public Applicant createApplicant(int applicationId,String ownerFirstName,String ownerLastName,Date applicationDate){
        Applicant application= new Applicant();
        application.setApplicationId(applicationId);
        application.setOwnerFirstName(ownerFirstName);
        application.setOwnerLastName(ownerLastName);
        application.setApplicationDate(applicationDate);
        this.applicantList.add(application);
         
        return application;
    }

    public Boolean checkIfApplicationUnique(int appId){
        for(Applicant app:this.applicantList){
            int applicationId= Integer.valueOf(app.getApplicationId());
            if(appId==applicationId){
                return false;
            }
        }
        return true;
    }
    
    public void removeApplication(int appId){
        for(Applicant app: this.applicantList){
            int applicationId= Integer.valueOf(app.getApplicationId());
            if(appId==applicationId){
                this.applicantList.remove(app);
                break;
            }
        }
    }   
    
}
