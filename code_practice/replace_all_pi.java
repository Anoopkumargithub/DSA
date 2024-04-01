// Replace all occurrences of pi with 3.14

// Input Format
// Integer N, no of lines with one string per line

// Constraints
// 0 < N < 1000
// 0 <= len(str) < 1000

// Output Format
// Output result one per line

// Sample Input
// 3
// xpix
// xabpixx3.15x
// xpipippixx
// Sample Output
// x3.14x
// xab3.14xx3.15x
// x3.143.14p3.14xx
// Explanation
// All occurrences of pi have been replaced with "3.14".

package code_practice;

import java.util.Scanner;

public class replace_all_pi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        for(int i = 0;i<n;i++){
            String str = sc.next();
            replace(str);
        }
        sc.close();
    }

    private static void replace(String str) {
        if(!str.contains("pi")){
            System.out.println(str);
            return;
        }
        int index = str.indexOf("pi");
        replace(str.substring(0, index)+"3.14"+str.substring(index+2));
    }
}
