

// Take as input N, a number. Write a recursive function to find Nth triangle where 1st triangle is 1, 2nd triangle is 1 + 2 = 3, 3rd triangle is 1 + 2 + 3 = 6, so on and so forth. Print the value returned.


package hackerblocks;

import java.util.Scanner;

public class nth_triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(print(n));
        sc.close();
    }

    private static int print(int n) {
        if(n==0) return 0;
        int sp = print(n-1);
        int ans =sp + n;
        return ans;
    }
}
