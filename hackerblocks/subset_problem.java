package hackerblocks;

// Take an input N, a number. Take N more inputs and store that in an array. Take an input target, a number

// a. Write a recursive function which prints subsets of the array which sum to target.

// b. Write a recursive function which counts the number of subsets of the array which sum to target. Print the value returned.

import java.util.Scanner;

public class subset_problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        // int target = sc.nextInt();
        sc.close();
    }
}
