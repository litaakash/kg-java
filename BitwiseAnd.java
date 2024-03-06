import java.util.Scanner;

class BitwiseAnd {
    public static void main(String[] args) {
        System.out.println("Showcasing Bitwise AND oprator");
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int firstNum = input.nextInt();

        System.out.print("Enter the second number: ");
        int secondNum = input.nextInt();

        int result = firstNum & secondNum;
        int result1 = firstNum | secondNum;
        int result2 = firstNum ^ secondNum;
        int result3 = firstNum << secondNum;
        int result4 = firstNum >> secondNum;

        System.out.println(result);
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);

    }
}
