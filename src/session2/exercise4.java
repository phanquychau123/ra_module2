package session2;

import java.util.Scanner;

public class exercise4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap so bat dau cau khoang :");
        int start = Integer.parseInt(scanner.nextLine());
        System.out.println("nhap so ket thuc cua khoang :");
        int end = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        for (int i = start; i <= end; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        System.out.println("tong cac so chan trong khoang tu " + start + " den " + end + " la: " + sum);
    }
}
