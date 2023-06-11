package cogent.education.string;

import java.util.Scanner;

public class Anagram {
    public static String sortString(String str) {
        char[] charArr = str.toCharArray();
        for(int i = 0; i < charArr.length; i++) {
            for (int j = i + 1; j < charArr.length; j++) {
                char c1 = Character.toLowerCase(charArr[i]);
                char c2 = Character.toLowerCase(charArr[j]);
                if (c1 > c2) {
                    char tmp = charArr[i];
                    charArr[i] = charArr[j];
                    charArr[j] = tmp;
                }
            }
        }
        return String.valueOf(charArr);
    }

    public static boolean isAnagram(String s1, String s2) {
        return sortString(s1).equals(sortString(s2));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String s1 = sc.nextLine();
        System.out.println("Enter a second string:");
        String s2 = sc.nextLine();

        if (isAnagram(s1, s2)) {
            System.out.println("The two strings are anagram");
        } else {
            System.out.println("The two strings are not anagram");
        }
    }
}
