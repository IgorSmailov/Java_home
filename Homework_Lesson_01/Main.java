package Homework_Lesson_01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input Side 1: ");
        double side1 =scanner.nextDouble();

        System.out.println("Please input Side 2: ");
        double side2 =scanner.nextDouble();

        if (side1 != 0 & side2 != 0) {
            Rectangle rectangle = new Rectangle(side1,side2);
            rectangle.setSide1(side1);
            rectangle.setSide1(side2);

            double areaCalculator = rectangle.areaCalculator(side1, side2);
            double perimeterCalculator = rectangle.perimeterCalculator(side1, side2);

            System.out.println("Rectangle size: Side 1=" +rectangle.getSide1() + " x Side 2=" +rectangle.getSide2());
            System.out.println("Rectangle area: " +areaCalculator);
            System.out.println("Rectangle perimeter: " +perimeterCalculator);
            }
       else  System.out.println("ERROR: Sides can't be 0");


    }
}
