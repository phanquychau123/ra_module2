package session4.bai5;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    Student[] arrStudent = new Student[100];
    int currentIndex = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            Main main = new Main();
        do {
            System.out.println("*******************MENU*******************");
            System.out.println("1: hien thi danh sach");
            System.out.println("2: them moi hoc sinh");
            System.out.println("3: sua thong tin hoc sinh dua vao ma hs");
            System.out.println("4: xoa hs dua vao ma hs");
            System.out.println("5: thoat");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    main.displayListStudent();
                    break;
                case 2:
                    main.addNewStudent();
                    break;
                case 3:
                    main.updateStudent();
                    break;
                case 4:
                    main.deleteStudent();
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.err.println("vui long chon tu 1 den 5");
            }
        } while (true);
    }

    public  void displayListStudent() {
        for (int i = 0; i < currentIndex; i++) {
            arrStudent[i].displayData();
        }
    }
    public void addNewStudent(){
        Scanner sc=new Scanner(System.in);
        System.out.println("nhap so sv can them moi");
        int numberAdd = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < numberAdd; i++) {
            arrStudent[currentIndex]=new Student();
            arrStudent[currentIndex].inputData();
            currentIndex++;
        }
    }
    public void updateStudent(){
        Scanner sc =new Scanner(System.in);
        System.out.println("nhap studentId can sua");
        String updateStudentId = sc.nextLine();
        int indexStudentUpdate = getByIndexId(updateStudentId);
        if (indexStudentUpdate>=0){
            boolean isExit = true;
            do {
                System.out.println("1: cap nhap ten sv");
                System.out.println("2: cap nhap tuoi sv");
                System.out.println("3: cap nhap dia chi sv");
                System.out.println("4: cap nhap gioi tinh");
                System.out.println("5: cap nhap sdt");
                System.out.println("6: thoat");
                int choice = Integer.parseInt(sc.nextLine());
                switch (choice){
                    case 1:
                        System.out.println("nhap vao ten sv");
                        arrStudent[indexStudentUpdate].setStudentName(sc.nextLine());
                        break;
                    case 2:
                        System.out.println("nhap tuoi sv");
                        arrStudent[indexStudentUpdate].setAge(Integer.parseInt(sc.nextLine()));
                        break;
                    case 3:
                        System.out.println("nhap dia chi sv");
                        arrStudent[indexStudentUpdate].setAddress(sc.nextLine());
                        break;
                    case 4:
                        System.out.println("nhap gioi tinh true la nam false la nu");
                        arrStudent[indexStudentUpdate].setGen(sc.nextBoolean());
                        break;
                    case 5:
                        System.out.println("nhap sdt");
                        arrStudent[indexStudentUpdate].setPhoneNumber(sc.nextLine());
                        break;

                    case 6:
                        isExit=false;
                        break;
                    default:
                        System.out.println("chon tu 1-5");
                }
            }while (isExit);
        }else {
            System.err.println("ma sv k ton tai");
        }

    }
    public void deleteStudent(){
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap ma sv can xoa");
        String studentIdDelete = sc.nextLine();
        int indexStudentDelete = getByIndexId(studentIdDelete);
        if (indexStudentDelete>=0){
            for (int i = indexStudentDelete; i <currentIndex-1 ; i++) {
                arrStudent[i]=arrStudent[i+1];
            }
            arrStudent[currentIndex-1]=null;
            currentIndex--;
        }else {
            System.err.println("ma sv k ton tai");
        }
    }
    public int getByIndexId(String studentId){
        for (int i = 0; i < currentIndex; i++) {
            if (arrStudent[i].getStudentId().equals(studentId)){
                return i;
            }
        }
        return -1;
    }
}
