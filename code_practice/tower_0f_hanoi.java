package code_practice;

import java.util.Scanner;

public class tower_0f_hanoi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        toh(n,'A','B','C');
        sc.close();
    }

    private static void toh(int n, char a, char b, char c) {
        if(n==1){
            System.out.println("Moving ring 1 from "+a+" to "+b);
            return;
        }
        toh(n-1,a,c,b);
        System.out.println("Moving ring "+n+" from "+a+" to "+b);
        toh(n-1,c, b, a);
    }
}
