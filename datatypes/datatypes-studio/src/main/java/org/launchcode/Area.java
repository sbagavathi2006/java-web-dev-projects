package org.launchcode;
import java.util.Scanner;
public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a radius: ");

        if(input.hasNextDouble()){
            double radius = input.nextDouble();
            if(radius<0){
                System.err.println("Enter a valid radius (in positive number): ");
            }
            System.out.println("The area of a circle of radius " + radius +" is "+Circle.getArea(radius));
            input.close();
            } else{
            System.err.println("Enter a valid radius (in positive number): ");
        }
    }
}
