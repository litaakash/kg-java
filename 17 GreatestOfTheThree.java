import java.util.Scanner;

class GreatestOfTheThree {
    public static void main(String[] args) {

        System.out.println("Determines the greatest of the three");
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = input.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = input.nextInt();

        System.out.print("Enter the third number: ");
        int num3 = input.nextInt();

        if (num1 > num2 && num1 > num3) {
            System.out.println("Num1 is the greatest: " + num1);
        } else if (num2 > num1 && num2 > num3) {
            System.out.println("Num2 is the greatest: " + num2);
        } else {
            System.out.println("Num3 is the greatest: " + num3);
        }
    }
}
