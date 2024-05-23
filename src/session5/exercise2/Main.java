package session5.exercise2;

public class Main {
    public static void main(String[] args) {
        // Kiểm thử lớp Point2D
        Point2D point2d = new Point2D(3, 4);
        System.out.println(point2d);  // Point2D(x=3, y=4)
        point2d.setX(5);
        point2d.setY(6);
        System.out.println(point2d);  // Point2D(x=5, y=6)

        // Kiểm thử lớp Point3D
        Point3D point3d = new Point3D(1, 2, 3);
        System.out.println(point3d);  // Point3D(x=1, y=2, z=3)
        point3d.setX(4);
        point3d.setY(5);
        point3d.setZ(6);
        System.out.println(point3d);  // Point3D(x=4, y=5, z=6)
    }
}
