import java.util.Scanner;

class AgeGroup {
    public static void main(String[] args) {
        System.out.println("Sorting out age groups");
        Scanner input  = new Scanner(System.in);
        System.out.print("What is your age? ");

        int age = input.nextInt();

        if(age < 13){
            System.out.println("You are a child.");
        } else if (age < 20){
            System.out.println("You are a teen.");
        } else if(age < 60) {
            System.out.println("You are an adult.");
        } else if (age > 60) {
            System.out.println("You are a senior.");
        } else{
            System.out.println("Please tell me your age again.");
        }
    }
}
