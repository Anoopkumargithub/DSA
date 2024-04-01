package basic;

import java.util.*;

public class dict_larg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        String sorted = new String(chars);
        permute(sorted, "", str);
        sc.close();
    }

    private static void permute(String ques, String ans, String comp) {
        if (ques.length() == 0) {
            if (ans.compareTo(comp) > 0) {
                System.out.println(ans);
            }
            return;
        }

        for (int i = ques.length() - 1; i >= 0; i--) {
            char ch = ques.charAt(i);
            String roq = ques.substring(0, i) + ques.substring(i + 1);
            permute(roq, ans + ch, comp);
        }
    }
}