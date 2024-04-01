// Take as input str, a string. str represents keys pressed on a nokia phone keypad. We are concerned with all possible words that can be written with the pressed keys.

// Assume the following alphabets on the keys: 1 -> abc , 2 -> def , 3 -> ghi , 4 -> jkl , 5 -> mno , 6 -> pqrs , 7 -> tuv , 8 -> wx , 9 -> yz

// E.g. “12” can produce following words “ad”, “ae”, “af”, “bd”, “be”, “bf”, “cd”, “ce”, “cf”

// a. Write a recursive function which returns the count of words for a given keypad string. Print the value returned.

// b.Write a recursive function which prints all possible words for a given keypad string (void is the return type for function).

// Input Format
// Single line input containing a single integer.

// Constraints
// 1 <= Length of string <= 10^3

// Output Format
// Print all the words in a space separated manner. Also print the count of these numbers in next line.

// Sample Input
// 12
// Sample Output
// ad ae af bd be bf cd ce cf
// 9
// Explanation
// 1 can correspond to 'a' , 'b' or 'c' .
// 2 can correspond to 'd', 'e' or 'f'.
// We print all combinations of these

package code_practice;

import java.util.Scanner;

public class keypad {
    static String[] key = {"","abc","def","ghi","jkl","mno","pqrs","tuv","wx","yz"};
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        print(str,key,"");
        sc.close();
    }
    private static void print(String digits,String[] arr, String ans) {
		if (digits.length()==0)
		{
			System.out.println(ans);
			return;
		}
		char ch = digits.charAt(0);
		int k= ch-48;
		String a= arr[k];
		
		for (int i=0; i<a.length(); i++)
		{
			print(digits.substring(1), arr, ans+a.charAt(i));
		}
		
	}

}
