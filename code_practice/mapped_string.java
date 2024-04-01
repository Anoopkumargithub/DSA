// We are given a hashmap which maps all the letters with number. Given 1 is mapped with A, 2 is mapped with B…..26 is mapped with Z. Given a number, you have to print all the possible strings.

// Input Format
// A single line contains a number.

// Constraints
// Number is less than 10^6

// Output Format
// Print all the possible strings in sorted order in different lines.

// Sample Input
// 123
// Sample Output
// ABC
// AW
// LC
// Explanation
// '1' '2' '3' = ABC
// '1' '23' = AW
// '12' '3' = LC


package code_practice;

import java.util.Scanner;

public class mapped_string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        print(str,"");
        sc.close(); 
    }

    private static void print(String str, String ans) {
        if(str.length() == 0){
            System.out.print(ans+" ");
            return;
        }
        print(str.substring(1), ans+ (char) (str.charAt(0) - '1' + 'a'));

        if (str.length() >= 2) {
            int two = Integer.parseInt(str.substring(0, 2));
            if (two<= 26) {
                char t = (char) ('a' + two - 1);
                print(str.substring(2), ans + t);
            }
        }
    }
}
