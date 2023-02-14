/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author nishipancholi
 */
public class InsurancePlans {
    ArrayList<PlanDetail> insurancePlanList;
    
    public InsurancePlans(){
        this.insurancePlanList = new ArrayList<PlanDetail>();
    }

    public ArrayList<PlanDetail> getInsurancePlanList() {
        return insurancePlanList;
    }

    public void setInsurancePlanList(ArrayList<PlanDetail> insurancePlanList) {
        this.insurancePlanList = insurancePlanList;
    }
    
    public PlanDetail createInsurancePlan(int planId, String planName,float costPerMonth,float costPerAnnum){
        PlanDetail plan= new PlanDetail();
        plan.setPlanId(planId);
        plan.setPlanName(planName);
        plan.setCostPerMonth(costPerMonth);
        plan.setCostPerAnnum(costPerAnnum);
        
        this.insurancePlanList.add(plan);
         
        return plan;
    }

    public Boolean checkIfPlanUnique(int planId){
        for(PlanDetail plan:this.insurancePlanList){
            int planListId= Integer.valueOf(plan.getPlanId());
            if(planId==planListId){
                return false;
            }
        }
        return true;
    }
    
}
