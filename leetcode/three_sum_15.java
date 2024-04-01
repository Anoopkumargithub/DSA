package leetcode;

import java.util.ArrayList;
import java.util.List;

public class three_sum_15 {
    public static void main(String[] args) {
        int[] nums = { -1, 0, 1, 2, -1, -4 };
        ArrayList<Integer> list = new ArrayList<Integer>();
        ArrayList<List<Integer>> l1 = new ArrayList<List<Integer>>();
        print(nums, list, l1);
        // System.out.println(l1);
    }

    private static void print(int[] nums, ArrayList<Integer> list, ArrayList<List<Integer>> l1) {
        if(list.size()==3){
            System.out.println(list);
            l1.add(list);
            System.out.println(l1);
        }
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                for (int k = 0; k < nums.length; k++) {
                    if ((i != j) && (i != k) && (j != k)) {
                        if (nums[i] + nums[j] + nums[k] == 0) {
                            list.add(nums[i]);
                            list.add(nums[j]);
                            list.add(nums[k]);
                        }
                    }
                }
            }
        }
    }
}
