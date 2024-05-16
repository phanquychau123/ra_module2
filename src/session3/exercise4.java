package session3;

import java.util.Scanner;

public class exercise4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so hang");
        int rows = Integer.parseInt(sc.nextLine());
        System.out.println("nhap so cot");
        int cols =Integer.parseInt(sc.nextLine());
        int [][] arr = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.println("nhap phan tu co gia tri : ["+i+"]["+j+"]");
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("mang ban vua nhap la");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        int maxValue = arr[0][0];
        int maxRow=0;
        int maxCol = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (arr[i][j]>maxValue){
                    maxValue= arr[i][j];
                    maxRow=i;
                    maxCol=j;
                }
            }
        }
        System.out.println("gia tri lon nhat trong mang la : "+ maxValue);
    }
}
