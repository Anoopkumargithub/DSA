package recursion;

import java.util.ArrayList;

public class permutationinarray {
    public static void main(String[] args) {
        int [] arr = {1,2,3};
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        print(arr,list,ans);
    }

    private static void print(int[] arr, ArrayList<Integer> list, ArrayList<ArrayList<Integer>> ans) {
        if(list.size()==3){
            System.out.println(list);
            ans.add(list);
            return;
        }
        for(int i = 0;i<arr.length;i++){

            list.add(arr[i]);
            int k = arr[i];
            arr[i] = '*';
            print(arr,list,ans);
            arr[i] =k;
            list.remove(list.size()-1);
        }
    }
}
