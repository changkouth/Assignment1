package cogent.education.string;

import java.util.Scanner;

public class SortAscendingOrder {

    public static String sortCharacterInAscending(String str) {
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

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String s1 = sc.nextLine();
        String result = sortCharacterInAscending(s1);
        System.out.println(result);

    }
}
