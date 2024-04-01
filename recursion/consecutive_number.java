package recursion;

import java.util.Arrays;
import java.util.Scanner;

public class consecutive_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(longest(arr));
        sc.close();
    }

    public static int longest(int[] num) {
        if (num.length == 0) {
            return 0;
        }
        Arrays.sort(num);
        int max = 1;
        int count = 1;
        for (int i = 1; i < num.length; i++) {
            if (num[i] == num[i - 1] + 1) {
                count++;
                max = Math.max(max, count);
            } else if (num[i] != num[i - 1]) {
                count = 1;
            }
        }
        return max;
    }
}
