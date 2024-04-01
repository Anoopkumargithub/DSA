package leetcode;

import java.util.Scanner;

public class happy_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        happy(n);
        sc.close();

    }

    private static boolean happy(int n){
        if(n>9){
            sep(n);
        }
        return false;
        
    }

    private static int sep(int n) {
        int temp = 0;
        return temp;
        
    }
}
