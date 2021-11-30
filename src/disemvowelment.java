import java.util.Scanner;

public class disemvowelment {
    public static String disemvoweled(String input) {
        char[] vowels = {'a', 'e', 'i', 'o', 'u', 'y'};
        String output = input;
        for (int x = 0; x < output.length(); x++) {
            for (int y = 0; y <= 5; y++) {
                if (output.charAt(x) == vowels[y]) {
                    if (output.indexOf(output.charAt(x)) == output.length())
                        output = output.replace(output.substring(x), "");
                    else output = output.replace(output.substring(x, x + 1), "");
                    output += " ";
                }
            }
        }
        output = output.trim();
        return output;
    }

    public static String repeatChopping(String input) {
        String output = input.substring(0,1);
        for (int i = 1; i < input.length(); i++) {
            if (input.charAt(i) != input.charAt(i - 1)) {
                output += input.charAt(i);
            }
        }
        return output;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the disemvoweling utility.");
        System.out.print("Enter your phrase: ");
        String userInput = scan.nextLine();
        String mods = disemvoweled(userInput);
        System.out.println("The disemvoweled phrase is: " + mods);
        mods = repeatChopping(mods);
        System.out.println("The phrase without double letters is: " + mods);
    }
}
