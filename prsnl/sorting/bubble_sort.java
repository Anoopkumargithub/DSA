package prsnl.sorting;

public class bubble_sort {
    public static void main(String[] args) {
        int [] arr = {9,8,7,6,5,4,3,5,2,1};
        int n = arr.length;
        sort(arr,n);
        for(int i :arr){
            System.out.print(i+", ");
        }
    }

    private static void sort(int[] arr, int n) {
        for(int i = 0;i<=n-1;i++){
            for(int j = 0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}
