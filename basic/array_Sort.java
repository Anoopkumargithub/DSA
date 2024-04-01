package basic;

import java.util.Arrays;

public class array_Sort {
    public static void main(String[] args) {
        int[] arr = {9,6,4,98,4,2,0};
        Arrays.sort(arr);
        // int i = 0;
        for (int i : arr){
            System.out.print(i+" ");
        }
    }
}
