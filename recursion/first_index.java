package recursion;

import java.util.Scanner;

public class first_index {
    public static void main(String args[]) {
        // Your Code Here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int [n];
        for(int i  = 0;i<n;i++){
            arr[i] =  sc.nextInt();
        }
        int m = sc.nextInt();
        for(int i = 0;i<n;i++){
        first(arr,m,i);
        }
        sc.close();
    }
    private static void first(int [] arr, int m,int i){
        if(arr[i] == m){
            System.out.println(i);
            // return;
        }
        else {System.out.println("-1");}
        
    }
}
