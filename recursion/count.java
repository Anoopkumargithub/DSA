package recursion;

public class count {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 3, 2, 1, 5, 6};
        int val = 3;
        System.out.println(indx(arr, val, 0, 0));
    }
    public static int indx(int[] arr, int val, int index, int c){
        if (index == arr.length) {
            return c;
        }
        if(arr[index]==val){
            c++;
        }
        return indx(arr, val, index + 1, c);
               
    }
}
