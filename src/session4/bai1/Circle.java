package session4.bai1;

import java.util.Scanner;

public class Circle {
    float radius;
    String color;
    public Circle(){
    }

    public Circle(float radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public double chuvi(){
        return 2*Math.PI*radius;
    }
    public double dientich(){
        return Math.PI*radius*radius;
    }
    public void inputData(){
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap ban kinh hinh tron");
        this.radius = Float.parseFloat(sc.nextLine());
        System.out.println("nhap mau hinh tron");
        this.color = sc.nextLine();
    }
    public void displayData(){
        System.out.println("thong tin cua hinh tron la : ");
        System.out.println("ban kinh : " + radius + " color : " + color);
    }
}
