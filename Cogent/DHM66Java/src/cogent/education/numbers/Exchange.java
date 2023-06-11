package cogent.education.numbers;

import java.util.Scanner;

public class Exchange {
    public static void swap(int n1, int n2) {
        int tmp = n1;
        n1 = n2;
        n2 = tmp;
        System.out.println("n1:"+n1);
        System.out.println("n2:"+n2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num1 = sc.nextInt();
        System.out.println("Enter a second number:");
        int num2 = sc.nextInt();
        swap(num1, num2);
    }
}
