package recursion;

import java.util.*;

public class dict_samll {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        ArrayList<String> result = new ArrayList<>();
        permute(str, 0, str.length() - 1, result);
        Collections.sort(result);
        for (String s : result) {
            if (s.compareTo(str) < 0) {
                System.out.println(s);
            }
            sc.close();
        }
    }

    private static void permute(String str, int l, int r, ArrayList<String> result) {
        if (l == r) {
            result.add(str);
        } else {
            for (int i = l; i <= r; i++) {
                str = swap(str, l, i);
                permute(str, l + 1, r, result);
                str = swap(str, l, i);
            }
        }
    }

    private static String swap(String str, int i, int j) {
        char[] charArray = str.toCharArray();
        char temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }
}