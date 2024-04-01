package code_practice;

import java.util.Scanner;

public class subset {
    static int count;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int [n];
        for(int i =0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int tar = sc.nextInt();
        sub(arr,0,tar,"");
        System.out.println();
        System.out.println(count);
        sc.close();
    }

    private static void sub(int[] arr, int i, int tar, String ans) {
        if(i == arr.length){
            if (tar == 0){
                count++;
            System.out.print(ans + " ");
            }
            return;
        }
        sub(arr,i+1,tar - arr[i],ans + arr[i] + " ");
        sub (arr,i+1,tar,ans);
                
    }
}
