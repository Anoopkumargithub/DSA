package recursion.TWO_D_Array;

public class print_All_path {
    public static void main(String[] args) {
        int[][] arr = new int[3][3];
        System.out.println(print(arr,0,0,""));
    }

    private static int print(int[][] arr, int row, int col, String ans) {
        if(row == 2 && col == 2){
            System.out.println(ans);
            return 0;
        }  
        int a = 0;
        int b = 0;
        // by Loop
        for(int i = 0;i<arr[0].length;i++){
            for(int j = 0;j<arr.length;j++){
              a =   print(arr, row+i, col+j, ans);
            }
            b = b+a;
        }
        return b;


        // int a = 0;
        // int b = 0;
        // int c = 0;
        // int d = 0;



        // if(row<0 || col<0 || row == arr.length|| col == arr[0].length) return;

        // if(arr[row][col] ==0){
        //     arr[row][col] =1;
        //     // print(arr, row+1, col, ans+"V");
        //     // print(arr, row, col+1, ans+"H");
        //     // print(arr, row-1, col, ans+"B");
        //     // print(arr, row, col-1, ans+"C");       
        //     arr[row][col] = 0;
        // }
    }
}
