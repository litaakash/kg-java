import java.util.Scanner;

class Fibonacci {
    public static void main(String[] args) {

        System.out.println("each number is the sum of the two that precede it. It starts from 0 and 1 usually.\n");
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int num = input.nextInt();

        System.out.println("Fibonacci numbers until " + num + " are: ");
    }

//    public static void fibonacci(int num) {
//        return 0;
//    }
}
