import java.util.Scanner;

class Triangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("What's the base? ");
        double base = input.nextDouble();

        System.out.print("What's the height? ");
        double height = input.nextDouble();

        double A = (height * base)/2;
        System.out.println(A);

    }
}
