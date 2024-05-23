package session5.exercise1;

public class Main {
    public static void main(String[] args) {
       Circle circle = new Circle(3,"red");
        System.out.println(circle.toString());
        System.out.println("Area: " + circle.getArea());
        Cylinder cylinder = new Cylinder(4,"blue",7);
        System.out.println(cylinder.toString());
        System.out.println("Volume: "+ cylinder.getVolume());
    }
}
