package session3;

import java.util.Arrays;
import java.util.Scanner;

public class exercise3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so phan tu cua mang 1");
        int sizeArr1 = Integer.parseInt(sc.nextLine());
        int[] arr1 = new int[sizeArr1];
        for (int i = 0; i < sizeArr1; i++) {
            System.out.printf("numberArr1[%d]=",i);
            arr1[i]=Integer.parseInt(sc.nextLine());
        }
        System.out.println("mang 1 la :"+ Arrays.toString(arr1));
        System.out.println("nhap so phan tu cho mang 2");
        int sizeArr2 = Integer.parseInt(sc.nextLine());
        int[] arr2 = new int[sizeArr2];
        for (int i = 0; i < sizeArr2; i++) {
            System.out.printf("numberArr2[%d]=",i);
            arr2[i]=Integer.parseInt(sc.nextLine());
        }
        System.out.println("mang 2 la :" +Arrays.toString(arr2));
        int[] arr3 = new int[sizeArr1+sizeArr2];
        System.out.println("mang sau khi gop mang 1 va 2 la");
        for (int i = 0; i < sizeArr1; i++) {
            arr3[i]=arr1[i];
        }
        for (int i = 0; i < sizeArr2; i++) {
            arr3[sizeArr1+i]=arr2[i];
        }
        System.out.println(Arrays.toString(arr3));
    }
}
