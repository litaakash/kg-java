import java.util.Scanner;

class FloatMultiplication {
    public static void main(String[] args) {
        Scanner input  =  new Scanner(System.in);
        System.out.print("We are floating\n");

        System.out.print("Please enter your first float ");
        double first = input.nextFloat();

        System.out.print("Please enter second float ");
        double second = input.nextFloat();

        System.out.println("Multiplying two floats together: " + (first * second));

    }
}
