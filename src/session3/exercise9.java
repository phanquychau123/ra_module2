package session3;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class exercise9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("moi ban nhap email");
        String email = sc.nextLine();
        System.out.println("nhap mat khau");
        String password= sc.nextLine();
        // Regex cho email
        String emailRegex = "^[A-Za-z0-9+_.-]+@(.+)$";
        // Regex cho password (không có dấu cách và lớn hơn 6 kí tự)
        String passwordRegex = "^\\S{7,}$";
        Pattern emailPattern = Pattern.compile(emailRegex);
        Matcher emailMatcher = emailPattern.matcher(email);
        Pattern passwordPattern = Pattern.compile(passwordRegex);
        Matcher passwordMatcher = passwordPattern.matcher(password);
        if (emailMatcher.matches()) {
            System.out.println("Email hợp lệ.");
        } else {
            System.out.println("Email không hợp lệ.");
        }

        if (passwordMatcher.matches()) {
            System.out.println("Password hợp lệ.");
        } else {
            System.out.println("Password không hợp lệ.");
        }
    }
}
