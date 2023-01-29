/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Program;

import java.util.Arrays;

/**
 *
 * @author nishipancholi
 */
public class ArrayProgram {

    public static void main(String args[]) {
        int integerArray[] = {1, 2, 5, 6, 3, 2};
        System.out.println("Array before Multiplication:"+ Arrays.toString(integerArray));
        for (int i = 0; i < integerArray.length; i++) {
            if (i%2==0) {
                integerArray[i]=integerArray[i]*2;
            }
            else{
                integerArray[i]=integerArray[i]*3;
            }
        }
        System.out.println("Array after Multiplication:"+ Arrays.toString(integerArray));
    }
}
