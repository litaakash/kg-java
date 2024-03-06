import java.util.Scanner;

class SumOfOddNums {
    public static void main(String[] args) {
        System.out.println("Sum of odd numbers");
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a number: ");

        int num = input.nextInt();
        int sum = oddSum(num);

        System.out.println("Sum of odd numbers till " + num  + " is: " + sum);

    }

    public static int oddSum(int num) {
        int sum = 0;
        int i = 1;
        while( i <= num) {
            sum = sum + i;
            i += 2;
        }
        return sum;
    }

}
