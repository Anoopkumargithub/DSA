package hackerblocks;

import java.util.Scanner;

public class split_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        printWays(arr, 0, 0, 0, "", "");
        System.out.println(countWays(arr, 0, 0, 0));
        sc.close();
    }

    private static int countWays(int[] arr, int index, int sum1, int sum2){
        if(index == arr.length){
            if(sum1 == sum2) return 1;
            else return 0;
        }
        int count = 0;
        count += countWays(arr, index + 1, sum1 + arr[index], sum2);
        count += countWays(arr, index + 1, sum1, sum2 + arr[index]);
        return count;
    }

    private static void printWays(int[] arr, int index, int sum1, int sum2, String ans1, String ans2){
        if(index == arr.length){
            if(sum1 == sum2){
                System.out.println(ans1 + "and " + ans2);
            }
            return;
        }
        printWays(arr, index + 1, sum1 + arr[index], sum2, ans1 + arr[index] + " ", ans2);
        printWays(arr, index + 1, sum1, sum2 + arr[index], ans1, ans2 + arr[index] + " ");
    }
}