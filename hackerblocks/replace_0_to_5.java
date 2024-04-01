// Given an integer N, now you have to convert all zeros of N to 5.

package hackerblocks;
import java .util.Scanner;
public class replace_0_to_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        replace(n,-0);
        sc.close();

    }

    private static void replace(int n, int ans) {
        if(n==0) return;

        while(n>0){
            int rem = n%10;
            if(rem == 0) rem = 5;
            ans = ans*10 + rem;
            n = n/10;
        }
        while(ans>0){
            int rem = ans%10;
            n = n*10 + rem;
            ans = ans/10;
        }
        System.out.println(n);
    }
}
