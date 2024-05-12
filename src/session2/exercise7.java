package session2;

import java.util.Scanner;

public class exercise7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("**************MENU***************");
            System.out.println("1: kiem tra tinh chan le cua mot so");
            System.out.println("2: kiem tra so nguyen to");
            System.out.println("3: kiem tra mot so co chia het cho 3 khong");
            System.out.println("4: thoat");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("nhap so ban can kiem tra");
                    int number = Integer.parseInt(scanner.nextLine());
                    if (number%2==0){
                        System.out.println(number + " la so chan");
                    }else {
                        System.out.println(number + " la so le");
                    }
                    break;
                case 2:
                    System.out.println("nhap so ban can kiem tra");
                    int snt = Integer.parseInt(scanner.nextLine());
                    if (isPrime(snt)){
                        System.out.println(snt + " la so nguyen to");
                    }else {
                        System.out.println( snt + " khong la so nguyen to");
                    }
                    break;
                case 3:
                    System.out.println("nhap so ban can kiem tra");
                    int number2= Integer.parseInt(scanner.nextLine());
                    if (number2%3==0){
                        System.out.println(number2 + " chia het cho 3");
                    }else {
                        System.out.println(number2 + " khong chia het cho 3");
                    }
                    break;
                case 4:
                    System.exit(0);
            }
        }while (true);
    }
    public static boolean isPrime (int n){
        if (n<=1){
            return false;
        }
        for (int i = 2;i<n;i++){
            if (n%i ==0){
                return false;
            }
        }
        return true;
    }
}
