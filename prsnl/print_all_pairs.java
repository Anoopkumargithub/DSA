package prsnl;

public class print_all_pairs {
    public static void main(String[] args) {
        int[] arr ={1,2,3,4};
    int n = arr.length;
    pairs(arr,n);
    }

    private static void pairs(int[] arr, int n) {
        for(int i =0; i<n;i++){
            for(int j = i+1;j<n;j++){
                System.out.println("( "+arr[i]+", "+arr[j]+" )");
            }
            System.out.println();
        }
    }
}
