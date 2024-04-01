package hackerblocks;

import java.util.Scanner;

public class count_remove_replace {
    public static void main(String args[]) {
        Scanner sc = new Scanner (System.in);
        String s = sc.next();
        System.out.println(count(s,0));
        System.out.println(remove(s));
        System.out.println(replace(s));
        sc.close();
    }
    private static int count(String s,int c){
        if(s.contains("hi")){
            c++;
            int index = s.indexOf("hi");
            return count(s.substring(index+2),c);
            }
            return c;

    }
    private static String remove(String s){
        if(!s.contains("hi")) return s;
        int index = s.indexOf("hi");
        return s.substring(0,index)+""+remove(s.substring(index+2));
        
    }
    private static String replace(String s){
        if(!s.contains("hi")) return s;
        int index = s.indexOf("hi");
        return s.substring(0,index)+"bye"+replace(s.substring(index+2));
    }
}
