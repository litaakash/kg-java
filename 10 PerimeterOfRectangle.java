import java.util.Scanner;

class PerimeterOfRectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Perimeter of a rectangle\n ");

        System.out.print("Please enter A: ");
        int a = input.nextInt();

        System.out.print("Please enter B: ");
        int b = input.nextInt();

        System.out.print("Please enter C: ");
        int c = input.nextInt();

        System.out.print("Please enter D: ");
        int d = input.nextInt();

        System.out.println("Perimeter of a rectangle is ABCD: " + (a+b+c+d));
    }
}
