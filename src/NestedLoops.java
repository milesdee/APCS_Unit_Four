public class NestedLoops {

    public static String xSquare(int n) {
        String ans = "";
        for(int x = 1; x <= n; x++){
            for(int y = 1; y <= n; y++) ans += "X";
            ans += "\n";
        }
        return ans;
    }

    public static String flippedTriangle(int n) {
        String ans = "";
        int x = n;
        while(x > 0){
            for(int i = 0; i < x; i++){
                ans += "*";
            }
            x--;
            ans += "\n";
        }
        return ans;
    }

    public static String fizzBuzz(int n) {
        String ans = "";
        for(int x = 1; x <= n; x++){
            if (x % 3 == 0) ans += "Fizz";
            if (x % 5 == 0) ans += "Buzz";
            if (x % 3 != 0 && x % 5 != 0) ans += x;
            if(x % 20 == 0) ans += "\n";
            else ans += " ";
        }
        return ans;
    }
    public static String sideways() {
        String ans = "";
        for(int y = 2; y <= 6; y++){
            for(int x = 5; x > 0; x--){
                if(x < y && x != 1) ans += x + " ";
                else if(x == 1) ans += x;
                else ans += "  ";
            }
            ans += "\n";
        }
        for(int y = 5; y > 1; y--){
            for(int x = 5; x > 0; x--){
                if(x < y && x != 1) ans += x + " ";
                else if(x == 1) ans += x;
                else ans += "  ";
            }
            ans += "\n";
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(sideways());
    }
}
