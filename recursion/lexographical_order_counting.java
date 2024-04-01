package recursion;

import java.util.ArrayList;

public class lexographical_order_counting {
    public static void main(String[] args) {
        int  n = 10;
        // print(n,0);
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i = 1;i<=9;i++){
            print(n, i,list);
        }
        System.out.println(list);

    }

    private static void print(int n, int ans, ArrayList<Integer> list) {
        if(ans<=n && ans!=0){
            list.add(ans);
            // System.out.println(ans);
        }
        if(ans > n){
            return;
        }
        // int i =0;
        // if(ans==0){
        //     i=1;
        // }
        for ( int i = 0;i<=9;i++){
            print(n, ans*10+i, list);
        }
    }
}
