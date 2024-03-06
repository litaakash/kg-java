import java.util.Scanner;

class CalculateFactorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int num = input.nextInt();
        long fact = factorial(num);

        System.out.println("Factorial of " + num + " is: " + fact);
    }

    public static long factorial(int num) {
        if (num < 2) { // 0! and 1! is always 1
            return 1;
        }
        long fact = 1; // 1! 2! 3! 4! 5! fact will start from 1 then 2 then 3 and so on
        int i = 2; // any number multiplying with 1 will always be 1 which is redundant so starting from 2
        /*
        1! = 1
        2! = 1 x 2
        3! = 1 x 2 x 3
        4! = 1 x 2 x 3 x 4
         *
         */

        while ( i <= num) {
            fact *= i; // Multiply factorial by current number
            i++;
        }


        return fact; // Return the calculated factorial
    }
}
