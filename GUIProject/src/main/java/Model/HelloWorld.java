/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.Arrays;

/**
 *
 * @author nishipancholi
 */
public class HelloWorld {
    
    int intergerVariable= 100;
    double doubleVariable= 2.1456789d;
    float floatVariable= 1.254f;
    String stringVariable= "Hello World";
    boolean booleanVariable= false;
    char charVariable = 'N';
    int[] integerArray = new int[] {1,2,3,4};
    
    public static void main(String args[]){

        
        HelloWorld obj = new HelloWorld();
        
        System.out.println("The Interger Value is: " + obj.intergerVariable);
        System.out.println("The Double Value is: " + obj.doubleVariable);
        System.out.println("The Float Value is: " + obj.floatVariable);
        System.out.println("The String Value is: " + obj.stringVariable);
        System.out.println("The Boolean Value is: " + obj.booleanVariable);
        System.out.println("The Character Value is: " + obj.charVariable);
        System.out.println("The Integer Array is: " + Arrays.toString(obj.integerArray));
        
    }
}
