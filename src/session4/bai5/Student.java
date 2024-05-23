package session4.bai5;

import java.util.Scanner;

public class Student {
    String studentId;
    String studentName;
    int age;
    boolean gen;
    String address;
    String phoneNumber;
    public Student(){

    }

    public Student(String studentId, String studentName, int age, boolean gen, String address, String phoneNumber) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.age = age;
        this.gen = gen;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isGen() {
        return gen;
    }

    public void setGen(boolean gen) {
        this.gen = gen;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void inputData(){
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap ma hoc sinh : ");
        this.studentId = inputStudentId();
        System.out.println("nhap ten hoc sinh");
        this.studentName = sc.nextLine();
        System.out.println("nhap tuoi hoc sinh");
        this.age= Integer.parseInt(sc.nextLine());
        System.out.println("nhap gioi tinh true la nam false la nu");
        this.gen = Boolean.parseBoolean(sc.nextLine());
        System.out.println("nhap dia chi ");
        this.address=sc.nextLine();
        System.out.println("nhap sdt");
        this.phoneNumber= sc.nextLine();

    }
    public void displayData(){
        System.out.printf("ma SV: %s - ten SV: %s - tuoi: %d\n",this.studentId,this.studentName,this.age);
        System.out.printf("gioi tinh: %s - dia chi: %s - sdt: %s\n",this.gen,this.address,this.phoneNumber);
    }
    public String inputStudentId(){
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap ma sv");
        do {
            this.studentId = sc.nextLine();
            if (this.studentId.length()==5){
                if (this.studentId.startsWith("SV")){
                    break;
                }else {
                    System.err.println("ma sv  bat dau bang SV");
                }
            }else {
                System.err.println("ma SV phai co 5 ki tu");
            }
        }while (true);
        return studentId;
    }
}
