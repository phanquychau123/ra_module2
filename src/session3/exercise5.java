package session3;

import java.util.Arrays;
import java.util.Scanner;

public class exercise5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so phan tu ban muon them");
        int size = Integer.parseInt(sc.nextLine());
        int[]arr=new int[size];
        for (int i = 0; i < size; i++) {
            System.out.printf("numbers[%d]=",i);
            arr[i]=Integer.parseInt(sc.nextLine());
        }
        System.out.println("mang ban vua nhap la : "+ Arrays.toString(arr));
        int minValue = arr[0];
        for (int i = 0; i < size; i++) {
            if (minValue>arr[i]){
                minValue=arr[i];
            }
        }
        System.out.println("gia tri nho nhat trong mang la : "+minValue);
    }
}
