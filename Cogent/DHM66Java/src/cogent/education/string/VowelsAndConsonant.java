package cogent.education.string;

import java.util.Scanner;

public class VowelsAndConsonant {
    public static void countVowelAndConsonant(String str) {
        String vowels = "aeiou";
        char[] vowelsArr = vowels.toCharArray();
        String consonant = "bcdfghjklmnpqrstvwxyz";
        char[] consonantArr = consonant.toCharArray();
        int countVowels = 0;
        int countConsonant = 0;
        char[] strArr = str.toCharArray();

        for (char c: strArr) {
            for (char c1: vowelsArr) {
                if (c == c1) {
                    countVowels += 1;
                }
            }
            for (char c2: consonantArr) {
                if (c == c2) {
                    countConsonant += 1;
                }
            }
        }
        System.out.println("vowels count: " + countVowels + " consonant count: "+ countConsonant);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String s = sc.nextLine();
        countVowelAndConsonant(s);
    }
}
