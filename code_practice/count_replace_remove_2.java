// Take as input str, a string.

// a.) Write a recursive function which counts the number of times ‘hi’ appears in the string – but skip all such ‘hi’ which are followed by ‘t’ to form ‘hit’. Print the value returned.

// b.) Write a recursive function which removes all ‘hi’ in the string – but skip all such ‘hi’ which are followed by ‘t’ to form ‘hit’. Print the value returned.

// c.) Write a recursive function which replaces all ‘hi’ in the string with ‘bye’ – but skip all such ‘hi’ which are followed by ‘t’ to form ‘hit’. Print the value returned.

// Input Format
// Enter the String

// Constraints
// None

// Output Format
// Display the total no.of ''hi'' (''hi'' should not be followed by a 't'), string in which all ''hi'' are removes(''hi'' should not be followed by a 't'), string in which all ''hi'' are replace by ''bye''(''hi'' should not be followed by a 't')

// Sample Input
// abchihitfhi
// Sample Output
// 2
// abchitf
// abcbyehitfbye

package code_practice;

import java.util.Scanner;

public class count_replace_remove_2 {
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
            if(index+2 < str.length() && str.charAt(index+2) == 't'){
            return str.substring(0, index+2)+ replace(str.substring(index+2));
        }else{
            return replace(str.substring(0,index)+"bye"+str.substring(index+2));
        }
        }
        return str;
    }

    private static String remove(String str) {
        if(str.contains("hi")){
            int index  = str.indexOf("hi");
            if(index+2 < str.length() && str.charAt(index+2) == 't'){
            return str.substring(0, index+2)+ remove(str.substring(index+2));
        }else{
            return remove(str.substring(0,index)+str.substring(index+2));
        }
        }
        return str;
    }

    private static int count(String str,int count) {
        if(str.contains("hi")){
            int index = str.indexOf("hi");
            if(index+2 < str.length() && str.charAt(index+2) == 't'){
               return count(str.substring(index+2),count);
            }else{
                count++;
               return count(str.substring(index+2),count);
            }
        }
        return count;
    }
}
