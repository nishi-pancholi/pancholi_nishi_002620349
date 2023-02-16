/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author nishipancholi
 */
public class PlanDetail {
    
    int planId;
    String planName;
    float costPerMonth;
    float costPerAnnum;
    

    public int getPlanId() {
        return planId;
    }

    public void setPlanId(int planId) {
        this.planId = planId;
    }

    public String getPlanName() {
        return planName;
    }

    public void setPlanName(String planName) {
        this.planName = planName;
    }

    public float getCostPerMonth() {
        return costPerMonth;
    }

    public void setCostPerMonth(float costPerMonth) {
        this.costPerMonth = costPerMonth;
    }

    public float getCostPerAnnum() {
        return costPerAnnum;
    }

    public void setCostPerAnnum(float costPerAnnum) {
        this.costPerAnnum = costPerAnnum;
    }
    
    @Override
    public String toString(){
        return String.valueOf(this.planId);
    }   
}
