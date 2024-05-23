package session5.exercise5;

public class ArrayCalculator {
        public static int maxOfArray(int[] arr) {
            int max = arr[0];
            for (int num : arr) {
                if (num > max) {
                    max = num;
                }
            }
            return max;
        }
        public static double maxOfArray(double[] arr) {
            double max = arr[0];
            for (double num : arr) {
                if (num > max) {
                    max = num;
                }
            }
            return max;
        }
        public static int minOfArray(int[] arr) {
            int min = arr[0];
            for (int num : arr) {
                if (num < min) {
                    min = num;
                }
            }
            return min;
        }
        public static double minOfArray(double[] arr) {
            double min = arr[0];
            for (double num : arr) {
                if (num < min) {
                    min = num;
                }
            }
            return min;
        }
    }

