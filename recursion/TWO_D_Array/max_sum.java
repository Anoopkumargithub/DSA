package recursion.TWO_D_Array;

public class max_sum {
    static int answer = 0;
    public static void main(String[] args) {
        int[][] arr = { { 3, 4, 9 }, { 2, 1, 6 }, { 3, 7, 3 } };
        sum(arr, 0, 0, 0);
        System.out.println(answer);
    }

    public static void sum(int[][] arr, int i, int j, int ans) {
        if (i == 2 && j == 2) {
            ans = ans + arr[arr.length - 1][arr[0].length - 1];
            // System.out.println(ans);
            if(answer < ans ){
                answer = ans;
            }
            return;
        }
        if (j < arr[0].length - 1)
            sum(arr, i, j + 1, ans + arr[i][j]);
        if (i < arr.length - 1)
            sum(arr, i + 1, j, ans + arr[i][j]);
    }
}
