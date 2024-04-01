package prsnl;

public class print_subarray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int n = arr.length;
        subarray(arr,n);
    }

    private static void subarray(int[] arr, int n) {
        for(int i = 0;i<n;i++){
            for(int j = 0;j<n;j++){
                // System.out.print("( "+i+", "+j+" )");
                for(int k = i;k<=j;k++){
                    System.out.print(+arr[k] + ", ");
                }
                System.out.println();
            }
            // System.out.println();
        }
    }
}
