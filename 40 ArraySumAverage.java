import java.util.EnumMap;
import java.util.Scanner;

class ArraySumAverage {
    public static void main(String[] args) {
        System.out.println("Addition and Average");
        int[] numArray = ArrayUtility.inputArray();

        long sum = sum(numArray);
        double avg = average(numArray);

        System.out.println("Sum of numbers is: " + sum);
        System.out.println("Average of numbers is: " + avg);
    }


    public static long sum(int[] numArray) {
        long sum = 0; // Storing the addition of two numbers as iterating through numArray
        int i = 0;
        while (i < numArray.length) {
            sum += numArray[i];
            i++;
        }

        return sum;
    }


    public static double average(int[] numArray) {
        double sum = sum(numArray);
        return sum / (numArray.length);
    }
}
