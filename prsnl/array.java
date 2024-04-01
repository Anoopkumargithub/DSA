package prsnl;

import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of student");
        int n = sc.nextInt();
        int[] arr = new int[n];
        //Input
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        //Output
        for(int i = 0;i<n;i++){
            System.out.print(arr[i]+", ");
        }

        sc.close();
    }
}
