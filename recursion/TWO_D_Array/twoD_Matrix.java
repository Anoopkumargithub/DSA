package recursion.TWO_D_Array;

public class twoD_Matrix {
    public static void main(String[] args) {
        int[][] arr = new int[3][3];
        System.out.println(print(arr,0,0,""));
    }

    private static int print(int[][] arr, int row, int col, String ans) {
        if(row == 2 && col == 2){
            System.out.println(ans);
            return 1;
        }
        int a = 0;
        int b = 0;
        if(col<arr[0].length) {
            a = print(arr, row, col+1, ans+"H"); 
        }
        if(row<arr.length) {
            b = print(arr, row+1, col, ans+"V");         }
        return a+b;
    }
}
