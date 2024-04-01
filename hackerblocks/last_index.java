package hackerblocks;

import java.util.Scanner;

public class last_index {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        System.out.println(last(arr,0,m));
        sc.close();
    }
    private static int last(int [] arr,int index, int m){
        int a = arr.length;
        if(a == index) return -1;
        if(arr[a - index -1] == m) return (a - index -1);
        return last(arr,index+1,m);
    }
}
