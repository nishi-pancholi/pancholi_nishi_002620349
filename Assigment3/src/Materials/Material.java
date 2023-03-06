/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Materials;

import java.util.Date;

/**
 *
 * @author nishipancholi
 */
public class Material {
    String materialId;
    int serialNumber;
    String name;
    Date registrationDate;
    boolean isAvailable;
    private static int count = 0;
    
    public Material(){
        this.count++;   
        this.serialNumber =this.count;
        this.materialId="MaterialNo"+this.count;
    }

    public String getMaterialId() {
        return materialId;
    }

    public void setMaterialId(String materialId) {
        this.materialId = materialId;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Material.count = count;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(Date registrationDate) {
        this.registrationDate = registrationDate;
    }

    public boolean isIsAvailable() {
        return isAvailable;
    }

    public void setIsAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }
   
    @Override
    public String toString() {
       return this.materialId;
    }
}
