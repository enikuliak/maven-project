package com.jane;

import java.util.regex.Pattern;

/**
 * Hello world!
 */
public class String3 {

    public String notReplace(String str) {
        String string = "";
        if (str.length() == 2 && str.equals("is")) {
            string = str.replace("is", "is not");
            return string;
        }
        return str;
    }

    /**
     * Length of block of characters of maximal length.
     *
     * @param str String.
     * @return Length of block of characters of maximal length.
     */
    public int maxBlock(String str) {
        int largest = 0;
        for (int i = 0; i < str.length(); i++) {
            char ci = str.charAt(i);
            int j = i + 1;
            while (j < str.length() && str.charAt(j) == ci) {
                j++;
            }
            if (largest < j - i) {
                largest = j - i;
            }
        }
        return largest;
    }

    public boolean strCopies(String str, String sub, int n) {
        if (n == 0) {
            return true;
        }
        int indexOfSub = str.indexOf(sub);
        if (indexOfSub >= 0 && indexOfSub + 1 < str.length()) {
            return strCopies(str.substring(indexOfSub + 1), sub, n - 1);
        }
        return false;
    }
}
