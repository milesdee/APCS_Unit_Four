public class ForLoops {

    /**
     * Sample usage:
     * printingHashTags(0) returns ""
     * printingHashTags(4) returns "####"
     * @param num Integer representing the number of hashtags to draw
     * @return A string of hashtags
     */
    public static String printingHashTags(int num) {
        String hashes = "";
        for (int i = 0; i < num; i++) hashes += "#";
        return hashes;
    }

    /**
     * Sample usage:
     * countDown(0, 10) -> “10 9 8 7 6 5 4 3 2 1 0 ”
     * countDown(10, 0) -> “10 9 8 7 6 5 4 3 2 1 0 “
     * @param num1 an integer
     * @param num2 an integer
     * @return a countdown from the largest parameter to the smallest.
     */
    public static String countDown(int num1, int num2) {
        int a, b;
        String countDown = "";
        if (num1 > num2) {
            a = num1;
            b = num2;
        }
        else {
            a = num2;
            b = num1;
        }
        for(int i = a; i >= b; i--) countDown += i + " ";
        return countDown;
    }
    public static int sumNumbers(int num1, int num2) {
        int a, b;
        int sum = 0;
        if (num1 > num2) {
            a = num1;
            b = num2;
        }
        else {
            a = num2;
            b = num1;
        }
        for(int i = a; i >= b; i--) sum += i;
        return sum;
    }

    public static int power(int num1, int num2){
        int ans = num1;
        for(int i = 1; i < num2; i++) ans *= num1;
        return ans;
    }

}
