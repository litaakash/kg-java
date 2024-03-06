import java.util.Scanner;

public class ArrayUtility {
    public static int[] inputArray() {
        Scanner input = new Scanner(System.in);
        System.out.print("How many numbers do you want to add today?: "); //  user enters 5
        int size = input.nextInt(); //  create an array of size 5 to store the user's input
        int[] nums = new int[size]; //to store the numbers entered by the user.

        int i = 0;
        while (i < size) {
            System.out.print("Please enter number " + (i + 1) + " : " ); // i + 1 because array start from 0 and don't want to get user confused
            nums[i] = input.nextInt(); // nums[i] is storing each number user is inserting at indices 0,1,2...
            i++;
        }
        return nums;
    }
}
