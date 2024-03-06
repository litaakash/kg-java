import java.util.Scanner;
class NumberCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Determining if a number is + - or 0");

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        if (number > 0) {
            System.out.println("It's a positive number");
        } else if (number < 0) {
            System.out.println("It's a negative number");
        } else {
            System.out.println("It's zero");
        }
    }
}
