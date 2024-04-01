package prsnl;

public class reverse_Array {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,60,70,80,90};
        int n = arr.length;
        System.out.println("original array: ");
        for(int i =0;i<n;i++){
            System.out.print(arr[i]+", ");
        }
        System.out.println( );
        reverse(arr,n);
        System.out.println("Reverse array: ");
        for(int i =0;i<n;i++){
            System.out.print(arr[i]+", ");
        }
    }

    private static void reverse(int[] arr, int n) {
        int s = 0;
        int e= n-1;
        while (s<e) {
            int temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;
            s +=1;
            e -=1;
        }
    }
}
