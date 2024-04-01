package code_practice;

import java.util.Scanner;

public class odd_num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        print(n);
        sc.close();
    }

    private static void print(int n) {
        if(n == 0) return;
        if(n%2 != 0) System.out.println(n);
        print(n-1);
        if(n%2 ==0) System.out.println(n);
    }
}
