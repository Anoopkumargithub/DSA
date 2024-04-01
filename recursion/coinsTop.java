package recursion;

public class coinsTop {
    public static void main(String[] args) {
        int n = 3;
        String s = "";
    coinsToss(n,s);
    }

    private static void coinsToss(int n, String s) {
        // throw new UnsupportedOperationException("Unimplemented method 'coinsToss'");
        if(n==0){
            System.out.println(s);
            return;
        }
        coinsToss(n-1, s+"H");
        coinsToss(n-1, s+"T");
    }
}
