package session3;

import java.util.Arrays;
import java.util.Scanner;

public class exercise2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so phan tu ban muon them");
        int size = Integer.parseInt(sc.nextLine());
        int []arr = new int[size];
        System.out.println("nhap gia tri cac phan tu");
        for (int  i = 0;i  < arr.length;i ++) {
            arr[i]=Integer.parseInt(sc.nextLine());
        }
        System.out.println("mang ban dau la : "+Arrays.toString(arr));
        System.out.println("nhap so ban muon chen");
        int number = Integer.parseInt(sc.nextLine());
        System.out.println("nhap vi tri ban muon chen");
        int index = Integer.parseInt(sc.nextLine());
        int [] newArr = new int[arr.length+1];
        for (int i = 0; i < index; i++) {
            newArr[i]=arr[i];
        }
        newArr[index]=number;
        for (int i = index +1; i < arr.length; i++) {
            newArr[i]=arr[i-1];
        }
        System.out.println("mang moi sau khi them la : " + Arrays.toString(newArr));
    }
}
