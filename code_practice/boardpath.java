// Take as input N, a number. N is the size of a snakes and ladder board (without any snakes and ladders). Take as input M, a number. M is the number of faces of the dice.

// a. Write a recursive function which returns the count of different ways the board can be traveled using the dice. Print the value returned.

// b. Write a recursive function which prints dice-values for all valid paths across the board (void is the return type for function).

// Input Format
// Enter a number N (size of the board) and number M(number of the faces of a dice)

// Constraints
// M<=100
// N<=100
// M^N <=10^9

// Output Format
// Display the number of paths and print all the paths in a space separated manner

// Sample Input
// 3
// 3
// Sample Output
// 111 12 21 3 
// 4

package code_practice;

import java.util.Scanner;

public class boardpath {
    static int count;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        print(n,m,"");
        System.out.println();
        System.out.println(count);
        sc.close();
    }

    private static void print(int n, int m, String string) {
        if(n==0){
            System.out.print(string+" ");
            count++;
            return;
        }
        for(int i = 1;i<=m && i<=n;i++){
            print(n-i, m, string+ i);
        }
    }
}
