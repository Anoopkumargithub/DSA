package practice;

public class printelementofarray {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7,8,9,0};
        System.out.println("1 to N");
        print_1ton(arr,arr.length);
        System.out.println("N to 1");
        print_nto1(arr, arr.length);
    }
    // 1 to n

    public static void print_1ton(int[] arr, int n) {
        if(n<0){
            return;
        }
        print_1ton(arr, n-1);
        System.out.println(arr[n]);
    }

    // n to 1
    public static void print_nto1(int[] arr, int n) {
        if(n<0){
            return;
        }
        System.out.println(arr[n-1]);
        print_nto1(arr, n-1);
    }

}
