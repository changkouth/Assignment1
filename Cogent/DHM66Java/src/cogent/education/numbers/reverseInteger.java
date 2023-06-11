package cogent.education.numbers;

import java.util.Scanner;

public class reverseInteger {
    public static String reverse(int num) {
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

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        String result = reverse(num);
        int reversedNumber = Integer.parseInt(result);
        System.out.println(reversedNumber);

    }
}
