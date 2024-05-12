package session2;

import java.util.Scanner;

public class exercise1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap so vao day");
        int number = Integer.parseInt(scanner.nextLine());
        if (number % 3 == 0 && number % 5 == 0) {
            System.out.println(number + " chia het cho ca 3 va 5");
        } else if (number % 3 == 0) {
            System.out.println(number + " chia het cho 3");
        } else if (number % 5 == 0) {
            System.out.println(number + " chia het cho 5");
        } else {
            System.out.println(number + " khong chia het cho 3 va 5");
        }
    }
}
