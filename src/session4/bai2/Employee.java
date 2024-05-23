package session4.bai2;

import java.util.Scanner;

public class Employee {
    int employeeId;
    String employeeName;
    int age;
    boolean gen;
    double rate;
    public Employee(){

    }

    public Employee(int employeeId, String employeeName, int age, boolean gen, double rate) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.age = age;
        this.gen = gen;
        this.rate = rate;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
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

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public void inputData(){
        Scanner sc =new Scanner(System.in);
        System.out.println("nhap ma nhan vien");
        employeeId = Integer.parseInt(sc.nextLine());
        System.out.println("nhap ten nhan vien");
        employeeName = sc.nextLine();
        System.out.println("nhap tuoi");
        age = Integer.parseInt(sc.nextLine());
        System.out.println("nhap gioi tinh : (true la nam false la nu)");
        gen = sc.nextBoolean();
        System.out.println("nhap he so luong :");
        rate =sc.nextDouble();
    }
    public double calSalary(){
        return rate*1300000;
    }
    public void displayData(){
        System.out.println("ma nhan vien la : "+employeeId);
        System.out.println("ten nhan vien la : "+ employeeName);
        System.out.println("tuoi nhan vien la : "+ age);
        System.out.println("gioi tinh "+ (gen?"nam":"nu"));
        System.out.println("luong : "+ calSalary());
    }
}
