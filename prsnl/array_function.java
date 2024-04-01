package prsnl;

public class array_function {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6};
        System.out.println("In Main "+ arr.length);
        printarr(arr);
    }

    public static void printarr(int[] arr) {
        System.out.println("In Function " + arr.length);
    }
}
