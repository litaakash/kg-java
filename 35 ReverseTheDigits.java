import java.util.Scanner;

class ReverseTheDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Reversing a given number\n");

        System.out.print("Please enter a number: ");
        int num = input.nextInt();

        int reverseNumber = reverseNumber(num);
        System.out.println("Entered number is " + num + " and reverse is " + reverseNumber);

    }
    public static int reverseNumber(int num) {
        int newNum = 0;
        while (num > 0) {
            int digit = num % 10;
            newNum = newNum * 10 + digit;
            num /= 10;

        }

        return newNum;
    }
}
