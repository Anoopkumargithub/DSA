package basic;

import java.util.*;

public class binary_to_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String str = sc.next();
            printBinary(str, "");
            sc.close();
        }
    }

    private static void printBinary(String str, String ans) {
        if (str.length() == 0) {
            System.out.print(ans + " ");
            return;
        }

        if (str.charAt(0) == '?') {
            printBinary(str.substring(1), ans + '0');
            printBinary(str.substring(1), ans + '1');
        } else {
            printBinary(str.substring(1), ans + str.charAt(0));
        }
    }
}