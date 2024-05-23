package session4.bai1;

import session4.bai1.Circle;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.inputData();
        circle.displayData();
        System.out.println("chu vi la : " + circle.chuvi());
        System.out.println("dien tich la : "+ circle.dientich());
    }
}
