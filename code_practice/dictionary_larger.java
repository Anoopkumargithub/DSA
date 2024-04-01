// Take as input str, a string. Write a recursive function which prints all the words possible by rearranging the characters of this string which are in dictionary order larger than the given string.
// The output strings must be lexicographically sorted.

// Input Format
// Single line input containing a string

// Constraints
// Length of string <= 10

// All characters are unique

// Output Format
// Display all the words which are in dictionary order larger than the string entered in a new line each. The output strings must be sorted.

// Sample Input
// cab

// Sample Output
// cba
// Explanation
// The possible permutations of string "cab" are "abc" , "acb" ,"bac" , "bca" , "cab" and "cba" . Only one of them is lexicographically greater than "cab". We only print "cba".

package code_practice;

import java.util.Arrays;
import java.util.Scanner;

public class dictionary_larger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char[] ch = str.toCharArray();
        Arrays.sort(ch);
        String sorted = new String(ch);
        print(sorted,"",str);
        sc.close();
    }
    private static void print(String sorted, String ans, String str) {
        if(sorted.length() == 0){
            if(ans.compareTo(str)>0){
                System.out.println(ans);
            }
            return;
        }
        for(int i = 0;i<sorted.length();i++){
            char ch = sorted.charAt(i);
            print(sorted.substring(0, i)+sorted.substring(i+1), ans+ch, str);
        }
    }
    // public static void main(String[] args) {
    //     String input = "cab";
    //     char[] charArray = input.toCharArray();
    //     Arrays.sort(charArray); // Sort the characters to get the smallest permutation
    //     String sortedInput = new String(charArray);

    //     generateWords("", sortedInput);
    // }

    // private static void generateWords(String currentWord, String remainingChars) {
    //     if (remainingChars.isEmpty()) {
    //         // Base case: Print the current word
    //         System.out.println(currentWord);
    //         return;
    //     }

    //     for (int i = 0; i < remainingChars.length(); i++) {
    //         char currentChar = remainingChars.charAt(i);
    //         generateWords(currentWord + currentChar, remainingChars.substring(0, i) + remainingChars.substring(i + 1));
    //     }
    // }
}
