package session5.exercise3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("nhap do dai ba canh");
        double side1 = scanner.nextDouble();
        double side2 = scanner.nextDouble();
        double side3 = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("nhap mau tam giac");
        String color = scanner.nextLine();
        Triangle triangle=new Triangle(color,side1,side2,side3);
        System.out.println("Triangle details:");
        System.out.println(triangle.toString());
        System.out.println("Area: "+ triangle.getArea());
        System.out.println("Perimeter: "+ triangle.getPerimeter());
    }
}
