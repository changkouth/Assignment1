package cogent.education.string;

import java.util.Scanner;

public class RepeatedCharacters {

    public static String removeRepeatedCharacters(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j ++) {
                if (str.charAt(i) == str.charAt(j)) {
                    str = str.replace(str.charAt(j), ' ');
                }
            }
        }
        String[] strArr = str.split(" ");
        for (String s: strArr) {
            sb.append(s);
        }

       return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String s1 = sc.nextLine();
        String result = removeRepeatedCharacters(s1);
        System.out.println(result);

    }
}
