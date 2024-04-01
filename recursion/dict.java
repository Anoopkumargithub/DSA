package recursion;

// import java.util.Scanner;

// public class dict {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String s = sc.next();
//         dictt(s,"",s.length());
//         sc.close();
//     }

//     private static void dictt(String s, String ans, int l) {
//         if(l == ans.length()){
//             System.out.println(ans);
//             return;
//         }int i =0;
//         if(i<0) return;
//         for (i = 0;i<s.length()-1;i++){
//             char ch = s.charAt(i);
//             dictt(s.substring(0, i)+s.substring(i+1), ans+ch, l);
//         }
//     }
// }
import java.util.*;

public class dict {
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
            if (ans.compareTo(comp) < 0) {
                System.out.println(ans);
            }
            return;
        }

        for (int i = 0; i < ques.length(); i++) {
            char ch = ques.charAt(i);
            String roq = ques.substring(0, i) + ques.substring(i + 1);
            permute(roq, ans + ch, comp);
        }
    }
}