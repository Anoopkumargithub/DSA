package leetcode;

import java.util.Arrays;

public class height_checker_1051{
    public static void main(String[] args) {
        int count = 0;
        int[] heights = {1,1,4,2,1,3};
        int[] exp = new int[heights.length];
        for(int i = 0;i<heights.length;i++){
            exp[i] = heights[i];
        }
        Arrays.sort(exp);
        for(int i=0;i<heights.length;i++){
            if(exp[i] != heights[i]) count++;
        }
        System.out.println(count);
    }
}