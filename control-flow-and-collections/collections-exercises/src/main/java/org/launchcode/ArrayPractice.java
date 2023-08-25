package org.launchcode;
import java.util.Arrays;

public class ArrayPractice {
   public static void main(String[] args) {
       /*int[] intArray = {1,1,2,3,5,8};
        for (int integerArray : intArray){
            if((integerArray%2)==1){
          System.out.println(integerArray);}
        }*/
        String str = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        String[] strArray = str.split(" ");
       String[] strArray1 = str.split("\\. ");
       //System.out.println(Arrays.toString(strArray));
       System.out.println(Arrays.toString(strArray1));

   }
}
