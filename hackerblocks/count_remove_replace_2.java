package hackerblocks;

import java.util.Scanner;

public class count_remove_replace_2 {
    public static void main(String args[]) {
        // Your Code Here
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(count(s,0));
        System.out.println(remove(s));
        System.out.println(replace(s));
        sc.close();
    }
    private static int count(String s,int count){
        if(s.contains("hi")){
            int index = s.indexOf("hi");
            // Check if "hit" follows "hi"
            if(index + 2 < s.length() && s.charAt(index + 2) == 't') {
                // If "hit" follows "hi", skip the count
                return count(s.substring(index + 2), count);
            } else {
                // If "hit" does not follow "hi", increment the count
                count++;
                return count(s.substring(index + 2), count);
            }
        }
        return count;
    }
    
    private static String remove(String s){
        if(!s.contains("hi")) return s;
        int index = s.indexOf("hi");
        // Check if "hit" follows "hi"
        if(index + 2 < s.length() && s.charAt(index + 2) == 't') {
            // If "hit" follows "hi", skip the removal
            return s.substring(0, index + 2) + remove(s.substring(index + 2));
        } else {
            // If "hit" does not follow "hi", remove "hi"
            return s.substring(0, index) + remove(s.substring(index + 2));
        }
    }
    private static String replace(String s){
        if(!s.contains("hi")) return s;
        int index = s.indexOf("hi");
        // Check if "hit" follows "hi"
        if(index + 2 < s.length() && s.charAt(index + 2) == 't') {
            // If "hit" follows "hi", skip the replacement
            return s.substring(0, index + 2) + replace(s.substring(index + 2));
        } else {
            // If "hit" does not follow "hi", replace "hi" with "hit"
            return s.substring(0, index) + "bye" + replace(s.substring(index + 2));
        }
    }
}
