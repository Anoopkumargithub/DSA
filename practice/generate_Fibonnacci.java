package practice;

import java.util.ArrayList;

public class generate_Fibonnacci {
    public static void main(String[] args) {
        int n = 5;
        ArrayList <Integer> list = new ArrayList<Integer>();
        for(int i =0 ;i<n;i++){
        int sample = fib(i);
        list.add(sample);
    }
    System.out.println(list);
    }

    private static int  fib(int n) {
        if(n==0 || n==1){
            return n;
        }
        int sp1 = fib(n-1) + fib(n-2);
         return sp1;
    }
}
