package cogent.education.string;

import java.util.Scanner;

public class CountCharacter {

    public static int characterOccurrence(String str, char charToFind) {
        int count = 0;
        char[] charArr = str.toCharArray();
        for(char c: charArr) {
            if (c == charToFind) {
                count += 1;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String s1 = sc.nextLine();
        char c = sc.next().charAt(0);
        System.out.println(characterOccurrence(s1, c));
    }
}
