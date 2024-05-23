package session5.exercise5;

public class Main {
    public static void main(String[] args) {
                int[] intArray = {1, 2, 3, 4, 5};
                int maxInt = ArrayCalculator.maxOfArray(intArray);
                System.out.println("Max of int array: " + maxInt);
                int minInt = ArrayCalculator.minOfArray(intArray);
                System.out.println("Min of int array: " + minInt);
                double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5};
                double maxDouble = ArrayCalculator.maxOfArray(doubleArray);
                System.out.println("Max of double array: " + maxDouble);
                double minDouble = ArrayCalculator.minOfArray(doubleArray);
                System.out.println("Min of double array: " + minDouble);
            }
        }