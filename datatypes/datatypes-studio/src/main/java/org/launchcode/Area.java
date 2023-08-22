package org.launchcode;
import java.util.Scanner;
public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a radius: ");

        if(input.hasNextDouble()){
            double radius = input.nextDouble();
            if (radius<0){
                while (radius<0) {
                    System.out.println("Enter a valid radius (in positive number): ");
                    radius = input.nextDouble();
                }
            }
            System.out.println("The area of a circle of radius " + radius +" is "+Circle.getArea(radius));

            } else{
            System.err.println("Enter a valid radius (in positive number): ");
             }
        input.close();
    }
}
