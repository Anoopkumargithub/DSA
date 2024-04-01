// Take as input str, a string. Write a recursive function which returns all the words possible by rearranging the characters of this string which are in dictionary order smaller than the given string. The output strings must be lexicographically sorted.

// Input Format
// Single line input containing a string

// Constraints
// Length of string <= 10

// All characters are unique

// Output Format
// Display all the words which are in dictionary order smaller than the string entered in a new line each. The output strings must be sorted.

// Sample Input
// cab
// Sample Output
// abc
// acb
// bac
// bca
// Explanation
// The possible permutations of string "cab" are "abc" , "acb" ,"bac" , "bca" , "cab" and "cba" . Only four of them are lexicographically less than "cab". We print them in lexicographical order.

package code_practice;

import java.util.Arrays;
import java.util.Scanner;

public class dictionary_smaller {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char[] ch = str.toCharArray();
        Arrays.sort(ch);
        String sorted = new String(ch);
        print(sorted, "", str);
        sc.close();
    }

    private static void print(String sorted, String ans, String str) {
        // if(sorted.length() == 0){
        // if(ans.compareTo(str)<0){
        // System.out.println(ans);
        // }
        // return;
        // }
        if(sorted.isEmpty()){
            System.out.println(ans);
        }
        for (int i = 0; i < sorted.length(); i++) {
            char ch = sorted.charAt(i);
            print(sorted.substring(0, i) + sorted.substring(i + 1), ans + ch, str);
        }
    }

}
