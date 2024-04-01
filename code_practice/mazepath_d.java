// Take as input N1 and N2, both numbers. N1 and N2 is the number of rows and columns on a rectangular board. Our player starts in top-left corner of the board and must reach bottom-right corner. In one move the player can move 1 step horizontally (right) or 1 step vertically (down) or 1 step diagonally (south-east).

// Write a recursive function which:
// a. Returns the count of different ways the player can travel across the board. Print the value returned.
// b. Prints moves for all valid paths across the board.

// Input Format
// Enter the number of rows N1 and number of columns N2

// Constraints
// None

// Output Format
// Display the total number of paths and print all the possible paths in a space separated manner

// Sample Input
// 3
// 3
// Sample Output
// VVHH VHVH VHHV VHD VDH HVVH HVHV HVD HHVV HDV DVH DHV DD
// 13

package code_practice;

import java.util.Scanner;

public class mazepath_d {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt(); // rows
        int n2 = sc.nextInt(); // cols
        int[][] board = new int[n1][n2];
        maze(board, 0, 0, "");
        sc.close();
    }

    private static void maze(int[][] board, int row, int col, String ans) {
        if (row == board.length - 1 && col == board[0].length - 1) {
            System.out.println(ans + " ");
            return;
        }
        if (col < board[0].length) {
            maze(board, row, col + 1, ans + "V");
        }
        if (row < board.length) {
            maze(board, row + 1, col, ans + "H");
        }
        if (row < board.length && col<board[0].length) {
            maze(board, row + 1, col+1, ans + "D");
        }
    }
}