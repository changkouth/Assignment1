package cogent.education.string;

import java.util.Scanner;

public class ReplaceFirstOccurrence {
    public static String firstVowelReplacement(String str) {
        String vowels = "aeiou";

        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < vowels.length(); j++) {
                char c = str.charAt(i);
                char v = vowels.charAt(j);
                if (c == v) {
                    str = str.replaceFirst(String.valueOf(c), "-");
                    return str;
                }
            }
        }
        return "";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String s1 = sc.nextLine();
        System.out.println(firstVowelReplacement(s1));
    }
}
