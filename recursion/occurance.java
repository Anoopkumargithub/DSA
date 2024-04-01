package recursion;

public class occurance {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,3,2,1,5,6};
        int val = 4;
        System.out.println(find(arr,val,0));
    }
    static int find (int[]arr,int val,int index){
        if(arr[index]==val){
            return index;
        }
        return find(arr, val, index+1);
        
        
    }
}
