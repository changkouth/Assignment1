package cogent.education.string;

import java.util.Scanner;

public class Frequency {
    public static char highestFrequencyCharacter(String str) {
        int[] charFrequency = new int[256];
        int count = 0;
        char result = ' ';
        char[] charArr = str.toCharArray();

        for (char c: charArr) {
            charFrequency[c]++;
        }

        for (int i = 0; i < charFrequency.length; i++) {
            if (charFrequency[i] > count) {
                count = charFrequency[i];
                result = (char) i;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String s1 = sc.nextLine();
        char ch = highestFrequencyCharacter(s1);
        System.out.println(ch);
    }

}
