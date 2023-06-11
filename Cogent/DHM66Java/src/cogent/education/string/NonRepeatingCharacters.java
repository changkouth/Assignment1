package cogent.education.string;

import java.util.Scanner;

public class NonRepeatingCharacters {
    public static String findAllNonRepeatedCharacters(String str) {
            int[] charFrequency = new int[256];
            StringBuilder sb = new StringBuilder();
            char[] charArr = str.toCharArray();

            for (char c : charArr) {
                charFrequency[c]++;
            }

            for (int i = 0; i < charFrequency.length; i++) {
                if (charFrequency[i] > 0) {
                    sb.append((char) i);
                }
            }

            return sb.toString();
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a string:");
            String s1 = sc.nextLine();
            String str = findAllNonRepeatedCharacters(s1);
            System.out.println(str);
        }
}
