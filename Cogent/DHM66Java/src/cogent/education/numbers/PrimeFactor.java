package cogent.education.numbers;

import java.util.Scanner;

public class PrimeFactor {

    public static void printPrimeFactors(int num) {
        while(num % 2 == 0) {
            System.out.print(2 + " ");
            num /= 2;
        }
        int squareNumber = (int) Math.sqrt(num);
        for (int i = 3; i <= squareNumber; i+= 2) {
            if (num % i == 0)
                System.out.print(i + " ");
            num /= i;
        }

        if (num > 3) {
            System.out.print(num);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        printPrimeFactors(num);
    }
}
