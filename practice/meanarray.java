package practice;

public class meanarray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println(mean(arr,0,arr.length));
    }

    private static int mean(int[] arr, int i,int n) {
        if(i==(n-1)){
            return arr[i]/n;
        }
        return (arr[i]/n +mean(arr, i+1,n));
    }    
}
