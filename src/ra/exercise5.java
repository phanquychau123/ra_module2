package ra;

import java.util.Scanner;

public class exercise5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap ban kinh hinh tron");
        int radius = Integer.parseInt(scanner.nextLine());
        System.out.println("chu vi hinh tron la " + 2*Math.PI*radius );
        System.out.println("dien tich hinh tron la "+ Math.PI*radius*radius);

    }
}
