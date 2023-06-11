package cogent.education.string;

import java.util.Scanner;

public class DigitCharacter {
    public static boolean checkCharacterDigit(char c) {
        return Character.isDigit(c);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character:");
        char c = sc.next().charAt(0);
        if (checkCharacterDigit(c)) {
            System.out.println("character is a digit");
        } else {
            System.out.println("character is not a digit");
        }

    }
}
