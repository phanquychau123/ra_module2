package session2;

public class exercise5 {
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

    public static void main(String[] args) {
        for (int j = 2; j < 100; j++) {
            if (isPrime(j)) {
                System.out.println(j);
            }
        }
    }
}
