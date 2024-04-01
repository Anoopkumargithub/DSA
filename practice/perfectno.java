package practice;

public class perfectno {
    public static void main(String[] args) {
        int n = 120;
        System.out.println(per(n));
    }

    private static boolean per(int num) {
        int count =1;
        for(int i = 2;i<=(num/2);i++){
            if(num%i==0) {count = count + i; System.out.println(i);}
        }
        if(count==num) return true;
        else return false;
    }
}
