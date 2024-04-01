package leetcode;

public class n_queens_51 {
    public static void main(String[] args) {
        int n = 4;
        int[][] board = new int[n][n];
        print(board,n,0);
    }

    private static void print(int[][] board, int n,int row) {
        if(row == board.length){
            return;
        }
        if(n == 0) {
            display(board);
            return;
        }
        for(int col = 0; col<board[0].length;col++){
            if(isvalid(board, row, col)){
                board[row][col] = 1;
                print(board, n-1, row+1);
                board[row][col] = 0;
            }
        }
    }

    private static boolean isvalid(int[][] board, int row, int col) {
        int r = row;
        int c = col;
        while(r >= 0 && r < board.length){
            if(board[r][c] == 1) return false;
            c--;
            r++;
        }
        // col
        r = row;
        c = col;
        while (c >= 0 && c<board[0].length) {
            if(board[r][c] == 1)return false;
            r--;
            c++;
            
        }
        // left dia
        r = row;
        c = col;
        while(r>=0 && c>=0){
            if(board[r][c] == 1){
                return false;
            }
            r++;
            c++;
        }
        return true;
    }

    private static void display(int[][] board) {
        for(int i = 0;i<board.length;i++){
            for(int j = 0;j<board[0].length;j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }
}
