package ra;

import java.util.Scanner;

public class exercise2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int exchange = 31000;
        System.out.println("nhap so tien ban muon quy doi");
        int money = scanner.nextInt();
        System.out.println(money +"$"+ " bang" + " "+(money*exchange)+ "vnd");
    }
}
