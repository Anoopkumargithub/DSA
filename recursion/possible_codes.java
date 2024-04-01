package recursion;

import java.util.Scanner;

public class possible_codes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        print(str,"");
        sc.close();
    }

    // private static void print(String str, int len, String string) {

    //     for(int i = 0;i<len-1;i++){
    //         String s = str.substring(i);
    //         print(str.substring(i)+str.substring(i), len, string+s);
    //     }
    // }
    public static void print(String str, String ans) {
        if (str.length() == 0) {
            System.out.print(ans + " ");
            return;
        }
        print(str.substring(1), ans + (char) (str.charAt(0) - '1' + 'a'));

        if (str.length() >= 2) {
            int two = Integer.parseInt(str.substring(0, 2));
            if (two<= 26) {
                char t = (char) ('a' + two - 1);
                print(str.substring(2), ans + t);
            }
        }
    }

}
