package ra;

import java.util.Scanner;

public class exercise3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap canh cua hinh vuong");
        int a = Integer.parseInt(scanner.nextLine());
        System.out.println("chu vi hinh vuong la"+ " " +a*4);
    }
}
