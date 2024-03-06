import java.util.Scanner;

public class Sum {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the first number: ");
        int firstNum = input.nextInt();

        System.out.print("Please enter the second number: ");
        int secondNum = input.nextInt();

        int sum = firstNum + secondNum;
        System.out.println("Total sum is: " + sum);


    }
}
