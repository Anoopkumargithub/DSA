package recursion.TWO_D_Array;

public class min_path_sum {
    static int count = Integer.MAX_VALUE;
    public static void main(String[] args) {
        int[][] arr = {{0,1},{1,0}};
        System.out.println(minPathSum(arr));;
    }
    public static int minPathSum(int[][] grid) {
        if(grid[0].length ==1 && grid.length == 1)return grid[0][0];
        return print(grid,0,0,0);
    }
    public static int print(int[][]grid,int row, int col,int sum){
        if(row == grid.length-1 && col == grid[0].length-1){
            if(count >sum){ 
                count = sum;
                sum = 0;
            }
            return 1;
        }
            if(col < grid[0].length-1){
                print(grid, row,col+1,sum + grid[row][col]);
            }
            if(row<grid.length-1){
                print(grid,row+1,col,sum + grid[row][col]);
            }
            return count+grid[grid.length-1][grid[0].length-1];
    }
}
