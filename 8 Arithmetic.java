import java.util.Scanner;
class Arithmetic {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Calculating Arithmetic\n");

        System.out.print("Please enter first number ");
        int first = input.nextInt();

        System.out.print("Please enter second number ");
        int second = input.nextInt();

        int add = first + second;
        int sub = first - second;
        int multi = first * second;
        int divide = first / second;
        int mod = first % second;

        System.out.println("Adding: " + add);
        System.out.println("Subtracting: " + sub);
        System.out.println("Multiplying: " + multi);
        System.out.println("Dividing: " + divide);
        System.out.println("Modulus-ing: " + mod);
//
//        int a = 10;
//        int b = 20;
//        int c = 30;
//        int d = 40;
//        int h = 50;
//
//        int ABCD = a + b + c + d;
//        System.out.println(ABCD + " Perimeter of a rectangle");
//
//        // Area of triangle = 1/2 *B*H
//        int triangle = 1/2 * (b*h);
//        System.out.println(triangle + " Area of triangle");
//
//        //Interest = (P * T * R ) / 100
//        int P = 100;
//        int T = 200;
//        int R = 300;
//        int t = 400;
//
//        System.out.println((P * T * R)/100 + " Interest");
////        System.out.println((P(1 + R/100)t + " Compound interest");
//
//        System.out.println(a + b);
//        System.out.println(a - b);
//        System.out.println(a * b);
//        System.out.println(a / b);
//        System.out.println(a % b);
//
//        // Calculate two floating point numbers
//
//        float q = 5.4f;
//        float w = 3.7f;
//
//        float z = q + w;
//        System.out.println(z + " Floats");
//
//        int C = 30;
//        int F = 10;
//
//        int D = C = (F - 32) * 5/9;
//        System.out.println(D + " F to C");





    }
}
