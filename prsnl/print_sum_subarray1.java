package prsnl;

public class print_sum_subarray1 {
    //Brute force approach O(N^3)
    public static void main(String[] args) {
        int[] arr = {-2,3,4,-1,5,-12,6,1,3};
        int n = arr.length;
        sum(arr,n);
    }

    private static void sum(int[] arr, int n) {
        int lar_sum = 0;
        for(int i = 0;i<n;i++){
            for(int j = i;j<n;j++){
                int sum = 0;
                for(int k = i;k<j;k++){
                    sum += arr[k];
                }
                lar_sum = Math.max(lar_sum,sum);
            }
        }
        System.out.println(lar_sum);
    }
}
