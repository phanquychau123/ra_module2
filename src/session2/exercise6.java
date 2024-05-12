package session2;

public class exercise6 {
    public static void main(String[] args) {
        int count = 0;
        int number = 2;
        System.out.println("20 so nguyen to dau tien la : ");
        while (count < 20) {
            if (isPrime(number)) {
                System.out.println(number + " ");
                count++;
            }
            number++;
        }
    }

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
