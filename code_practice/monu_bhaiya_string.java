package code_practice;

import java.util.Arrays;
import java.util.Scanner;

public class monu_bhaiya_string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char[] c = str.toCharArray();
        Arrays.sort(c);
        char[] ch = {0};
        print(c,ch);
        for(int i = 0;i<ch.length;i++){
            System.out.print(c[i]);
        }
        sc.close();
    }

    private static void print(char[] c, char[] ch) {
        for(int i  = 0;i<c.length;i++){
            for(int j = i+1;j<c.length;j++){
                // if(c[i] !=c[j])
            }
        }
        print(c, ch);
    }
}
