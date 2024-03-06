import java.util.Scanner;

class MuliplicationTable {
    public static void main(String[] args) {
        message();

        Scanner scanner = new Scanner(System.in);// here we are receving a number form user
        System.out.print("Please enter a number: ");
        int num = scanner.nextInt();// Store user input in the variable 'num' for generating the multiplication table
        printMultiplicationTable(num); //Call the function to print the multiplication table for the specified number
    }

    public static void printMultiplicationTable(int num) {
        int i = 1; // i is the number table will be multiplying to
        while (i <= 10) {
            System.out.println(num + " X " + i + " = " + (num * i));
            i++;
        }
    }

    public static void message() {
        System.out.println("Multiplication Table for a given number");
    }

}
