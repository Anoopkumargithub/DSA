package recursion.TWO_D_Array;

public class diagonal_path {
    static int count = 0;
    public static void main(String[] args) {
        int[][] arr = new int[3][3];
        print(arr, 0, 0);
        System.out.println(count);
    }

    private static void print(int[][] arr, int row, int col) {
        if (row == arr.length-1 && col == arr[0].length-1) {
            // System.out.println(ans);
            count++;
            return;
        }
        // int a = 0;
        // int b = 0;
        // int c = 0;
        // int d = 0;
        if (row < 0 || col < 0 || row == arr.length || col == arr[0].length || arr[row][col]==1){
            return;
        }
        int c[] = {0,1,0,-1};
        int r[] = {1,0,-1,0};
        arr[row][col] =1;
        for(int i = 0;i<r.length;i++){
            print(arr, row+r[i], col+c[i]);
        }
        arr[row][col] = 0;

        // if (arr[row][col] == 0) {
        //     arr[row][col] = 1;
        //     print(arr, row + 1, col, ans + "V");
        //     print(arr, row, col + 1, ans + "H");
        //     print(arr, row - 1, col, ans + "B");
        //     print(arr, row, col - 1, ans + "C");
        //     print(arr, row +1, col + 1, ans + "D1");
        //     print(arr, row -1, col + 1, ans + "D2");
        //     print(arr, row +1, col - 1, ans + "D3");
        //     print(arr, row -1, col - 1, ans + "D4");
        //     arr[row][col] = 0;
        // }

        
    }
}
