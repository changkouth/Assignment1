package cogent.education.string;

import java.util.Scanner;

public class CountAll {
    public static void countAlphaOrDigitsOrSpecialChar(String str) {
        int countAlpha = 0;
        int digitCount = 0;
        int specialCount = 0;
        char[] strArr = str.toCharArray();

        for(char c: strArr) {
            if (Character.isLetter(c)) { countAlpha ++; }
            if (Character.isDigit(c)) { digitCount ++; }
            if (!Character.isLetter(c) && !Character.isDigit(c) && !Character.isWhitespace(c)) {
                specialCount++;
            }
        }

        System.out.println("alpha count: " + countAlpha);
        System.out.println("digit count: " + digitCount);
        System.out.println("special character count: " + specialCount);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character:");
        String str = sc.nextLine();
        countAlphaOrDigitsOrSpecialChar(str);
    }
}
