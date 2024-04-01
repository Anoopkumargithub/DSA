package recursion;

public class climbStairs {
    public static void main(String[] args) {
        int n = 4;
        System.out.println(climb(n," "));
    }

    private static int climb(int n, String s) {
        if(n==0){
            // System.out.println(s);
            return 1;
        }
        if(n< 0){
            return 0;
        }
    int a =  climb(n-1,s+1);
    int b = climb(n-2,s+2);
    int c = climb(n-3,s+3);
    // no. of ways
    int ans = a+b+c;
    return ans;
    }
}
