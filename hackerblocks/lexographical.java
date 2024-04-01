package hackerblocks;

import java.util.Scanner;

public class lexographical {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1; i <= 9; i++) {
            print(n, i);
        }
        sc.close();
    }
    private static void print(int n, int ans){
        if(ans > n) return;
        System.out.print(ans + " ");
        for(int i = 0; i <= 9; i++){
            print(n, ans * 10 + i);
        }
    }
}