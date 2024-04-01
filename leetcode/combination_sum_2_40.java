package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class combination_sum_2_40 {
    public static void main(String[] args) {
        int[] candidates = { 1,1,2,2 };
        Arrays.sort(candidates);
        int target = 3;
        List<Integer> list = new ArrayList<Integer>();
        List<List<Integer>> l1 = new ArrayList<List<Integer>>();
        print(candidates, target, list, l1, 0);
        System.out.println(l1);

    }

    private static void print(int[] candidates, int target, List<Integer> list, List<List<Integer>> l1, int lp) {
        if (target == 0) {
            // if (!l1.contains(list))
                l1.add(new ArrayList<Integer>(list));
            return;
        }
        if (target < 0)
            return;

        for (int i = lp; i < candidates.length; i++) {
            if (i != lp && candidates[i] == candidates[i - 1])
                continue;
            list.add(candidates[i]);
            print(candidates, target - candidates[i], list, l1, i + 1);
            list.remove(list.size() - 1);

        }
    }
}
