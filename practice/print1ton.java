package practice;

public class print1ton {
    public static void main(String[] args) {
        int n = 5;
        print(n);
    }

    private static void print(int n) {
        if(n==0){
            return;
        }
        print(n-1);
        System.out.println(n);
    }
}
