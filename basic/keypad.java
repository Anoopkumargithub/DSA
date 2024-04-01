package basic;

import java.util.*;

public class keypad {
    static String[] codes = {" ", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wx", "yz"};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        ArrayList<String> words = getKPC(str);
        System.out.println(words);
        System.out.println(words.size());
        sc.close();
    }

    public static ArrayList<String> getKPC(String str) {
        if (str.length() == 0) {
            ArrayList<String> baseResult = new ArrayList<>();
            baseResult.add("");
            return baseResult;
        }

        char ch = str.charAt(0);
        String restOfTheString = str.substring(1);

        ArrayList<String> recursionResult = getKPC(restOfTheString);
        ArrayList<String> myResult = new ArrayList<>();

        String codeForCh = codes[ch - '0'];
        for (int i = 0; i < codeForCh.length(); i++) {
            char cho = codeForCh.charAt(i);
            for (String rstr : recursionResult) {
                myResult.add(cho + rstr);
            }
        }

        return myResult;
    }
}