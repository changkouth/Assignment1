package cogent.education.numbers;

import java.util.Scanner;

public class PalindromeNumber {
    public static String reverseInteger(int num) {
        String str = String.valueOf(num);
        StringBuilder sb = new StringBuilder();
        char[] charArr = str.toCharArray();
        int i = 0;
        int j = charArr.length - 1;
        while (i < j) {
            char temp = charArr[i];
            charArr[i] = charArr[j];
            charArr[j] = temp;
            i+=1;
            j-=1;
        }

        for (char c: charArr) {
            sb.append(c);
        }

        return sb.toString();
    }

    public static boolean isPalindromeNumber(int num) {
        String str = reverseInteger(num);
        int reverse = Integer.parseInt(str);

        return (num == reverse);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();

        if (isPalindromeNumber(num)) {
            System.out.println(num+ " is a Palindrome");
        } else {
            System.out.println(num + " is not Palindrome");
        }

    }
}
