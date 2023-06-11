package cogent.education.string;

import java.util.Scanner;

public class RemoveCharacter {

    public static String characterRemoved(String str, char charToFind) {
        StringBuilder sb = new StringBuilder();
        char[] charArr = str.toCharArray();
        for(char c: charArr) {
            if (c != charToFind) {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String s1 = sc.nextLine();
        char c = sc.next().charAt(0);
        System.out.println(characterRemoved(s1, c));
    }

}
