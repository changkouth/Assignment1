package cogent.education.string;

import java.util.Scanner;

public class RemoveBlankSpace {

    public static String removeBlanks(String str) {
        StringBuilder sb = new StringBuilder();
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
        System.out.println(removeBlanks(s1));
    }
}
