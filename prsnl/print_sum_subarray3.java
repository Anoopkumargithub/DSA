package prsnl;

public class print_sum_subarray3 {
        // kadane's algorithm neglect -ve value
        public static void main(String[] args) {
            int[] arr = {-2,3,4,-1,5,-12,6,1,3};
            int n = arr.length;
            sum(arr,n);
        }
    
        private static void sum(int[] arr, int n) {
            int cs = 0;
            int lar = 0;
            for(int i= 0;i<n;i++){
                cs = cs + arr[i];
                if(cs<0){
                    cs = 0;
                }
                lar = Math.max(lar, cs);
            }
            System.out.println(lar);
        }    
}
