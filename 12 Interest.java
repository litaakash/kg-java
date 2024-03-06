import java.util.Scanner;

class Interest {
    public static void main(String[]args){

        Scanner input = new Scanner(System.in);
        System.out.println("We are calculating interest with this formula: (P * R* T) / 100\n");

        System.out.print("Please enter principal: ");
        double P = input.nextDouble();

        System.out.print("Please enter time:  ");
        double T = input.nextDouble();

        System.out.print("Please enter rate:" );
        double R = input.nextDouble();

        double I = (P * R * T) / 100;

        System.out.println(I);
    }
}
