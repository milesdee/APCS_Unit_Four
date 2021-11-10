import java.util.Scanner;

public class WhileLoops {

    /**
     * Usage examples:
     * fromHereToThere(20, 30) -> “20 21 22 23 24 25 26 27 28 29 30”
     * fromHereToThere(30, 20) -> “Invalid input”
     * @param num1 - The starting number
     * @param num2 - The ending number
     * @return A string consisting of either the range of numbers or Invalid Input
     */
    public static String fromHereToThere(int num1, int num2) {
        String nums = "";
        if (num1 < num2){
            while (num1 <= num2){
                nums += num1 + " ";
                num1 += 1;
            }
        }
        else nums = "Invalid input";

        return nums;
    }

    /**
     * Use a while loop to allow the user to enter positive or negative integers. The loop will exit
     * when the user enters a 0.
     * @return - A string showing how many positive and negative numbers were entered by the user.
     */
    public static String countPosAndNeg() {
        boolean quit = false;
        Scanner scan = new Scanner(System.in);
        int posCount = 0;
        int negCount = 0;
        while (!quit){
            System.out.print("Enter a positive or negative number, or 0 to quit: ");
            int x = scan.nextInt();
            if (x > 0) posCount += 1;
            else if (x < 0) negCount += 1;
            else quit = true;
        }
        return "There were " + posCount + " positive and " + negCount + " negative numbers"; // update or remove this line. It is only there so the tests do not show an error.
    }

    /**
     * Allow the user to enter 5 whole numbers (can be positive or negative). Keep track
     * of the largest and the smallest.
     * @return A string giving the minimum and maximum. Ex. "The Max value is: 45\nThe Min value is: -87"
     */
    public static String findMinAndMax() {
        Scanner scan = new Scanner(System.in);

        return ""; // update or remove this line. It is only there so the tests do not show an error.
    }

    /**
     * Calculates all the factors of the given number.
     * @param num A int value greater than 0
     * @return A string of all the factors of the given number separated by a space.
     * Ex. factors(12) returns "The factors of 12 are: 1 2 3 4 6 12 "
     */
    public static String factors(int num) {

        return ""; // update or remove this line. It is only there so the tests do not show an error.
    }

    public static void main(String[] args) {
        System.out.println(WhileLoops.countPosAndNeg());
    }

}
