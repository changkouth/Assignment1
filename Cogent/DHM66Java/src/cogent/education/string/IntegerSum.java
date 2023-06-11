package cogent.education.string;

import java.util.Scanner;

public class IntegerSum {
    public static int calculateIntegerSum(String str) {
        int num = Integer.parseInt(str);
        int total = 0;
        while (num > 0) {
            int digit = num % 10;
            total += digit;
            num /= 10;
        }
        return total;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String s1 = sc.nextLine();
        System.out.println(calculateIntegerSum(s1));
    }
}
