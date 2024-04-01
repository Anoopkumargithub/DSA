package practice;

public class clumsy_factorial {
    static int ans = 0;
    public static void main(String[] args) {
        int n = 7;
        // fact(n);
        // System.out.println("final " + ans);
        System.out.println(fact(n));

        System.out.println((-2147483648)/(-1));

    }
    private static int fact(int n) {
        if (n == 1)
      return 1;
    if (n == 2)
      return 2;
    if (n == 3)
      return 6;
    if (n == 4)
      return 7;
    if (n % 4 == 1)
      return n + 2;
    if (n % 4 == 2)
      return n + 2;
    if (n % 4 == 3)
      return n - 1;
    return n + 1;
    }
    
    // private static void fact(int n) {
    //     // if(n==0) return;
    //     // ans = n;
    //     // n = n-1;
    //     // while(n>0){
    //     //     // mul
    //     //     ans = ans * n;
    //     //     System.out.println(ans);
    //     //     n = n-1;
    //     //     if(n<=0) break;
    //     //     // div
    //     //     ans = ans/n;
    //     //     System.out.println(ans);
    //     //     n = n-1;
    //     //     if(n<=0) break;
    //     //     //add
    //     //     ans = ans + n;
    //     //     System.out.println(ans);
    //     //     n = n-1;
    //     //     if(n<=0) break;
    //     //     //sub 
    //     //     ans = ans - n;
    //     //     System.out.println(ans);
    //     //     n = n-1;
    //     //     if(n<=0) break;
    //     // }
    // }

}
