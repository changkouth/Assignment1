package cogent.education.numbers;

import java.util.Scanner;

public class Prime {
    public static boolean isPrime(int num) {
        if (num <= 1)
            return false;

        if (num % 2 == 0 && num > 2)
            return false;

        int squareNumber = (int) Math.sqrt(num);
        for (int i = 3; i <= squareNumber; i+= 2) {
            if (num % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();

        if (isPrime(num)) {
            System.out.println("Prime");
        } else {
            System.out.println("Not prime");
        }

    }
}
