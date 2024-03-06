import java.util.Scanner;

class SumOfIntegerDigits {
    public static void main(String[] args) {
        message();

        //Step 1: Get the Input
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter an integer: ");

        int num = input.nextInt();
        int sum = sumOfDigits(num);
        System.out.println("The sum of digits: " + sum);
    }

    public static int sumOfDigits(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;

    }
    public static void message() {
        System.out.println("Computing the sum of the digits of an integer");
    }
}

