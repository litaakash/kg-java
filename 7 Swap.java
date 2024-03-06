import java.util.Scanner;

class Swap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("We are swapping two number\n");

        System.out.print("Please enter the value of A: ");
        int a = input.nextInt();

        System.out.print("Please enter the value of B: ");
        int b = input.nextInt();

        int c = a;
        a = b;
        b = c;

        System.out.println("Value of A is: " + a);
        System.out.println("Value of B is: " + b);
    }
}
