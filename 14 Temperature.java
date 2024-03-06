import java.util.Scanner;

class Temperature {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);


        System.out.print("Enter temperature in Fº: ");
        double F = input.nextDouble();

        double  C = (F - 32) * 5/9;
        System.out.println("Temperature in Celsius is: " + C);
    }
}
