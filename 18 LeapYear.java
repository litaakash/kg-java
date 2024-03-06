import java.util.Scanner;

class LeapYearChecker {
    public static void main(String[] args) {
        System.out.println("Determines if a given year is a leap year");

        Scanner input = new Scanner(System.in);
        System.out.print("Enter given year: ");
        int year = input.nextInt();

        if (year % 4 == 0 || (year % 100 == 0 && year % 400 != 0)) {
            System.out.println("It is not a Leap Year.");
        } else {
            System.out.println("It's a Leap Year.");
        }
        }
}
