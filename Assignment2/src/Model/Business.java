/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author nishipancholi
 */
public class Business {
    InsurancePlans insurancePlan;
    
    public Business(){
        this.insurancePlan = new InsurancePlans();
    }

    public InsurancePlans getInsurancePlan() {
        return insurancePlan;
    }

    public void setInsurancePlan(InsurancePlans insurancePlan) {
        this.insurancePlan = insurancePlan;
    }
    
    
}
