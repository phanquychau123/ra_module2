package ra;

import java.util.Scanner;

public class exercise4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap diem tb cua mon toan");
        int math = Integer.parseInt(scanner.nextLine());
        System.out.println("nhap diem tb cua mon van");
        int literature = Integer.parseInt(scanner.nextLine());
        System.out.println("nhap diem tb cua mon anh");
        int english = Integer.parseInt(scanner.nextLine());
        System.out.println("diem trung binh la " + (math+literature+english)/3);
    }
}
