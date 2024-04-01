package leetcode;

public class add_sum_258 {
    static int ans = 0;
    public static void main(String[] args) {
        int num = 121;
        sum(num);
    }

    private static void sum(int num) {
        while (num != 0) {
            int rem = num % 10;
            ans = ans + rem;
            num = num / 10;
        }
        if (ans < 9) {
            System.out.println(ans);
        } else {
            sum(ans);
        }
    }
}
