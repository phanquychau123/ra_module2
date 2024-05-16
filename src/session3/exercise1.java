package session3;

import java.util.Arrays;
import java.util.Scanner;

public class exercise1 {
    public static void main(String[] args) {
int [] arr = {10,4,6,7,8,6,0,0,0,0};
        System.out.println(Arrays.toString(arr));
        Scanner sc= new Scanner(System.in);
        System.out.println("nhap so ban muon xoa");
        int deleteNumber = Integer.parseInt(sc.nextLine());
        int deleteIndex = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==deleteNumber){
                deleteIndex=i;
                break;
            }
        }
        if (deleteIndex!=-1){
            for (int i = deleteIndex; i <arr.length-1 ; i++) {
                arr[i]=arr[i+1];
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
