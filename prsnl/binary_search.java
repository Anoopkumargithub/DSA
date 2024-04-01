package prsnl;

import java.util.Scanner;

public class binary_search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //sorted array require or monotonic
        int [] arr = {1,2,3,4,5,6,7,8,9};
        int n = arr.length;
        int key = sc.nextInt();
        int index = binary(arr,n,key);
        if(index == -1){
            System.out.println(key +" is not present.");
        }else{
            System.out.println(key+" is present at index "+ index);
        }
        sc.close();
    }

    static int binary(int[] arr, int n, int key) {
        int s = 0;
        int e = n-1;
        while (s<=e) {
            int mid = (s+e)/2;
            if(arr[mid] == key){
                return mid;
            }
            else if(arr[mid]>key){
                e = mid-1;
            }else{
                s = mid+1;
            }
        }
        return -1;
    }
}
