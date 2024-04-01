package hackerblocks;

import java.util.Scanner;

public class twins {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(twin(str, 0));
        sc.close();
    }

    private static int twin(String str, int i) {
        if (i >= str.length() - 2) {
            return 0;
        }
        if (str.charAt(i) == str.charAt(i + 2)) {
            return 1 + twin(str, i + 1);
        } else {
            return twin(str, i + 1);
        }
    }
}

