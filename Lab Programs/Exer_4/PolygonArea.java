package Exer_4;

import java.util.*;

public class PolygonArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your choice \n1.Square 2.Rectangle 3.Trinagle 4.Exit: ");
        System.out.print("choice: ");
        int choice = sc.nextInt();
        if (choice == 1) {
            System.out.print("Enter side length of sqaure: ");
            double sideLength = sc.nextDouble();
            area(sideLength);
        }
        if (choice == 2) {

            System.out.print("Enter length, width of rectangle: ");
            double length = sc.nextDouble(), width = sc.nextDouble();
            area(length, width);
        }
        if (choice == 3) {

            System.out.print("Enter 3 sides of triangle: ");
            double side1 = sc.nextDouble(), side2 = sc.nextDouble(), side3 = sc.nextDouble();
            area(side1, side2, side3);
        }
        sc.close();
    }

    // Square area
    static void area(double sideLength) {
        System.out.println(sideLength * sideLength);
    }

    // Rectangle area
    static void area(double height, double width) {
        System.out.println(height * width);
    }

    // Triangle area
    static void area(double side1, double side2, double side3) {
        double s = (side1 + side2 + side3) / 2;
        double ar = s * (s - side1) * (s - side2) * (s - side3);
        if (ar > 0)
            System.out.println(ar);
        else
            System.out.println(0.0);
    }

}
/*
 * Output: -
 * Enter your choice
 * 1.Square 2.Rectangle 3.Trinagle 4.Exit:
 * choice: 1
 * Enter side length of sqaure: 6
 * 36.0
 * 
 * Enter your choice
 * 1.Square 2.Rectangle 3.Trinagle 4.Exit:
 * choice: 2
 * Enter length, width of rectangle: 4 5
 * 20.0
 * 
 * Enter your choice
 * 1.Square 2.Rectangle 3.Trinagle 4.Exit:
 * choice: 3
 * Enter 3 sides of triangle: 4 7 6
 * 143.4375
 */