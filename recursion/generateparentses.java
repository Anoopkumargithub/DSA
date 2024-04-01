package recursion;

import java.util.*;

public class generateparentses {
    public static void main(String[] args) {
        int n = 2;
        List<String> list = new ArrayList<>();
        paren(n,"",0,0,list);
        // System.out.println(list);
    }

    private static void paren(int n, String ans, int open, int close, List<String> list) {
        if(open==n &&close==n){
            list.add(ans);
            System.out.println(ans);    
            return;
        }
        if(open<n){
            paren(n, ans+"(", open+1, close,list);
        }
        if(close<open){
            paren(n, ans+")", open, close+1,list);
        }

    }
}
