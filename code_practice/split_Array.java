// Take as input N, a number. Take N more inputs and store that in an array.

// a. Write a recursive function which counts the number of ways the array could be split in two groups, so that the sum of items in both groups is equal. Each number in the array must belong to one of the two groups. Print the value returned.

// b. Write a recursive function which keeps track of ways an array could be split in two groups, so that the sum of items in both groups is equal. Each number in the array must belong to one of the two groups. Return type of function should be void. Print the two groups, each time you find a successful split.

// Input Format
// Take as input N, a number. Take N more inputs and store that in an array.

// Constraints
// None

// Output Format
// Display all the groups in a comma separated manner and display the number of ways the array can be split

// Sample Input
// 6
// 1
// 2
// 3
// 3
// 4
// 5

package code_practice;

import java.util.Scanner;

public class split_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }split(arr,0,0,0,"","");
        sc.close();
    }

    private static void split(int[] arr, int i, int sum1, int sum2, String ans1, String ans2) {
        if(i == arr.length){
            if(sum1 == sum2){
                System.out.println(ans1 + "and "+ ans2);
            }
            return;
        }
        split(arr, i+1, sum1+arr[i], sum2, ans1+arr[i]+" ", ans2);
        split(arr, i+1, sum1, sum2+arr[i], ans1, ans2+arr[i]+" ");
    }
}
