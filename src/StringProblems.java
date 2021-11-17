import java.util.Locale;

public class StringProblems {

    public static String addHyphens(String s){
        String newstring = "";
        for (int i = 0; i < (s.length())-1; i++) newstring += s.charAt(i) + "-";
        newstring += s.charAt(s.length()-1);
        return newstring;
    }

    public static String everyOtherLetter(String s) {
        String newstring = "";
        for (int i = 0; i < (s.length()); i +=2) newstring += s.charAt(i);
        return newstring;
    }

    public static String differentStrings(String s1, String s2) {
        boolean different = false, e = true;
        String old;
        int i = 0, o = 0;
        if(s1.length() < s2.length()){
            old = s1;
            o = 0;
            for(int spaces = 0; spaces < s2.length(); spaces++) s1 += " ";
        }
        else{
            o = 1;
            old = s2;
            for(int spaces = 0; spaces < s1.length(); spaces++) s2 += " ";
        }
        while(i < s1.length()){
            if(s1.charAt(i) == s2.charAt(i)){
                i++;
            }
            else{
                different = true;
                break;
            }
        }
        if(o == 0) s1 = old;
        else s2 = old;
        if(!different) return s1 + " and " + s2 + " are the same";
        else return s1 + " and " + s2 + " are not the same. They differ at letter number " + (i + 1);
    }

    public static boolean isPalindrome(String word) {
        word = word.toLowerCase();
        for(int l = 0; l < word.length(); l++) while(word.contains(" "))
            word = word.substring(0,word.indexOf(' ')) + word.substring(word.indexOf(' ') + 1);
        String backwards = "";
        for(int i = word.length() -1; i >= 0; i--) if(word.charAt(i) != ' ') backwards += word.charAt(i);
        return(word.equals(backwards));
    }
}