// Take as input str, a string. We are concerned with all the possible subsequences of str. E.g.

// a. Write a recursive function which returns the count of subsequences for a given string. Print the value returned.

// b. Write a recursive function which prints all possible subsequences for a “abcd” has following subsequences “”, “d”, “c”, “cd”, “b”, “bd”, “bc”, “bcd”, “a”, “ad”, “ac”, “acd”, “ab”, “abd”, “abc”, “abcd”.given string (void is the return type for function).
// Note: Use cin for input for C++

// Input Format
// Enter a string

// Constraints
// None

// Output Format
// Print all the subsequences in a space separated manner and isplay the total no. of subsequences.

// Sample Input
// abcd
// Sample Output
//  d c cd b bd bc bcd a ad ac acd ab abd abc abcd 
// 16
// Explanation
// Print all possible subsequences of the given string

package code_practice;

import java.util.Scanner;

public class sub_sequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        print(str,"");
        sc.close();
    }

    private static void print(String str, String ans) {
        if(str.length() == 0){
            System.out.println(ans);
            return;
        }
        char ch = str.charAt(0);
        print(str.substring(1), ans);
        print(str.substring(1), ans+ch);
    }
}
