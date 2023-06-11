package cogent.education.string;
import java.util.Scanner;
public class SortDescendingOrder {
    public static String reverseString(String str) {
        char[] charArr = str.toCharArray();
        int i = 0;
        int j = charArr.length - 1;
        while (i < j) {
            char tmp = charArr[i];
            charArr[i] = charArr[j];
            charArr[j] = tmp;
            i += 1;
            j -= 1;
        }
        return String.valueOf(charArr);
    }
    public static String sortCharacterDescending(String str) {
        char[] charArr = str.toCharArray();
        for (int i = 0; i < charArr.length; i++) {
            for (int j = i +1; j < charArr.length; j++) {
                char c1 = Character.toLowerCase(charArr[i]);
                char c2 = Character.toLowerCase(charArr[j]);
                if (c1 > c2) {
                    char c3 = charArr[i];
                    charArr[i] = charArr[j];
                    charArr[j] = c3;
                }
            }
        }
        return reverseString(String.valueOf(charArr));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();
        String result = sortCharacterDescending(str);
        System.out.println(result);
    }

}
