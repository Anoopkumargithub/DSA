package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class subset_78 {
    public static void main(String[] args) {
        int[] num = {1,2,2};
        Arrays.sort(num);
        List <Integer> list = new ArrayList <Integer>();
        List <List<Integer>> l1 = new ArrayList <List<Integer>>();
        sub(num,list,l1,0);
        System.out.println(l1);
    }

    private static void sub(int[] num, List<Integer> list, List<List<Integer>> l1, int lp) {
        l1.add(new ArrayList<>(list));
        for(int i = lp;i<num.length;i++){
            if (i>lp && num[i]== num[i-1]) continue;

            list.add(num[i]);
            sub(num, list, l1, i+1);
            list.remove(list.size()-1);
        }
    }
}






// if(num.isEmpty()){
//     l1.add(b);
//     // System.out.println(l1n);
//     // list.add(new ArrayList<>(l1));
//     return;
// }
// char ch =  num.charAt(0);
// sub(num.substring(1),b,l1,list);
// sub(num.substring(1),b+ch,l1,list);