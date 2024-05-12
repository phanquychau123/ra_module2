package session2;

import java.util.Scanner;

public class exercise8 {
    public static void main(String[] args) {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("moi nhap canh a");
            int a = Integer.parseInt(scanner.nextLine());
            System.out.println("moi nhap canh b");
            int b = Integer.parseInt(scanner.nextLine());
            System.out.println("moi nhap canh c");
            int c = Integer.parseInt(scanner.nextLine());
            if (isValidTriangle(a,b,c)){
                System.out.println("chu vi hinh tam giac la: " + (a+b+c) );
                break;
            }else {
                System.out.println("ba canh ko the tao nen mot tam giac vui long nhap lai");
            }

        }
    }
    public static boolean isValidTriangle(int a,int b,int c){
        return (a+b>c)&&(a+c>b)&&(b+c>a);
    }
}