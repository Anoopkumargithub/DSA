package hackerblocks;

import java.util.Scanner;

// public class first_index {
//     public static void main(String args[]) {
//         // Your Code Here
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int[] arr = new int[n];
//         // input array
//         for (int i = 0; i < n; i++) {
//             arr[i] = sc.nextInt();
//         }

//         int m = sc.nextInt();
//         System.out.println(first(arr,0,m));
//         sc.close();
//     }

//     private static int first(int[] arr,int index, int m) {
//         if(index == arr.length){
//             return -1;
//         }
//         if(arr[index] == m){
//             return index;
//         }else{
//             first(arr,index+1,m);
//             return -1;
//         }

//     }
// }
public class first_index {
    public static void main(String args[]) {
        // Your Code Here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        // input array
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int m = sc.nextInt();
        System.out.println(first(arr,0,m));
        sc.close();
    }

    private static int first(int[] arr,int index, int m) {
        if(index == arr.length){
            return -1;
        }
        if(arr[index] == m){
            return index;
        }
            return first(arr,index+1,m);
    }
}