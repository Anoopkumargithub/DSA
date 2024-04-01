package recursion;

public class factorial {
    public static void main(String[] args) {
        int val = 5;
        System.out.println(fact(val));
    }
    public static int fact(int val){
        if(val==0){
            return 1;
        }
        return val*fact(val-1);

    }
}
