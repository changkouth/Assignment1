package cogent.education.string;

import java.util.Scanner;

public class RemoveVowels {
    public static String vowelsRemoved(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c =='a' || c =='e' || c =='i' || c == 'o' || c == 'u') {
                str = str.replace(c,' ');
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
        System.out.println(vowelsRemoved(s1));
    }
}
