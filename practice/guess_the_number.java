package practice;

import java.util.Scanner;

public class guess_the_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 10;
        int num = sc.nextInt();
        System.out.println(guess(n,num));
        sc.close();
    }

    private static int guess(int n, int num) {
        if (n==num){
            return n;
        }
        else if(n<num){
            n++;
        }
        else{
            n--;
        }
        return guess(n, num);
        
    }
}
