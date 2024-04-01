package prsnl;

public class print_sum_subarray2 {
    // prefix approach O(N^2)
    public static void main(String[] args) {
        int[] arr = {-2,3,4,-1,5,-12,6,1,3};
        int n = arr.length;
        sum(arr,n);
    }

    private static void sum(int[] arr, int n) {
        int[] prefix = new int[n];
        prefix[0] = arr[0];
        for(int i=1;i<n;i++){
            prefix[i] = prefix[i-1]+ arr[i];
        }
        int lar_sum = 0;
        for(int i = 0;i<n;i++){
            for(int j = i;j<n;j++){
                int subarraySum = i>0 ? prefix[j] - prefix[i-1] : prefix[j];
                lar_sum = Math.max(lar_sum,subarraySum);
            }
        }
        System.out.println(lar_sum);
    }
}
