package code_practice;

import java.util.Scanner;

public class nth_triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        print(n,0);
        sc.close();
    }

    private static void print(int n, int i) {
        if (n==0){
            System.out.println(i);
            return;
        }
        print(n-1,i+n);
    }
}
