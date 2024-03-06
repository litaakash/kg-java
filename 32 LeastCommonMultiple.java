import java.util.Scanner;

class LeastCommonMultiple {
    public static void main(String[] args) {
        System.out.println("Calculating LCM");
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter the first number: ");
        int first = input.nextInt();
        System.out.print("Please enter the second number: ");
        int second = input.nextInt();

        int lcm = lcm(first, second);
        System.out.println("LCM of two numbers: " + lcm);

    }

    public static int lcm(int first, int second) {
        int i = 1; // Start counting from 1

        // Start counting from the first number and continue until the first number is divisible by the second number
        while (i <= second) {
            int factor = first * i;// If first number is 15, then this reads as 15 * 1 then 15 * 2 and so on
            if (factor % second == 0) {
                // factor is LCM since first number is divisible by itself, and the second number is also divisible by the first number

                return factor;
            }

            i++;
        }
        return 0;
    }
}
