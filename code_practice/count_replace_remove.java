// Take as input str, a string. a.Write a recursive function which counts the number of times ‘hi’ appears in the string. Print the value returned. b.Write a recursive function which removes all ‘hi’ in the string. Print the value returned. c.Write a recursive function which replaces all ‘hi’ in the string with ‘bye’. Print the value returned.

// Input Format
// Enter a string

// Constraints
// None

// Output Format
// Display the no. of 'hi', string without 'hi' , string in which 'hi' is replaced with 'bye'

// Sample Input
// abchibi
// Sample Output
// 1
// abcbi
// abcbyebi

package code_practice;

import java.util.Scanner;

public class count_replace_remove {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(count(str,0));
        System.out.println(remove(str));
        System.out.print(replace(str));
        sc.close();
    }

    private static String replace(String str) {
        if(str.contains("hi")){
            int index  = str.indexOf("hi");
            return str.substring(0, index)+"bye"+str.substring(index+2);
        }
        return str;
    }

    private static String remove(String str) {
        if(str.contains("hi")){
            int index  = str.indexOf("hi");
            return str.substring(0, index)+""+str.substring(index+2);
        }
        return str;
    }

    private static int count(String str,int count) {
        if(str.contains("hi")){
            count++;
            int index = str.indexOf("hi");
            count(str.substring(index+2),count);
        }
        return count;
    }
}
