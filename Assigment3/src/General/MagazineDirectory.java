/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package General;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author nishipancholi
 */
public class MagazineDirectory {
     ArrayList<Magazine> magazinelist;
     
     public MagazineDirectory() {
        this.magazinelist = new ArrayList<Magazine>();
    }

    public ArrayList<Magazine> getMagazinelist() {
        return magazinelist;
    }

    public void setMagazinelist(ArrayList<Magazine> magazinelist) {
        this.magazinelist = magazinelist;
    }   
    
    public Magazine createMagazine(int serialNumber, String name, Date registrationDate, boolean isAvailable,String companyName, String issueType) {
        Magazine mag = new Magazine();
        
        mag.setCompanyName(companyName);
        mag.setSerialNumber(serialNumber);
        mag.setIssueType(issueType);
        mag.setIsAvailable(isAvailable);
        mag.setName(name);
        mag.setRegistrationDate(registrationDate);
        
        this.magazinelist.add(mag);
        return mag;
    }
}
