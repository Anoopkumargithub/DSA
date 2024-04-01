package practice;

public class sumofdigitnumber {
    public static void main(String[] args) {
        int n = 12345;
        System.out.println(sum(n));
    }

    private static int sum(int n) {
        // throw new UnsupportedOperationException("Unimplemented method 'sum'");
        if(n==0){
            return 0;
        }
        int a= n%10;
        n = n/10;
        int sp = sum(n);
        int ans  = a+sp;
        return ans;
    }
}
