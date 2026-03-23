package Topics.search.linear;

import java.util.Arrays;

public class SearchInString {
    public static void main(String[] args) {
        String str = "Puja";
        char target = 'j';
        boolean ans = string(str, target);
        System.out.println(ans);
//        System.out.println(Topics.Arrays.toString(str.toCharArray())); // excellent use to show, explore!
    }

    static boolean string(String str, char target) {
        if(str.length() == 0) { // str.length() since this is a function which returns .length only
            return false;
        }

        for (int i = 0; i < str.length(); i++) {
            int element = str.charAt(i); // accessing any character using index in Topics.Strings
            if (element == target) {
                return true;
            }
        }

        return false;
    }

    static boolean string2(String str, char target) {
        if(str.length() == 0) { // str.length() since this is a function which returns .length only
            return false;
        }

        // using for each loop (enhanced for loop)
        for (char ch : str.toCharArray()) { // string to char array
           if (ch == target) {
               return true;
           }
        }

        return false;
    }

}





