import java.util.Scanner;

class PrimeNumbers {
    public static void main(String[] args) {
        System.out.println("Checking if a given number is a prime number\n");
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int num = input.nextInt();
        boolean isPrime = isPrime(num);

        if (isPrime) {
            System.out.println("Your number is prime.");
        } else {
            System.out.println("Your number is not prime.");
        }
    }
    public static boolean isPrime(int num) {
        int i = 2; //
        while (i < num) {
            if (num % i == 0) {
                return false;
            }
            i++;
        }
      return true;

        }
    }

