// Take as input N, a number. Write a recursive function which prints counting from 0 to N in lexicographical order. In lexicographical (dictionary) order 10, 100 and 109 will be printed before 11.

// Input Format
// Enter a number N.

// Constraints
// None

// Output Format
// Display all the numbers upto N in a lexicographical order

// Sample Input
// 10
// Sample Output
// 0 1 10 2 3 4 5 6 7 8 9 

package code_practice;

import java.util.Scanner;

public class lexicographical_order {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print("0 ");
        for(int i = 1;i<=9;i++){
            print(i,n);
        }
        sc.close();
    }

    private static void print(int ans, int n) {
        if(ans>n) return;
        System.out.print(ans+" ");
        for(int i = 0;i<=9;i++){
            print(ans*10+i,n);
        }
    }
}
