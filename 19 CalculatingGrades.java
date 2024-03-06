import java.util.Scanner;

class CalculatingGrades {
    public static void main(String[] args) {
        System.out.println("Calculating grades based on test scores");
        Scanner input = new Scanner(System.in);
        System.out.print("What score did you receive on your test? ");

        int score = input.nextInt();

        if( score > 90){
            System.out.println("You got a A!");
        } else if(score > 80){
            System.out.println("You got a B!");
        } else if(score > 70) {
            System.out.println("You got a C");
        }else if (score > 60){
            System.out.println("You got a D");
        } else{
            System.out.println("You got an F");
        }
    }
}
