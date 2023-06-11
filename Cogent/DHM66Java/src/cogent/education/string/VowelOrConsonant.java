package cogent.education.string;

import java.util.Scanner;

public class VowelOrConsonant {
    public static boolean checkVowelOrConsonant(char c) {
        String vowelsArr = "aeiou";
        boolean isTrue = false;
        char[] charArr = vowelsArr.toCharArray();
        for (char vc: charArr) {
            if (vc == c) {
                isTrue = true;
            }
        }
        return isTrue;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character:");
        char c = sc.next().charAt(0);
        if (checkVowelOrConsonant(c)) {
            System.out.println("vowels");
        } else {
            System.out.println("consonant");
        }
    }
}
