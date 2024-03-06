import java.util.Scanner;

class CompoundInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter initial principal balance: ");
        double P = input.nextDouble();

        System.out.print("Please enter interest rate: ");
        double R = input.nextDouble();

        System.out.print("Please enter number of time periods elapsed: ");
        double t = input.nextDouble();

        double A = P * Math.pow(1 + R/100, t);
        System.out.println(A);

    }
}
