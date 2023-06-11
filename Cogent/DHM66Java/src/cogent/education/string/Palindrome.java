package cogent.education.string;

import java.util.Scanner;

public class Palindrome {
    public static String reverse(String s1) {
        StringBuilder sb = new StringBuilder();
        for(int i = s1.length()-1; i>=0; i--) {
            sb.append(s1.charAt(i));
        }
        return sb.toString();
    }
    public static boolean isPalindrome(String s1) {
       return reverse(s1).equals(s1);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String s1 = sc.nextLine();
        if (isPalindrome(s1)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }
    }
}
