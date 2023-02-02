/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author nishipancholi
 */
public class Validations {

    public boolean checkNullEmpty(String fieldName) {
        if (fieldName != null && fieldName.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please fill out the field, it cannot be null or empty!");
            return false;
        } else {
            return true;
        }
    }

    public boolean checkName(String name) {
        if (name != null && name.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please fill out the field, it cannot be null or empty!");
            return false;
        } else {
            if (name.matches("[A-Z][a-z]*")) {
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Please fill a valid Name with the captial initial!");
                return false;
            }
        }
    }

    public boolean checkEmail(String email) {
        if (email != null && email.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please fill out the field, it cannot be null or empty!");
            return false;
        } else {
            String regexPattern = "^(?=.{1,64}@)[A-Za-z0-9_-]+(\\.[A-Za-z0-9_-]+)*@"
                    + "[^-][A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$";
            if (Pattern.compile(regexPattern).matcher(email).matches()) {
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Please fill a valid email!");
                return false;
            }
        }
    }
    
    public boolean checkPhone(String phone) {
        if (phone != null && phone.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please fill out the field, it cannot be null or empty!");
            return false;
        } else {
            String regexPattern = "^\\d{10}$";
            if (Pattern.compile(regexPattern).matcher(phone).matches()) {
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Please fill a valid phone!");
                return false;
            }
        }
    }
    
    public boolean checkNoNegativeZero(String fieldName) {
        if (fieldName != null && fieldName.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please fill out the field, it cannot be null or empty!");
            return false;
        } else {
            String regexPattern = "^[1-9]\\d*(\\.\\d+)?$";
            if (Pattern.compile(regexPattern).matcher(fieldName).matches()) {
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Please fill a valid number!");
                return false;
            }
        }
    }
    
    public boolean checkRange(String fieldName) {
        if (fieldName != null && fieldName.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please fill out the field, it cannot be null or empty!");
            return false;
        } else {
            String regexPattern = "^((1)((\\.0[1-9]{1})?$|(\\.[1-5][0-9]{0,2})?$)?$|(5)(\\.[0-0]{0,2})?$|([1-5])(\\.[0-9]{1,2})?$)";
            if (Pattern.compile(regexPattern).matcher(fieldName).matches()) {
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Please fill a valid range from 1-5 in difficulty!");
                return false;
            }
        }
    }
    
    
}
