package leetcode;

import java.util.ArrayList;
import java.util.List;

public class combination_sum_39 {
    public static void main(String[] args) {
        int [] candidates = {2,3,6,7};
        int target = 7;
        List <Integer> list = new ArrayList<Integer>();
        List <List<Integer>> l1 = new ArrayList<List<Integer>>();
        print(candidates,target,list,l1,0);
        // System.out.println();
        System.out.println(l1);

    }

    private static void print(int[] candidates, int target, List<Integer> list, List<List<Integer>> l1,int lp) {
        if(target ==0 ){
        // System.out.println(list);
        l1.add(new ArrayList<Integer>(list));
}
        if(target<0) return;


        for(int i = lp;i<candidates.length;i++){
            list.add(candidates[i]);
            print(candidates, target-candidates[i], list, l1,i);
            list.remove(list.size() -1);

        }
    }
}
