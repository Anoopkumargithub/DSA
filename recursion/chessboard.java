    package recursion;

import java.util.Scanner;

public class chessboard {


    // Take as input N, a number. N represents the size of a chess board. We’ve a piece standing in top-left corner and it must reach the bottom-right corner. The piece moves as follows –

// a. In any cell, the piece moves like a knight. But out of the possible 8 moves for a knight, only the positive ones are valid i.e. both row and column must increase in a move.

// b. On the walls (4 possible walls), the piece can move like a rook as well (in addition of knight moves). But, only the positive moves are allowed i.e. as a rook, piece can move any number of steps horizontally or vertically but in a manner, such that row or column must increase.

// c. On the diagonals (2 possible diagonals), the piece can move like a bishop as well (in addition to the knight and possibly rook moves). But, only the positive moves are allowed i.e. as a bishop, piece can move in a way such that row and column must increase.

// You are supposed to write the following functions

// a. Write a recursive function which prints all valid paths.

// b. Write a recursive function which returns the count of different distinct ways this board can be crossed. Print the value returned.

    // static int count;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] board = new int[n][n];
        int[] ans = {0}; 
        print(board,0,0,ans,"");
        System.out.println();
        System.out.println(ans[0]); 
        sc.close();
    }
    

    private static void print(int[][] board, int row, int col,int[] ans,String path) {
        path = path + "{"+col+"-"+row+"}";
        if(row >= board.length || col >= board[0].length){
            return;
        }

        if(row == board.length-1 && col == board[0].length-1){
            System.out.print(path+" ");
            // count++;
            ans[0] = ans[0] + 1;
            return;
        }


        // Knight
        int[] r = {2,1};
        int[] c = {1,2};
        for(int i = 0;i<c.length;i++){
            print(board,row+r[i], col + c[i],ans,path+"K");
        }
        

        // Rook
        if( row==0 || row == board.length-1 || col == 0 || col == board[0].length-1 ){
            for(int i = 1;i<board.length;i++){
                print(board, row+i, col,ans,path+"R");
            }
            for(int i = 1;i<board[0].length;i++){
                print(board, row, col+i,ans,path+"R");
            }
        }

        //Bishop
        if(row == col || row+col == board.length-1){
            for(int i = 1;i<board.length;i++){
                print(board, row+i, col+i,ans,path+"B");
            }
        }
    }
}
