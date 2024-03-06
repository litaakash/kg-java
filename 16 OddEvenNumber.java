import java.util.Scanner;

class OddEvenCheck {
    public static void main(String[] args) {
        System.out.println("Checking if a number is odd or even\n");

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");

        int num = input.nextInt();

        if (num % 2 == 0) {
            System.out.println("It's an even number.");
        } else {
            System.out.println("It's an odd number.");
        }
    }
}
