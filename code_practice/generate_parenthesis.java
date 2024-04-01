// Given an integer 'n'. Print all the possible pairs of 'n' balanced parentheses.
// The output strings should be printed in the sorted order considering '(' has higher value than ')'.

// Input Format
// Single line containing an integral value 'n'.

// Constraints
// 1<=n<=11

// Output Format
// Print the balanced parentheses strings with every possible solution on new line.

// Sample Input
// 2
// Sample Output
// ()() 
// (()) 

package code_practice;

import java.util.Scanner;

public class generate_parenthesis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        paren(n,0,0,"");
        sc.close();
    }

    private static void paren(int n, int open, int close, String ans) {
        if(open ==n && close == n){
            System.out.println(ans);
            return;
        }
        if(close<open){
            paren(n, open, close+1, ans+")");
        }
        if(open<n){
            paren(n, open+1, close, ans+"(");
        }
    }
}
