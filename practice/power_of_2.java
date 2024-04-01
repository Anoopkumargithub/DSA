package practice;

import java.util.Scanner;

//leetcode
public class power_of_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(pow(n));
        sc.close();
    }

    private static boolean pow(int n){
        if(n==1){
            return true;
        }
        if(n<=0 || n%2!=0) return false;
        // int sp = n/2;
        return pow(n/2);
    }
}

