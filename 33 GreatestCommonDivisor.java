import java.util.Scanner;

class GreatestCommonDivisor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Greatest Common Divisor");

        System.out.print("Please enter the first number: ");
        int first = input.nextInt();

        System.out.print("Please enter the second number: ");
        int second = input.nextInt();

        int result = GCD(first, second);
        System.out.println("Greatest common divisor of two numbers: " + result );

    }

    public static int GCD(int num1, int num2) {
        int gcd = 1;
        int i = 2;
        int least = leastNum(num1, num2);

        while (i <= least) {
            if (num1 % i == 0 && num2 % i == 0) {
                gcd = i;
            }
            i++;
        }
        return gcd;
    }

    public static int leastNum (int num1, int num2) {
        if(num1 < num2) {
            return num1;
        } else {
            return num2;
        }
    }
}
