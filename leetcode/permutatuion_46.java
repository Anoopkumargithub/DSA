package leetcode;

import java.util.ArrayList;
import java.util.List;

public class permutatuion_46 {
    public static void main(String[] args) {
        int [] nums = {1,2,3};        
        List<Integer> list = new ArrayList<Integer>();
        List<List<Integer>> l1 = new ArrayList<List<Integer>>();
        permutatuion(nums,list,l1,0);
        System.out.println(l1);
    }

    private static void permutatuion(int[] nums, List<Integer> list, List<List<Integer>> l1, int lp) {
        if(list.size() == nums.length){
            l1.add(new ArrayList<>(list));
         } 
         else{
            for(int i = 0; i < nums.length; i++){ 

               if(list.contains(nums[i])) continue;

               list.add(nums[i]);
               permutatuion(nums, list, l1, lp);
               list.remove(list.size() - 1);
            }
         }
    }
}
