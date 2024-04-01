package recursion;

import java.util.Scanner;

public class subset {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int tar = sc.nextInt();
        findSubsets(arr, 0, tar, "");
        sc.close();
    }

    public static void findSubsets(int[] arr, int index, int tar, String ans) {
        if(index == arr.length) {
            if(tar == 0) {
                System.out.print(ans+" ");
            }
            return;
        }
        // Include current element in the subset
        findSubsets(arr, index + 1, tar - arr[index], ans + arr[index] + " ");
        // Exclude current element from the subset
        findSubsets(arr, index + 1, tar, ans);
    }
}